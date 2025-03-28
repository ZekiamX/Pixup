package org.albertocruz.model;

public enum TipoLocalidad {
    ESTADO(1),
    MUNICIPIO(2),
    COLONIA(3),
    DOMICILIO(4),
    SALIR(5);

    private final int id;

    TipoLocalidad(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static TipoLocalidad getById(int opcion) {
        for (TipoLocalidad tipo : values()) {
            if (tipo.getId() == opcion) {
                return tipo;
            }
        }
        return null;
    }
}


