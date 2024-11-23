package views;

import javax.swing.*;

import controllers.GerenciarAlunos;
import controllers.GerenciarCursos;
import controllers.GerenciarProfessores;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaPrincipal extends JFrame {
    public JanelaPrincipal() {
        // Configurações básicas da janela

        //Título da Janela
        setTitle("Gerenciamento Estudantil");

        //Tamanho da Janela
        setSize(400, 300);

        //Configuração padrão quando fechar a janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


        // Inicia Painel principal
        JPanel painel = new JPanel();

        //Layout principal, 5 linhas, 1 coluna e os espaços entre elas.
        painel.setLayout(new GridLayout(5, 1, 10, 10)); // Alterado para 5 linhas (adicionar botão de relatórios)

        // Botões do menu principal
        JButton btnAlunos = new JButton("Gerenciar Alunos");
        JButton btnProfessores = new JButton("Gerenciar Professores");
        JButton btnCursos = new JButton("Gerenciar Cursos");
        JButton btnRelatorios = new JButton("Gerar Relatórios");
        JButton btnSair = new JButton("Sair");

        // Adicionar botões ao painel
        painel.add(btnAlunos);
        painel.add(btnProfessores);
        painel.add(btnCursos);
        painel.add(btnRelatorios);
        painel.add(btnSair);

        // Adicionando o painel à janela
        add(painel);

        // Ações dos botões
        btnAlunos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GerenciarAlunos();
            }
        });

        btnProfessores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GerenciarProfessores();
            }
        });

        btnCursos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GerenciarCursos();
            }
        });

        btnRelatorios.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new JanelaRelatorios();
            }
        });

        btnSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        setVisible(true); // Exibe a janela
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new JanelaPrincipal());
    }
}