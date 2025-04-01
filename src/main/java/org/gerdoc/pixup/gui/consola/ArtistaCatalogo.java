package org.gerdoc.pixup.gui.consola;

import org.gerdoc.pixup.model.Artista;
import org.gerdoc.pixup.util.ReadUtil;

public class ArtistaCatalogo extends Catalogos<Artista>{

    private static ArtistaCatalogo artistaCatalogo;

    private ArtistaCatalogo() {
    }

    public static ArtistaCatalogo getInstance()
    {
        if (artistaCatalogo == null)
        {
            artistaCatalogo = new ArtistaCatalogo();
        }
        return artistaCatalogo;
    }

    @Override
    public Artista newT()
    {
        return new Artista();
    }

    @Override
    public boolean processNewT(Artista artista)
    {
        System.out.println("Escriba el nombre del artista");
        artista.setArtista(ReadUtil.read());
        return true;
    }

    @Override
    public void processEditT(Artista artista)
    {
        System.out.println("El nombre del artista es " + artista.getArtista());
        System.out.println("Escribe el nuevo nombre del artista ");
        artista.setArtista(ReadUtil.read());
    }
}
