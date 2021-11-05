/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.gt.EjemploBoot.servicio;

import com.edu.gt.EjemploBoot.MdUsuario;
import com.edu.gt.EjemploBoot.dao.IusuarioDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Edwar Alejandro
 */
@Service
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    private IusuarioDao iusuarioDao;
  
    
    @Override
    @Transactional(readOnly = true)
    public List<MdUsuario> listarUsuarios() {
        return (List<MdUsuario>) iusuarioDao.findAll();
    }

    @Override
    @Transactional
    public void guardarusuario(MdUsuario usuario) {
       iusuarioDao.save(usuario);
    }

    @Override
    @Transactional
    public void eliminar(MdUsuario usuario) {
       iusuarioDao.delete(usuario);
    }

    @Override
    @Transactional(readOnly = true)
    public MdUsuario encontraUsuario(MdUsuario usuario) {
        return  iusuarioDao.findById(usuario.getId_usuario()).orElse(null);
    }

   
    
}
