/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Repositorio;

import org.springframework.stereotype.Repository;
import com.example.demo.Modelo.Computer;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.Interface.ComputerInterface;
/**
 *
 * @author USUARIO
 */

@Repository

public class ComputerRepository {
     @Autowired
    private ComputerInterface extencionesCrud;
    
    public List<Computer> getAll(){
        return (List<Computer>) extencionesCrud.findAll();
    }
    
    public Optional<Computer> getComputer(int id){
        return extencionesCrud.findById(id);
    }
    
    public Computer save(Computer computer){
        return extencionesCrud.save(computer);
    }
    
         public void delete(Computer computer){
        extencionesCrud.delete(computer);
    }
}
