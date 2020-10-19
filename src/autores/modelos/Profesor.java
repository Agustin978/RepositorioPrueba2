
package autores.modelos;

import grupos.modelos.MiembroEnGrupo;
import java.util.ArrayList;

public class Profesor extends Autor{
    private Cargo cargo;
    private ArrayList<MiembroEnGrupo> miembro;
//    public Profesor(String apellido, String nombre, int DNI, String clave, Cargo cargo, ArrayList<MiembroEnGrupo> miembro) {
//        super(apellido, nombre, DNI, clave);
//        this.cargo= cargo;
//        this.miembro= miembro;
//    }

    public Profesor(int DNI, String apellido, String nombre, String clave, Cargo cargo) {
        super(apellido, nombre, DNI, clave);
        this.cargo= cargo;
    }

//    public Profesor(ArrayList<MiembroEnGrupo> miembro, String apellido, String nombre, int DNI, String clave) {
//        super(apellido, nombre, DNI, clave);
//        this.miembro = miembro;
//    }

    public Cargo getCargo() {
        return cargo;
    }

//    public ArrayList<MiembroEnGrupo> getMiembro() {
//        return miembro;
//    }
    
    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

//    public void setMiembro(ArrayList<MiembroEnGrupo> miembro) {
//        this.miembro = miembro;
//    }
  
    @Override
    public void mostrar()
    {
        super.mostrar();
        System.out.print("\nCargo: "+cargo);
    }

    @Override
    public void agregarGrupo() {
        
    }
}