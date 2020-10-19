
package palabrasclaves.modelos;

//import grupos.modelos.Publicacion;
//import java.util.ArrayList;

public class PalabraClave {
    private String clave;
    //private ArrayList<Publicacion> publicacion;

    public PalabraClave(String clave) {
        this.clave = clave;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    /*public String verClave() {
        return clave;
    }*/
    
    @Override
    public String toString() {
        return "Palabra Clave: "+ this.clave;
    }
}
