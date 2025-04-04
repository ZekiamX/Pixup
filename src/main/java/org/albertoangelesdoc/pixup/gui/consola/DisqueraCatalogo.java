package org.albertoangelesdoc.pixup.gui.consola;

import org.albertoangelesdoc.pixup.model.Disquera;
import org.albertoangelesdoc.pixup.util.ReadUtil;

import java.io.File;

public class DisqueraCatalogo extends Catalogos<Disquera>{

    private static DisqueraCatalogo disqueraCatalogo;

    private DisqueraCatalogo() {
    }

    public static DisqueraCatalogo getInstance()
    {
        if (disqueraCatalogo == null)
        {
            disqueraCatalogo = new DisqueraCatalogo();
        }
        return disqueraCatalogo;
    }

    @Override
    public Disquera newT()
    {
        return new Disquera();
    }

    @Override
    public boolean processNewT(Disquera disquera)
    {
        System.out.println("Escriba el nombre de la disquera");
        disquera.setDisquera(ReadUtil.read());
        return true;
    }

    @Override
    public void processEditT(Disquera disquera)
    {
        System.out.println("El nombre de la disquera es " + disquera.getDisquera());
        System.out.println("Escribe el nuevo nombre del artista ");
        disquera.setDisquera(ReadUtil.read());
    }

    @Override
    public File getFile() {
        return new File("Disquera.List");
    }

    @Override
    protected String getCatalogoName() {
        return "";
    }
}