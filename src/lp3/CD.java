package lp3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Filipe
 */
public class CD {
    private String titulo;
    private String banda;
    private Double preco;

    public CD() {
    }

    public CD(String titulo, String banda, Double preco) {
        this.titulo = titulo;
        this.banda = banda;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "CD{" + "titulo=" + titulo + ", banda=" + banda + ", preco=" + preco + '}';
    }
    
    
}
