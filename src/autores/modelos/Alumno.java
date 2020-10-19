
package autores.modelos;

//import grupos.modelos.MiembroEnGrupo;

import java.util.Objects;

//import java.util.ArrayList;

public class Alumno extends Autor{
    private String CX;
    //private ArrayList<MiembroEnGrupo> miembro;
    
    public Alumno(int DNI, String apellido, String nombre, String clave, String CX){
        super(apellido, nombre, DNI, clave);
        this.CX= CX;
    }

//    public Alumno(ArrayList<MiembroEnGrupo> miembro, String apellido, String nombre, int DNI, String clave) {
//        super(apellido, nombre, DNI, clave);
//        this.miembro = miembro;
//    }
    
    //Metodo Setter 
    public void setCX(String CX) {
        this.CX = CX;
    }

//    public void setMiembro(ArrayList<MiembroEnGrupo> miembro) {
//        this.miembro = miembro;
//    }
    
    //Metodo Getter para el CX
    public String getCX() {
        return CX;
    }

//    public ArrayList<MiembroEnGrupo> getMiembro() {
//        return miembro;
//    }

    
    //Funcion para evitar el ingreso de alumnos con el mismo CX
//    @Override
//    public int hashCode() {
//        int hash = 3;
//        return hash;
//    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (!Objects.equals(this.CX, other.CX)) {
            return false;
        }
        return true;
    }
    
    
    
    //Funcion que sirtve para mostrar los datos
    @Override
    public void mostrar()
    {
        super.mostrar();
        System.out.print("\nCX: "+CX);
    }

    //Agrega al alumno el grupo al que pertenece
    @Override
    public void agregarGrupo() {
        
    }
}