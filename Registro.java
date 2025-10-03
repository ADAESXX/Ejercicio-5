
import java.util.ArrayList;
/**
 * @author Allyson Dulce Abigail Escobar Sandoval
 * @since 03/10/2025
 * 
 * -status:completa
 * 
 * Permite registrar todos los registros de cualquier proceso, es decir, no importa si son de un diferente tipo.
 */
public class Registro {
    //atributo para almacenar los procesos
    private ArrayList<Procesos> listaP;
    //constructor
    public Registro(){
        listaP= new ArrayList<>();
    }
    //setters y getters
    public void setProceso(Procesos newProceso){listaP.add(newProceso);}
    public ArrayList<Procesos> getProcesos(){return listaP;}
    
}
