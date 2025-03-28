package org.albertocruz.model;

public enum TipoRegistro {
    ALTA(1),
    BAJA(2),
    VER(3),
    ACTUALIZAR(4),
    SALIR(5);

    private final int id;

    TipoRegistro(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static TipoRegistro getTipoRegistroById(int opcion) {
        for (TipoRegistro tipo : values()) {
            if (tipo.getId() == opcion) {
                return tipo;
            }
        }
        return null;
    }
}


