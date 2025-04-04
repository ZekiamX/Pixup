package org.albertoangelesdoc.pixup.model;

import java.io.Serializable;

public class Colonia extends Catalogo implements Serializable {

    private String nombre;
    private String cp;
    private Municipio municipio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    @Override
    public String toString() {
        return "Colonia{" +
                "id=" + getId() +
                ", nombre='" + nombre + '\'' +
                ", cp='" + cp + '\'' +
                ", municipio=" + (municipio != null ? municipio.getNombre() : "N/A") +
                '}';
    }
}
