package org.albertoangelesdoc.pixup.jdbc;

import org.albertoangelesdoc.pixup.model.Estado;

import java.util.List;

public interface EstadoJdbc {
    List<Estado> findAll();
}
