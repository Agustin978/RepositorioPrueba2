package autores.modelos;

import grupos.modelos.Grupo;
import grupos.modelos.MiembroEnGrupo;
import grupos.modelos.Rol;
import java.util.ArrayList;

public abstract class Autor {
    private String apellido;
    private String nombre;
    private int DNI;
    private String clave;
    private ArrayList<MiembroEnGrupo> miembro;

    public Autor(String apellido, String nombre, int DNI, String clave) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.DNI = DNI;
        this.clave = clave;
    }

    //Metodos getter
    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public String getClave() {
        return clave;
    }

    //Metodos setter
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    public void mostrar()
    {
        System.out.print("Numero de Documento:"+DNI+"\nApellido: "+apellido+"\nNombre: "+nombre);
    }
    
    public abstract void agregarGrupo();

    //Funciones para evitar que se ingresen dos "autores" con un mismo DNI
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + this.DNI;
        return hash;
    }

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
        final Autor other = (Autor) obj;
        if (this.DNI != other.DNI) {
            return false;
        }
        return true;
    }
    
    
}
