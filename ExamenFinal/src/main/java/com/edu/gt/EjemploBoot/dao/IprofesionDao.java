/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.gt.EjemploBoot.dao;
import com.edu.gt.EjemploBoot.MdProfesion;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Edwar Alejandro
 */
public interface IprofesionDao extends  CrudRepository<MdProfesion, Long> {
    
}
