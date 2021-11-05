/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.gt.EjemploBoot;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Edwar Alejandro
 */
@Data
@Entity
@Table(name = "tb_profesion")
public class MdProfesion implements Serializable{
     private  static final long seialVersionUTD=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id_profesion;
    private String descripcion_profesion;
    
}
