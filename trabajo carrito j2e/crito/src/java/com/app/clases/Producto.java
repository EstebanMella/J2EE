/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.clases;

public class Producto {
 
private int id;
private String nombre;
private int precio;

public int getId() {
return id;
}
public void setId(int id) {
    this.id = id;
}
public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public double getPrecio() {
    return precio;
}
public void setPrecio(int precio) {
    this.precio = precio;
}
public Producto(int id, String nombre,int precio) {
    this.id = id;
    this.nombre = nombre;;
    this.precio = precio;
}

 
}
