package com.iesam.Restaurante.Presentation;

import com.iesam.Restaurante.Domain.Models.*;

public class Main {
    public static void main(String[] args) {


        //Barbacoa
        Barbacoa barbacoa = new Barbacoa();
        barbacoa.setIdPizza(1);
        barbacoa.setNombrePizza("Campesina");
        barbacoa.setSalsa("MAyonersa");
        barbacoa.setExtras("carne");
        barbacoa.setPicante(false);

        //Carbonara
        Carbonara carbonara = new Carbonara();
        carbonara.setIdPizza(1);
        carbonara.setNombrePizza("Campesina");
        carbonara.setSalsa("MAyonersa");
        carbonara.setExtras("cebolla");
        carbonara.setQueso_azul(false);
        carbonara.setQueso_cabra(false);

        //Campera
        Campera campera = new Campera();
        campera.setIdPizza(1);
        campera.setNombrePizza("Campesina");
        campera.setSalsa("MAyonersa");
        campera.setExtras("cebolla");
        campera.setCarne(true);



        //horno
        Horno horno = new Horno();
        horno.setId(5);
        horno.setMarca("YEA");
        horno.setNombre("hornoB");
        horno.setTemperatura("300º");
        horno.setIdPizza(1);



    }
}