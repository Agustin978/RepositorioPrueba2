package grupos.modelos;

//import autores.modelos.Alumno;
import autores.modelos.Autor;
import java.util.Objects;
//import autores.modelos.Profesor;

public class MiembroEnGrupo {
    private Grupo grupo;
//    private Alumno alumno;
//    private Profesor profe;
    private Autor autor;
    private Rol rol;

    public MiembroEnGrupo(Autor autor, Grupo grupo, /*Alumno alumno, Profesor profe*/ Rol rol) {
        this.grupo = grupo;
//        this.alumno = alumno;
//        this.profe = profe;
        this.rol = rol;
    }

    //Metodos getter y setter (ver y asignar..)
    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

//    public Alumno getAlumno() {
//        return alumno;
//    }
//
//    public void setAlumno(Alumno alumno) {
//        this.alumno = alumno;
//    }
//
//    public Profesor getProfe() {
//        return profe;
//    }
//
//    public void setProfe(Profesor profe) {
//        this.profe = profe;
//    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    
    //Verifica que un mismo autor no se ingrese mas de una vez...
    //Controla la clase
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.autor);
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
        final MiembroEnGrupo other = (MiembroEnGrupo) obj;
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        return true;
    }
}
    