
package palabrasclaves.modelos;

public class Composicion {
    private PalabraClave unaPalabra;

    public Composicion(PalabraClave unaPalabra) {
        this.unaPalabra = unaPalabra;
    }

    public PalabraClave getUnaPalabra() {
        return unaPalabra;
    }
    
    public void mostrar()
    {
        unaPalabra.toString();
    }
}
