
import java.util.ArrayList;

/**
 * @author Allyson Dulce Abigail Escobar Sandoval
 * @since 03/10/2025
 * 
 * -status:completa
 * -arreglo: se arreglo el error de la creacion de registro
 * 
 * Ejecuta el proceso de cada proceso dentro del registro, sin importar que proceso sea.
 */
public class PlanificadorP {
    private Registro registro;

    public PlanificadorP(Registro registro){
        this.registro=registro;
    }
    //métodos de lógica
    public String Ejecutar(){
        ArrayList <Procesos> registros= registro.getProcesos();
        String reporte="";
        for (Procesos p: registros){
            reporte+=p.EjecutarP() + "\n";
        }
        return reporte;

    }

}
