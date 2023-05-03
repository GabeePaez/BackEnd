/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gab.gab.Service;

import com.gab.gab.Entity.Experiencia;
import com.gab.gab.Repository.RExperiencia;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author gabyp
 */
@Service
@Transactional
public class SExperiencia {
     @Autowired
     RExperiencia rExperiencia;
     
     public List<Experiencia> list(){
         return rExperiencia.findAll();
     }
     
     public Optional<Experiencia> getOne(int id){
         return rExperiencia.findById(id);
     }
     
     public Optional<Experiencia> getByNombreEmp(String nombreEmp){
         return rExperiencia.findByNombreEmp(nombreEmp);
     }
     
     public void save(Experiencia expe){
         rExperiencia.save(expe);
     }
     
     public void delete(int id){
         rExperiencia.deleteById(id);
     }
     
     public boolean existsById(int id){
         return rExperiencia.existsById(id);
     }
     
     public boolean existsByNombreEmp(String nombreEmp){
         return rExperiencia.existsByNombreEmp(nombreEmp);
     }
}
