package org.albertocruz.main;

import org.albertocruz.model.TipoEjecutable;
import org.albertocruz.util.ReadUtil;
import org.albertocruz.vista.Menu;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        int opcion = 0;
        TipoEjecutable tipoEjecutable = null;
        while( flag ) {
            Menu.menuEjecutable();
            Menu.seleccionaOpcion();
            opcion = ReadUtil.readInt();
            tipoEjecutable = TipoEjecutable.getTipoEjecutableById(opcion);
            if (TipoEjecutable.SALIR.equals(tipoEjecutable)) {
                flag = false;
            }
            if (TipoEjecutable.OPCION_ERRONEA.equals(tipoEjecutable)) {
                Menu.opcionInvalida();
            }
            if (tipoEjecutable.getEjecutable() != null) {
                tipoEjecutable.getEjecutable().run();
            }
        }
    }
}
