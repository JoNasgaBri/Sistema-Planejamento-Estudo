package br.com.sistemaestudos.model;


public class RegistroEstudo {
    private int minutos;
    private String data;

    public RegistroEstudo(int minutos, String data) {
        this.minutos = minutos;
        this.data = data;
    }

    // Getters
    public int getMinutos() {
        return minutos;
    }

    public String getData() {
        return data;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public void setData(String data) {
        this.data = data;
    }
}