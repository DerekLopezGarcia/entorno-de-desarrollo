package com.dlg.main;

import java.security.PrivateKey;

public class MemoriaRAM {
    private Integer Id;
    private String Marca;
    private String Modelo;

    public void setMarca(String marca) {
        Marca = marca;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public void setModelo(String modelo) {
        this.Modelo = modelo;
    }

    public Integer getId() {
        return Id;
    }

    public String getMarca() {
        return Marca;
    }

    public String getModelo() {
        return Modelo;
    }
}
