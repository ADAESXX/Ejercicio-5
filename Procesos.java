/**
 * Clase padre
 * Maneja los datos en común de los procesos (PID y nombre), pero como todos sus procesos se deben de ejecutar de manera distinta, 
 * entonces se crea una “plantilla” que cada proceso podrá llenar a su manera.
 */
public abstract class Procesos {
    //atributos que pasaran a las clases hijas
    protected int PID;
    protected String nombre;
    //contructores
    public Procesos(){
        PID=0;
        nombre="";
    }
    public Procesos(int newPID, String newNombre){
        PID=newPID;
        newNombre=nombre;
    }
    //setters y getters
    public void setPID(int newPID){PID=newPID;}
    public int getPID(){return PID;}

    public void setNombre(String newNombre){nombre=newNombre;}
    public String getNombre(){return nombre;}

    //Método abstracto "plantilla" para ejecutar procesos
    abstract void EjecutarP();

    /**
     * 
     */
    public String toString(){
        String cadena="";
        return cadena;
    }

}
