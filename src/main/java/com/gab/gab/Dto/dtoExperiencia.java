/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gab.gab.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author gabyp
 */
public class dtoExperiencia {
    @NotBlank
    private String nombreEmp;
    @NotBlank
    private String descEmp;
    
    // Constructor

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreEmp, String descEmp) {
        this.nombreEmp = nombreEmp;
        this.descEmp = descEmp;
    }

    public String getNombreEmp() {
        return nombreEmp;
    }

    public void setNombreEmp(String nombreEmp) {
        this.nombreEmp = nombreEmp;
    }

    public String getDescEmp() {
        return descEmp;
    }

    public void setDescEmp(String descEmp) {
        this.descEmp = descEmp;
    }
    
}
