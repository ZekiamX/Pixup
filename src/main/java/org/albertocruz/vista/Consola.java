package org.albertocruz.vista;

public class Consola implements Ejecutable {
    private static Consola consola;
    private Consola()
    {
    }

    public static Consola getInstance( )
    {
        if(consola==null)
        {
            return new Consola();
        }
        return consola;
    }

    public void run(){
        boolean flag = true;
        int opcion = 0;

    }
}
