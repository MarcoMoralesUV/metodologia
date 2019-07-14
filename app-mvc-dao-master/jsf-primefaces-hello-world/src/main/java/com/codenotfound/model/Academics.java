package com.codenotfound.model;

public class Academics {
    private String nombre;
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase();
    }
}
