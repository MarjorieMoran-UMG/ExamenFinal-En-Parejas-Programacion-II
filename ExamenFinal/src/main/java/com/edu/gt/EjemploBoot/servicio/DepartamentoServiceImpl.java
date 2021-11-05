/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.gt.EjemploBoot.servicio;

import com.edu.gt.EjemploBoot.MdDepartamento;
import com.edu.gt.EjemploBoot.dao.IdepartamentoDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Edwar Alejandro
 */
@Service
public class DepartamentoServiceImpl implements DepartamentoService{
   @Autowired 
   private IdepartamentoDao idepartamentoDao;
   
    @Override
     @Transactional(readOnly = true)
    public List<MdDepartamento> listarDepartamentos() {
        return (List<MdDepartamento>) idepartamentoDao.findAll();
    }
}
