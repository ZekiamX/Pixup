package org.albertoangelesdoc.pixup.model;


public class Disquera extends Catalogo {

    private String disquera;

    public Disquera() {
    }

    public Disquera(String disquera) {
        this.disquera = disquera;
    }

    public String getDisquera() {
        return disquera;
    }

    public void setDisquera(String disquera) {
        this.disquera = disquera;
    }

    @Override
    public String toString() {
        return "Artista{" +
                "artista='" + disquera + '\'' +
                ", id=" + id +
                '}';
    }
}
