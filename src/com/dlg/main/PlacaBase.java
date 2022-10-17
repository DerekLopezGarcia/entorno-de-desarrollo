package com.dlg.main;

public class PlacaBase { private Integer id;
    private String marca;
    private String modelo;
    private String tipo;

    public Integer getId(){
        return  id;
    }
    public String getMarca(){return marca;}
    public String getModelo(){return modelo;}
    public String getTipo(){return tipo;}

    public void setId(Integer id) {
        this.id = id;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
