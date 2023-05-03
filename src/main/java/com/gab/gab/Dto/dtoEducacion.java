/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gab.gab.Dto;

import javax.validation.constraints.NotBlank;

public class dtoEducacion {
    @NotBlank
    private String nombreEsc;
    @NotBlank
    private String descEsc;

    public dtoEducacion() {
    }

    public dtoEducacion(String nombreEsc, String descEsc) {
        this.nombreEsc = nombreEsc;
        this.descEsc = descEsc;
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