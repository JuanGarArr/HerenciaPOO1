package com.iesam.Restaurante.Domain.Models;

public class Horno extends Pizzas {

    private Integer id;
    private String nombre;
    private String marca;
    private String temperatura;
    private Pizzas pizzas;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public Pizzas getPizzasCampera(Campera campera) {
        return campera;
    }
    public Pizzas getPizzasBarbacoa(Barbacoa barbacoa) {
        return barbacoa;
    }
    public Pizzas getPizzasCarbonara(Carbonara carbonara) {
        return carbonara;
    }


}
