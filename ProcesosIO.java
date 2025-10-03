/**
 * @author Allyson Dulce Abigail Escobar Sandoval
 * @since 03/10/2025
 * 
 * -status:completa
 * 
 * Clase hija
 * Maneja todo el proceso de las entradas y salidas, y para ejecutar su proceso reescribe la plantilla de ejecutar.
 */
public class ProcesosIO extends Procesos{
    public ProcesosIO(int newPID, String newNombre){
        super(newPID, newNombre);
    }
    @Override
    public String EjecutarP(){
        String cadena="""
                      **********************************
                      Iniciado proceso de entrada/salida...
                      ¡Listo!
                      **********************************
                      """;
        return cadena;
    }
    @Override
    public String toString(){
        String cadena=super.toString()+"\nTipo: Procesos de entreda/salida";
        return cadena;
    }
}
