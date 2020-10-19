
package publicaciones.modelos;


import idiomas.modelos.Idioma;
import java.time.LocalDate;
import java.util.ArrayList;

import lugares.modelos.Lugar;
import palabrasclaves.modelos.Composicion;
import palabrasclaves.modelos.PalabraClave;
import tipos.modelos.Tipo;

public class Publicacion {
    private String titulo;
    private String enlace;
    private String resumen;
    private LocalDate fechaPublicacion;
    private ArrayList<Composicion> palabra;
    private ArrayList<Lugar> lugar;
    private ArrayList<Idioma> idioma;
    private ArrayList<Tipo> tipo;

    public Publicacion(String titulo, String enlace, String resumen, LocalDate fechaPublicacion) {
        this.titulo = titulo;
        this.enlace = enlace;
        this.resumen = resumen;
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEnlace() {
        return enlace;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public ArrayList<Composicion> getPalabra() {
        return palabra;
    }

    public void setPalabra(ArrayList<Composicion> palabra) {
        this.palabra = palabra;
    }

    public ArrayList<Lugar> getLugar() {
        return lugar;
    }

    public void setLugar(ArrayList<Lugar> lugar) {
        this.lugar = lugar;
    }

    public ArrayList<Idioma> getIdioma() {
        return idioma;
    }

    public void setIdioma(ArrayList<Idioma> idioma) {
        this.idioma = idioma;
    }

    public ArrayList<Tipo> getTipo() {
        return tipo;
    }

    public void setTipo(ArrayList<Tipo> tipo) {
        this.tipo = tipo;
    }
}
