# Sistema de Gerenciamento Estudantil
## Descrição
O Sistema de Gerenciamento Estudantil é um aplicativo Java desenvolvido para gerenciar alunos, professores e cursos. Ele permite:

- Cadastrar alunos e professores.
- Vincular professores e alunos a cursos.
- Gerar relatórios detalhados de alunos matriculados e professores associados.

O projeto utiliza Java Swing para a interface gráfica e manipulação de arquivos para persistência de dados.

# Estrutura do Projeto

O projeto está organizado em pacotes para manter o código modular e fácil de entender:

src/
├── controllers/         # Classes de controle (lógica de negócios)
│   ├── GerenciarAlunos.java
│   ├── GerenciarProfessores.java
│   ├── GerenciarCursos.java
│   └── Relatorios.java
├── models/              # Classes de modelo (representação de dados)
│   ├── Curso.java
│   ├── Estudante.java
│   ├── Professor.java
│   └── Pessoa.java
├── resources/           # Arquivos de dados persistentes
│   ├── alunos.txt
│   ├── professores.txt
│   └── cursos.txt
├── utils/               # Classes utilitárias
│   ├── GerenciadorDeArquivos.java
│   └── GerenciadorDeDados.java
├── views/               # Interface gráfica
│   ├── JanelaPrincipal.java
│   ├── JanelaRelatorios.java

# Tecnologias
- Java 8 (Compatível com versões superiores)
- Swing: Para a interface gráfica.
- Arquivos .txt: Para persistência de dados.

# Instalação

git clone https://github.com/seu-usuario/sistema-estudantil.git
cd sistema-estudantil
