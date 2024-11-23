# Sistema de Gerenciamento Estudantil
## Descrição
O Sistema de Gerenciamento Estudantil é um aplicativo Java desenvolvido para gerenciar alunos, professores e cursos. Ele permite:

- Cadastrar alunos e professores.
- Vincular professores e alunos a cursos.
- Gerar relatórios detalhados de alunos matriculados e professores associados.

O projeto utiliza Java Swing para a interface gráfica e manipulação de arquivos para persistência de dados.

## Descrição dos Diretórios

### `controllers/`
Pacote responsável pela lógica de negócios e controle do sistema:
- **GerenciarAlunos.java**: Gerencia o cadastro, edição e exclusão de alunos.
- **GerenciarProfessores.java**: Gerencia o cadastro, edição e exclusão de professores.
- **GerenciarCursos.java**: Gerencia a criação de cursos e a vinculação de alunos e professores a eles.
- **Relatorios.java**: Gera relatórios detalhados de alunos matriculados e professores associados.

### `models/`
Pacote que contém as classes de modelo representando os dados principais:
- **Curso.java**: Representa um curso.
- **Estudante.java**: Representa um aluno.
- **Professor.java**: Representa um professor.
- **Pessoa.java**: Classe base para `Estudante` e `Professor`.

### `resources/`
Diretório onde ficam os arquivos de dados utilizados para persistência:
- **vinculacoes.txt**: Armazena informações sobre as vinculações cadastradas.
- **alunos.txt**: Armazena informações sobre os alunos cadastrados.
- **professores.txt**: Armazena informações sobre os professores cadastrados.
- **cursos.txt**: Armazena informações sobre os cursos criados.

### `utils/`
Pacote de classes utilitárias usadas para operações auxiliares:
- **GerenciadorDeArquivos.java**: Gerencia leitura e escrita em arquivos de texto.
- **GerenciadorDeDados.java**: Oferece métodos para carregar e manipular dados dos arquivos.

### `views/`
Pacote responsável pela interface gráfica da aplicação:
- **JanelaPrincipal.java**: Janela principal que serve como ponto de entrada para o sistema.
- **JanelaRelatorios.java**: Janela para exibir relatórios detalhados.

## Como Usar
1. Clone o repositório para o seu ambiente local:
   ```bash
   git clone https://github.com/seu-usuario/sistema-estudantil.git
   cd sistema-estudantil


# Tecnologias
- Java 8 (Compatível com versões superiores)
- Swing: Para a interface gráfica.
- Arquivos .txt: Para persistência de dados.

# Instalação

git clone https://github.com/seu-usuario/sistema-estudantil.git
cd sistema-estudantil
