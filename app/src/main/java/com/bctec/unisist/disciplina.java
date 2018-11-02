package com.bctec.unisist;

public class disciplina {

    /*
     * Desenvolvido por: Bruno Cesar Pereira
     * Descrição: Classe das disciplinas
     */
    private String nome, sigla, ementa;
    private int id, posicaoGrid;
    private boolean visivel, jaCursou, querCursar;
    private disciplina disciplinaRequisito;

    public disciplina getDisciplinaRequisito() {
        return disciplinaRequisito;
    }

    public void setDisciplinaRequisito(disciplina disciplinaRequisito) {
        this.disciplinaRequisito = disciplinaRequisito;
    }

    public boolean isJaCursou() {
        return jaCursou;
    }

    public void setJaCursou(boolean jaCursou) {
        this.jaCursou = jaCursou;
    }

    public boolean isQuerCursar() {
        return querCursar;
    }

    public void setQuerCursar(boolean querCursar) {
        this.querCursar = querCursar;
    }

    /* Está repetido, mas não consegui fazer um construtor chamar outro construtor.
     * Sobrecarga com diferença que esse construtor recebe como parãmetro a diciplina requisito
     **/
    public disciplina(String nome, String sigla, int id, boolean visivel, disciplina disciplinaRequisito) {
        this.nome = nome;
        this.sigla = sigla;
        this.id = id;

        this.posicaoGrid = id;
        this.visivel = visivel;
        this.ementa = "You’ll find out. Now, now, Biff, now, I never noticed any blindspot before when I would drive it. Hi, son. Alright, okay listen, keep your pants on, she’s over in the cafe. God, how do you do this? What made you change your mind, George? Doc? Am I to understand you’re still hanging around with Doctor Emmett Brown, McFly? Tardy slip for you, Miss Parker. And one for you McFly I believe that makes four in";
        this.ementa = " " + this.ementa + this.ementa + this.ementa;
        this.disciplinaRequisito = disciplinaRequisito;
        this.jaCursou = false;
        this.querCursar = false;
    }

    /* Precisei criar essa pois a disciplina genérica "Disciplina sem Requisitos" é a primeira a ser criada. Não tem como chamar o outro constructor sem que haja uma disciplina já existente.*/
    public disciplina(String nome, String sigla, int id, boolean visivel) {
        this.nome = nome;
        this.sigla = sigla;
        this.id = id;
        this.posicaoGrid = id;
        this.visivel = visivel;
        this.ementa = "You’ll find out. Now, now, Biff, now, I never noticed any blindspot before when I would drive it. Hi, son. Alright, okay listen, keep your pants on, she’s over in the cafe. God, how do you do this? What made you change your mind, George? Doc? Am I to understand you’re still hanging around with Doctor Emmett Brown, McFly? Tardy slip for you, Miss Parker. And one for you McFly I believe that makes four in";
        this.jaCursou = false;
        this.querCursar = false;
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
