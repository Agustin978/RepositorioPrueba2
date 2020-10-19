
package lugares.modelos;

public class Lugar {
    private String lugar;

    public Lugar(String lugar) {
        this.lugar = lugar;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    
    
   /* public String verLugar() {
        return lugar;
    }*/

    @Override
    public String toString() {
        return "Lugar: " + lugar;
    }   
}
