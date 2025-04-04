package org.albertoangelesdoc.pixup.model;

import java.io.Serializable;

public class Municipio extends Catalogo implements Serializable {
    private String nombre;
    private Estado estado;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Municipio{" +
                "nombre='" + nombre + '\'' +
                ", estado=" + estado +
                ", id=" + id +
                '}';
    }
}
