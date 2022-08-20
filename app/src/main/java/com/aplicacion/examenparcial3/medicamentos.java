package com.aplicacion.examenparcial3;

public class medicamentos {

    public String descripcion;
    public int cantidad;
    public String tiempo ;
    public int periocidad;

    public medicamentos() {
    }

    public medicamentos(String descripcion, int cantidad, String tiempo, int periocidad) {
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.tiempo = tiempo;
        this.periocidad = periocidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public int getPeriocidad() {
        return periocidad;
    }

    public void setPeriocidad(int periocidad) {
        this.periocidad = periocidad;
    }
}
