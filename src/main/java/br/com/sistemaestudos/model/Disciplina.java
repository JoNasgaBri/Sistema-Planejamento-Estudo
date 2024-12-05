package br.com.sistemaestudos.model;

import br.com.sistemaestudos.interfaces.Avaliavel;
import java.util.ArrayList;

public class Disciplina extends ElementoAcademico implements Avaliavel {
    private int nivelDificuldade;
    private ArrayList<Avaliacao> avaliacoes;
    private ArrayList<RegistroEstudo> registrosEstudo;

    public Disciplina(String nome, int cargaHoraria, int nivelDificuldade) {
        super(nome, cargaHoraria);
        this.nivelDificuldade = nivelDificuldade;
        this.avaliacoes = new ArrayList<>();
        this.registrosEstudo = new ArrayList<>();
    }

    @Override
    public String getDetalhes() {
        return String.format("Disciplina: %s - CH: %d - Nível: %d",
                nome, cargaHoraria, nivelDificuldade);
    }

    @Override
    public void registrarNota(double nota, String tipo, String data) {
        avaliacoes.add(new Avaliacao(nota, tipo, data));
    }

    @Override
    public double calcularMedia() {
        if (avaliacoes.isEmpty()) {
            return 0.0;
        }

        double soma = 0;
        for (Avaliacao av : avaliacoes) {
            soma += av.getNota();
        }
        return soma / avaliacoes.size();
    }

    public void registrarTempoEstudo(int minutos, String data) {
        registrosEstudo.add(new RegistroEstudo(minutos, data));
    }

    public int getTotalMinutosEstudados() {
        int total = 0;
        for (RegistroEstudo reg : registrosEstudo) {
            total += reg.getMinutos();
        }
        return total;
    }

    // Getters e Setters
    public int getNivelDificuldade() {
        return nivelDificuldade;
    }

    public void setNivelDificuldade(int nivelDificuldade) {
        this.nivelDificuldade = nivelDificuldade;
    }

    public ArrayList<Avaliacao> getAvaliacoes() {
        return new ArrayList<>(avaliacoes);
    }

    public ArrayList<RegistroEstudo> getRegistrosEstudo() {
        return new ArrayList<>(registrosEstudo);
    }

}
