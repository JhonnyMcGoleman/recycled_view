package com.example.recycled_view;

public class Titular {
    private String titulo;
    private String subtitulo;
    private String telefono;


    public Titular(String titulo, String subtitulo,String telefono) {
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.telefono=telefono;
    }
    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public String getTelefono() {return telefono;}

    public void setTelefono(String telefono) {this.telefono = telefono;}


}
