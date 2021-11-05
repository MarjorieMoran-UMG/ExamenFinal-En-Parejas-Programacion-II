/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.gt.EjemploBoot.servicio;

import com.edu.gt.EjemploBoot.MdProfesion;
import java.util.List;

/**
 *
 * @author Edwar Alejandro
 */
public interface ProfesionService {
    public List<MdProfesion>listarProfesion();
    public void guardarprofesion(MdProfesion profesion);
     public void eliminar(MdProfesion profesion);
     public MdProfesion encontrarProfesion(MdProfesion profesion);
}
