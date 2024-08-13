package org.example;

public class Biblioteca {

    public static void main(String[] args){

        Livro livro = new Livro("Dom Casmurro", "Machado de Assis", "2022");

        Livro livro2 = new Livro("Código Limpo", "Nao sei", "1900");

        System.out.println("Livro 1 = " + livro.getTitulo() + livro.getAutor() + livro.getAnoPublicacao() + livro.isDisponibilidade());

    }
}
