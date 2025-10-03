
import java.util.ArrayList;

/**
 * @author Allyson Dulce Abigail Escobar Sandoval
 * @since 03/10/2025
 * 
 * -status:completa
 * 
 * Ejecuta el proceso de cada proceso dentro del registro, sin importar que proceso sea.
 */
public class PlanificadorP {
    public PlanificadorP(){

    }
    //métodos de lógica
    public String Ejecutar(){
        Registro r= new Registro();
        ArrayList <Procesos> registros= r.getProcesos();
        String reporte="";
        for (Procesos p: registros){
            reporte=p.EjecutarP();
        }
        return reporte;

    }

}
