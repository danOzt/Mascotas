package com.zt.dano.mascotas;

/**
 * Created by dano on 29/05/16.
 */
public class Mascota {
    private String especie;
    private String nombre;
    private  int foto;


    public Mascota(String especie, String nombre, int foto) {
        this.especie = especie;
        this.nombre = nombre;
        this.foto = foto;
    }



    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }







}
