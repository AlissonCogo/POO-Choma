package org.example;

public class Livro {

    private String titulo;
    private String autor;
    private String anoPublicacao;
    private boolean disponibilidade;

    public Livro(String titulo, String autor, String ano){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = ano;
        this.disponibilidade = true;
    }

    //Getter

    public String getAutor() {
        return autor;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAnoPublicacao() {
        return anoPublicacao;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void emprestar(){

    }

    public void devolver(){

    }

}
