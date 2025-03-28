package org.albertocruz.model;

public enum TipoResumen {
    CATALOGO(1),
    PENDIENTE(2),
    SALIR(3);

    private final int id;

    TipoResumen(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static TipoResumen getTipoResumenById(int opcion) {
        for (TipoResumen tipo : values()) {
            if (tipo.getId() == opcion) {
                return tipo;
            }
        }
        return null;
    }
}

