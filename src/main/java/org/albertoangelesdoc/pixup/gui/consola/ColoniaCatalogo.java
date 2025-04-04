package org.albertoangelesdoc.pixup.gui.consola;

import org.albertoangelesdoc.pixup.model.Colonia;
import org.albertoangelesdoc.pixup.util.ReadUtil;

import java.io.File;

public class ColoniaCatalogo extends Catalogos<Colonia> {
    public static ColoniaCatalogo coloniaCatalogo;

    private ColoniaCatalogo() {
        super();
    }

    public static ColoniaCatalogo getInstance() {
        if (coloniaCatalogo == null) {
            coloniaCatalogo = new ColoniaCatalogo();
        }
        return coloniaCatalogo;
    }

    @Override
    public Colonia newT() {
        return new Colonia();
    }

    @Override
    public boolean processNewT(Colonia colonia) {
        System.out.println("Teclee una colonia");
        colonia.setNombre(ReadUtil.read());
        System.out.println("Teclee el código postal");
        colonia.setCp(ReadUtil.read());

        return true;
    }

    @Override
    public void processEditT(Colonia colonia) {
        System.out.println("Id de la Colonia " + colonia.getId());
        System.out.println("Colonia a editar: " + colonia.getNombre());
        System.out.println("Teclee el valor nuevo de la colonia");
        colonia.setNombre(ReadUtil.read());
        System.out.println("Teclee el nuevo código postal");
        colonia.setCp(ReadUtil.read());

    }

    @Override
    public File getFile() {
        return new File("./Colonia.object");
    }

    @Override
    protected String getCatalogoName() {
        return "   Colonia";
    }
}