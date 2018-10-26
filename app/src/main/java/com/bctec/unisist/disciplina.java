package com.bctec.unisist;

public class disciplina {
    private String nome, sigla, ementa;
    private int id, posicaoGrid;
    private boolean visivel;
    private disciplina disciplinaRequisito;

    public disciplina getDisciplinaRequisito() {
        return disciplinaRequisito;
    }

    public void setDisciplinaRequisito(disciplina disciplinaRequisito) {
        this.disciplinaRequisito = disciplinaRequisito;
    }

    public disciplina(String nome, String sigla, int id, boolean visivel, disciplina disciplinaRequisito) {
        this.nome = nome;
        this.sigla = sigla;
        this.id = id;
        this.posicaoGrid = id;
        this.visivel = visivel;
        this.ementa = "You’ll find out. Now, now, Biff, now, I never noticed any blindspot before when I would drive it. Hi, son. Alright, okay listen, keep your pants on, she’s over in the cafe. God, how do you do this? What made you change your mind, George? Doc? Am I to understand you’re still hanging around with Doctor Emmett Brown, McFly? Tardy slip for you, Miss Parker. And one for you McFly I believe that makes four in";
        this.ementa = " " + this.ementa + this.ementa + this.ementa;
        this.disciplinaRequisito = disciplinaRequisito;
    }

    public disciplina(String nome, String sigla, int id, boolean visivel) {
        this.nome = nome;
        this.sigla = sigla;
        this.id = id;
        this.posicaoGrid = id;
        this.visivel = visivel;
        this.ementa = "You’ll find out. Now, now, Biff, now, I never noticed any blindspot before when I would drive it. Hi, son. Alright, okay listen, keep your pants on, she’s over in the cafe. God, how do you do this? What made you change your mind, George? Doc? Am I to understand you’re still hanging around with Doctor Emmett Brown, McFly? Tardy slip for you, Miss Parker. And one for you McFly I believe that makes four in";
    }


    public int getPosicaoGrid() {
        return posicaoGrid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPosicaoGrid(int posicaoGrid) {
        this.posicaoGrid = posicaoGrid;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
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

    public boolean isVisivel() {
        return visivel;
    }

    public void setVisivel(boolean visivel) {
        this.visivel = visivel;
    }



}
