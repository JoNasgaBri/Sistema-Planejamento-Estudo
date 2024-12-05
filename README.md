# Sistema de Gerenciamento e Planejamento de Estudos

## Descrição do Projeto

O Sistema de Gerenciamento e Planejamento de Estudos é uma aplicação Java desenvolvida para auxiliar estudantes no planejamento e acompanhamento de suas atividades acadêmicas. Destinado a estudantes do ensino médio, pré-vestibular e graduação, o sistema oferece funcionalidades para organizar disciplinas, registrar tempo de estudo e monitorar o desempenho através de notas e avaliações.

## Funcionalidades Principais

O sistema permite aos usuários:

- Cadastrar disciplinas com informações como nome, carga horária e nível de dificuldade
- Registrar e acompanhar o tempo dedicado aos estudos de cada disciplina
- Registrar notas de avaliações, incluindo tipo (prova, trabalho) e data
- Visualizar estatísticas de desempenho e progresso
- Gerar relatórios de desempenho acadêmico

## Estrutura do Projeto

O projeto está organizado nos seguintes pacotes:

```
br.com.sistemaestudos
├── model/          # Classes de modelo (Disciplina, Avaliacao, etc.)
├── interfaces/     # Interfaces do sistema
├── service/        # Lógica de negócio         
```

## Tecnologias Utilizadas

- Java 11 ou superior
- IDE recomendada: IntelliJ IDEA

## Como Executar o Sistema

1. Clone o repositório:
```bash
git clone https://github.com/JoNasgaBri/Sistema-Planejamento-Estudo.git
```

2. Abra o projeto no IntelliJ IDEA:
   - Vá em File > Open
   - Navegue até a pasta do projeto
   - Selecione o arquivo pom.xml
   - Clique em "Open as Project"

3. Execute a classe Main:
   - Navegue até src/main/java/br/com/sistemaestudos/Main.java
   - Clique com o botão direito na classe
   - Selecione "Run 'Main.main()'"

## Exemplo de Uso

```java
// Criar instância do sistema
SistemaEstudos sistema = new SistemaEstudos();

// Adicionar uma disciplina
sistema.adicionarDisciplina("Matemática", 60, 3);

// Registrar uma nota
sistema.registrarNota("Matemática", 8.5, "Prova", "2024-03-01");

// Registrar tempo de estudo
sistema.registrarTempoEstudo("Matemática", 120, "2024-03-01");

// Gerar relatório de desempenho
System.out.println(sistema.gerarRelatorioDesempenho());
```

## Contribuição

Para contribuir com o projeto:

1. Faça um fork do repositório
2. Crie uma branch para sua feature (`git checkout -b feature/nova-feature`)
3. Faça commit das alterações (`git commit -m 'Adiciona nova feature'`)
4. Faça push para a branch (`git push origin feature/nova-feature`)
5. Abra um Pull Request

## Licença

Este projeto está licenciado sob a licença MIT - consulte o arquivo LICENSE para mais detalhes.

## Autor

Jonas
