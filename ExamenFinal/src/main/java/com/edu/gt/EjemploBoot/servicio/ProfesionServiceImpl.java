/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.gt.EjemploBoot.servicio;

import com.edu.gt.EjemploBoot.MdProfesion;
import com.edu.gt.EjemploBoot.dao.IprofesionDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Edwar Alejandro
 */
@Service
public class ProfesionServiceImpl implements ProfesionService {
     @Autowired
     private IprofesionDao iprofesionDao;

    @Override
    @Transactional(readOnly = true)
    public List<MdProfesion> listarProfesion() {
        return (List<MdProfesion>) iprofesionDao.findAll();
    }

    @Override
    @Transactional
    public void guardarprofesion(MdProfesion profesion) {
       iprofesionDao.save(profesion);
    }

    @Override
    @Transactional
    public void eliminar(MdProfesion profesion) {
        iprofesionDao.delete(profesion);
    }

    @Override
    @Transactional(readOnly = true)
    public MdProfesion encontrarProfesion(MdProfesion profesion) {
       return iprofesionDao.findById(profesion.getId_profesion()).orElse(null);
    }
     
    
}
