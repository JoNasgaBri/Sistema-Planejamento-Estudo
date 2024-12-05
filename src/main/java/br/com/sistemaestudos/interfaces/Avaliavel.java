package br.com.sistemaestudos.interfaces;

public interface Avaliavel {
    double calcularMedia();
    void registrarNota(double nota, String tipo, String data);
}