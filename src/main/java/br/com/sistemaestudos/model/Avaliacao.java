package br.com.sistemaestudos.model;

public class Avaliacao {
    private double nota;
    private String tipo;
    private String data;

    public Avaliacao(double nota, String tipo, String data) {
        this.nota = nota;
        this.tipo = tipo;
        this.data = data;
    }

    // Getters e Setters

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
