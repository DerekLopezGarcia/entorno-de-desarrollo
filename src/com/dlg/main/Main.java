package com.dlg.main;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Iniciando...");
        Procesador amd = new Procesador();
        amd.setId(1);
        amd.setFabricante("AMD");
        amd.setMarca("Ryzen 7 5800x");

        System.out.println(amd.getFabricante());
        System.out.println(amd.getMarca());

        PlacaBase asus = new PlacaBase();
        asus.setId(1);
        asus.setModelo("B660 gaming plus");
        asus.setMarca("Asus TUFF");
        asus.setTipo("ATX");

        System.out.println(asus.getMarca());
        System.out.println(asus.getModelo());
        System.out.println(asus.getTipo());

        MemoriaRAM Gskill = new MemoriaRAM();
        Gskill.setId(1);
        Gskill.setModelo("Trident Z RGB DDR4 3200Hz");
        Gskill.setMarca("G.Skill");

        System.out.println(Gskill.getModelo());
        System.out.println(Gskill.getMarca());
    }
}