/**
 * Clase hija
 * Maneja todo el proceso de los procesos de segundo plano, y para ejecutar su proceso reescribe la plantilla de ejecutar.
 */
public class Daemons extends Procesos{
    public Daemons(int newPID, String newNombre){
        super(newPID, newNombre);
    }
    @Override
    public String EjecutarP(){
        String cadena="";
        return cadena;
    }
    @Override
    public String toString(){
        String cadena="";
        return cadena;
    }
}
