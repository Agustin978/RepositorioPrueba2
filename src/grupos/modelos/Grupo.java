package grupos.modelos;

import grupos.modelos.Rol;
import autores.modelos.Autor;
import java.util.ArrayList;
import java.util.Objects;

public class Grupo {
    private String nombre;
    private String descripcion;
    private Autor profe;
    private Autor alumno;
    private Rol rol;
    private ArrayList<MiembroEnGrupo> miembro= new ArrayList<>();

    public Grupo(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Grupo(ArrayList<MiembroEnGrupo> miembro) {
        this.miembro = miembro;
    }

    //Metodos getter y setter (ver y asignar..)
    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public ArrayList<MiembroEnGrupo> getMiembro() {
        return miembro;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setMiembro(ArrayList<MiembroEnGrupo> miembro) {
        this.miembro = miembro;
    }
    
    //Funcion para agregar miembros
    public void agregarMiembro(MiembroEnGrupo m)
    {
        this.miembro.add(m);  //No esta bien
    }
    
    //Funcion para la muestra de datos acerca del grupo
    public void mostrar()
    {
        System.out.print("Nombre del grupo: "+nombre+"\nDescripcion del grupo: "+descripcion);
    }

    
    //Funcion para evitar el ingreso de dos grupos con un mismo nombre...
////    @Override
////    public int hashCode() {
////        int hash = 3;
////        hash = 41 * hash + Objects.hashCode(this.nombre);
////        return hash;
////    }

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
        final Grupo other = (Grupo) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
    
    
}

