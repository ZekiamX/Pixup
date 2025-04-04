package org.albertoangelesdoc.pixup.gui.consola;

import org.albertoangelesdoc.pixup.model.Municipio;
import org.albertoangelesdoc.pixup.util.ReadUtil;

import java.io.File;

public class MunicipioCatalogo extends Catalogos<Municipio> {
    public static MunicipioCatalogo municipioCatalogo;

    private MunicipioCatalogo() {
        super();
    }

    public static MunicipioCatalogo getInstance() {
        if (municipioCatalogo == null) {
            municipioCatalogo = new MunicipioCatalogo();
        }
        return municipioCatalogo;
    }

    @Override
    public Municipio newT() {
        return new Municipio();
    }

    @Override
    public boolean processNewT(Municipio municipio) {
        System.out.println("Teclee un municipio");
        municipio.setNombre(ReadUtil.read());

        return true;
    }

    @Override
    public void processEditT(Municipio municipio) {
        System.out.println("Id del Municipio " + municipio.getId());
        System.out.println("Municipio a editar: " + municipio.getNombre());
        System.out.println("Teclee el valor nuevo del municipio");
        municipio.setNombre(ReadUtil.read());

    }

    @Override
    public File getFile() {
        return new File("./Municipio.object");
    }

    @Override
    protected String getCatalogoName() {
        return "   Municipio";
    }
}