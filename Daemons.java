/**
 * @author Allyson Dulce Abigail Escobar Sandoval
 * @since 03/10/2025
 * 
 * -status:completa
 * 
 * Clase hija
 * Maneja todo el proceso de los procesos de segundo plano, y para ejecutar su proceso reescribe la plantilla de ejecutar.
 */
public class Daemons extends Procesos{
    public Daemons(int newPID, String newNombre){
        super(newPID, newNombre);
    }
    @Override
    public String EjecutarP(){
        String cadena="""
                      **********************************
                      Iniciado proceso de los Daemons...
                      ¡Listo!
                      **********************************
                      """;
        return cadena;
    }
    @Override
    public String toString(){
        String cadena=super.toString()+"\nTipo: Procesos de Daemons";
        return cadena;
    }
}
