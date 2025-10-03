/**
 * @author Allyson Dulce Abigail Escobar Sandoval
 * @since 03/10/2025
 * 
 * -status:completa
 * 
 * Clase hija
 * Maneja todo el proceso de la CPU, y para ejecutar su proceso reescribe la plantilla de ejecutar.
 */
public class ProcesosCPU extends Procesos{
    public ProcesosCPU(int newPID, String newNombre){
        super(newPID, newNombre);
    }
    @Override
    public String EjecutarP(){
        String cadena="""
                      **********************************
                      Iniciado proceso del CPU...
                      ¡Listo!
                      **********************************
                      """;
        return cadena;
    }
    @Override
    public String toString(){
        String cadena=super.toString()+"\nTipo: Procesos de CPU";
        return cadena;
    }
}
