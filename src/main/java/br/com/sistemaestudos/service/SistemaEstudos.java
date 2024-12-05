package br.com.sistemaestudos.service;

import br.com.sistemaestudos.model.Disciplina;
import java.util.ArrayList;

public class SistemaEstudos {
    private ArrayList<Disciplina> disciplinas;

    public SistemaEstudos() {
        this.disciplinas = new ArrayList<>();
    }

    public void adicionarDisciplina(String nome, int cargaHoraria, int nivelDificuldade) {
        disciplinas.add(new Disciplina(nome, cargaHoraria, nivelDificuldade));
    }

    public void registrarNota(String nomeDisciplina, double nota, String tipo, String data) {
        Disciplina disc = buscarDisciplina(nomeDisciplina);
        if (disc != null) {
            disc.registrarNota(nota, tipo, data);
        }
    }

    public void registrarTempoEstudo(String nomeDisciplina, int minutos, String data) {
        Disciplina disc = buscarDisciplina(nomeDisciplina);
        if (disc != null) {
            disc.registrarTempoEstudo(minutos, data);
        }
    }

    public Disciplina buscarDisciplina(String nome) {
        for (Disciplina disc : disciplinas) {
            if (disc.getNome().equalsIgnoreCase(nome)) {
                return disc;
            }
        }
        return null;
    }

    public String gerarRelatorioDesempenho() {
        StringBuilder relatorio = new StringBuilder();
        relatorio.append("=== Relatório de Desempenho ===\n\n");

        for (Disciplina disc : disciplinas) {
            relatorio.append(disc.getDetalhes()).append("\n");
            relatorio.append(String.format("Média: %.2f\n", disc.calcularMedia()));
            relatorio.append(String.format("Total de horas estudadas: %.2f\n\n",
                    disc.getTotalMinutosEstudados() / 60.0));
        }

        return relatorio.toString();
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return new ArrayList<>(disciplinas);
    }
}