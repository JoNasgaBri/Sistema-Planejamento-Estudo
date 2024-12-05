
import br.com.sistemaestudos.service.SistemaEstudos;

public class Main {
    public static void main(String[] args) {
        // Criar instância do sistema
        SistemaEstudos sistema = new SistemaEstudos();

        // Adicionar algumas disciplinas
        sistema.adicionarDisciplina("Matemática", 60, 3);
        sistema.adicionarDisciplina("Física", 45, 3);
        sistema.adicionarDisciplina("História", 30, 2);

        // Registrar notas
        sistema.registrarNota("Matemática", 8.5, "Prova", "2024-03-01");
        sistema.registrarNota("Matemática", 9.0, "Trabalho", "2024-03-15");
        sistema.registrarNota("Física", 7.5, "Prova", "2024-03-02");

        // Registrar tempo de estudo
        sistema.registrarTempoEstudo("Matemática", 120, "2024-03-01"); // 2 horas
        sistema.registrarTempoEstudo("Física", 90, "2024-03-02"); // 1.5 horas
        sistema.registrarTempoEstudo("História", 60, "2024-03-03"); // 1 hora

        // Gerar e exibir relatório
        System.out.println(sistema.gerarRelatorioDesempenho());
    }
}