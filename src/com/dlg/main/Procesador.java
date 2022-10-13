package com.dlg.main;

import java.util.SplittableRandom;

/**
* Clase Procesador
*/
public class Procesador {

    /**
     * Atributos, porpiedades, variables
     */
    private Integer id;
    private String marca;
    private String fabricante;

    /**
     * metodos funciones comportamiento
     */
    public Integer getId(){
        return  id;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getFabricante(){
        return fabricante;
    }
    public void setFabricante(String Fabricante){
        this.fabricante = Fabricante;
    }
}
