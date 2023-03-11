package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {


        Gato gato = new Gato();

        Livro livro = new Livro("O Problmea dos 3 corpos", 300);
        System.out.println(livro);

       /* int a = 5;
        int b = 3;

        System.out.println("Olá Mundo " + (a+b));*/
    }
}

class Livro{
    private String nome;
    private Integer numPaginas;

    public Livro(String nome, Integer NumPaginas){
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

}
