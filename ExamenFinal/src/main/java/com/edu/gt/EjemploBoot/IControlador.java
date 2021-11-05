/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.gt.EjemploBoot;

import com.edu.gt.EjemploBoot.servicio.DepartamentoService;
import com.edu.gt.EjemploBoot.servicio.ProfesionService;
import com.edu.gt.EjemploBoot.servicio.UsuarioService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Edwar Alejandro
 */
@Controller
@Slf4j
public class IControlador {

    @Autowired
    private UsuarioService usuarioService;
    @Autowired
    private DepartamentoService departamentoService;
    @Autowired
    private ProfesionService profesionService;

    @GetMapping("/")
    public String inicio(Model modelo) {
        var Usuarios = usuarioService.listarUsuarios();
        modelo.addAttribute("usuario", Usuarios);
        var departamentos = departamentoService.listarDepartamentos();
        modelo.addAttribute("dep", departamentos);
        var profesiones = profesionService.listarProfesion();
        modelo.addAttribute("prof", profesiones);
        return "index";
    }

    @GetMapping("/agregar")
    public String agregar(MdUsuario usuario, Model modelo) {
        var departamentos = departamentoService.listarDepartamentos();
        modelo.addAttribute("dep", departamentos);
        var profesiones = profesionService.listarProfesion();
        modelo.addAttribute("rof", profesiones);
        modelo.addAttribute("separador", "-");
        return "InsertUsuario";
    }

    @GetMapping("/agregar2")
    public String agregar2(MdProfesion profesion) {
        return "InsertProfesion";
    }

    @PostMapping("guardar")
    public String guardar(MdUsuario usuario) {
        usuarioService.guardarusuario(usuario);
        return "redirect:/";
    }

    @PostMapping("guardar2")
    public String guardar(MdProfesion profesion) {
        profesionService.guardarprofesion(profesion);
        return "redirect:/";
    }

    @GetMapping("/eliminar/{id_usuario}")
    public String eliminar(MdUsuario usuario) {
        usuarioService.eliminar(usuario);
        return "redirect:/";
    }

    @GetMapping("/eliminar2/{id_profesion}")
    public String eliminar(MdProfesion profesion) {
        profesionService.eliminar(profesion);
        return "redirect:/";
    }

    @GetMapping("/editar/{id_usuario}")
    public String editar(MdUsuario usuario, Model model) {
        usuario = usuarioService.encontraUsuario(usuario);
        model.addAttribute("usuario", usuario);
        var departamentos=departamentoService.listarDepartamentos();
        model.addAttribute("departamento",departamentos);
        model.addAttribute("separador", "-");
        var profesion=profesionService.listarProfesion();
        model.addAttribute("profesiones",profesion);
        return "UpUsuario";
    }

    @GetMapping("/editar2/{id_profesion}")
    public String editar(MdProfesion profesion, Model model) {
        profesion = profesionService.encontrarProfesion(profesion);
        model.addAttribute("profesion", profesion);
        return "UpProfesion";
    }

}
