/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gab.gab.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreEsc;
    private String descEsc;

    public Educacion() {
    }

    public Educacion(String nombreEsc, String descEsc) {
        this.nombreEsc = nombreEsc;
        this.descEsc = descEsc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreEsc() {
        return nombreEsc;
    }

    public void setNombreEsc(String nombreEsc) {
        this.nombreEsc = nombreEsc;
    }

    public String getDescEsc() {
        return descEsc;
    }

    public void setDescEsc(String descEsc) {
        this.descEsc = descEsc;
    }
    
    
}
