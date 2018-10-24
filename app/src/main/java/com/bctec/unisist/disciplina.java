package com.bctec.unisist;

public class disciplina {
    private String nome, sigla;
    private int posicaoLinha, posicaoColuna;
    boolean visivel;

    public disciplina(String nome, String sigla, int posicaoLinha, int posicaoColuna, boolean visivel) {
        this.nome = nome;
        this.sigla = sigla;
        this.posicaoLinha = posicaoLinha;
        this.posicaoColuna = posicaoColuna;
        this.visivel = visivel;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPosicaoLinha() {
        return posicaoLinha;
    }

    public void setPosicaoLinha(int posicaoLinha) {
        this.posicaoLinha = posicaoLinha;
    }

    public int getPosicaoColuna() {
        return posicaoColuna;
    }

    public void setPosicaoColuna(int posicaoColuna) {
        this.posicaoColuna = posicaoColuna;
    }

    public boolean isVisivel() {
        return visivel;
    }

    public void setVisivel(boolean visivel) {
        this.visivel = visivel;
    }

}
