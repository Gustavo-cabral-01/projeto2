package Main;

import br.com.catolica.Cassino.*;
import enums.Fichas;
import enums.LimiteDeJogadores;
import enums.ModoDeJogo;
import interfaces.Cassino;

import java.util.Scanner;

public class main {
    private static Scanner scanner = new Scanner(System.in);
    private static String nomeJogador;
    private static BlackJack[] jogos;

    public static void main(String[] args) {
        NomeDoJogador();
        BoasVindas();

        Funcionarios[] funcionarios = iniciarFuncionarios();
        BlackJack[] jogoBlackJack = iniciarBlackJack();

        while (true) {
            Menu();
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> DetalhesDoBlackJack(jogoBlackJack);
                case 2 -> Regras();
                case 3 -> Pagamentos();
                case 4 -> detalhesDoJogador();
                case 5 -> Funcionarios(funcionarios);
                case 6 -> Roleta();
                case 0 -> {
                    System.out.println("Saindo..");
                    return;
                }
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void NomeDoJogador() {
        System.out.print("Qual é seu nome? ");
        nomeJogador = scanner.nextLine();
    }

    private static void BoasVindas() {
        System.out.println("Bem-vindo : " + nomeJogador );
    }

    private static void Menu() {
        System.out.println("\nEscolha uma opção:");
        System.out.println("1. Detalhes do BlackJack");
        System.out.println("2. Regras do Cassino");
        System.out.println("3. Saques e Pagamentos");
        System.out.println("4. Informações dos Jogador");
        System.out.println("5. Informações dos Funcionários");
        System.out.println("6. Jogar na Roleta");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static Funcionarios[] iniciarFuncionarios() {
        return new Funcionarios[] {
                new Funcionarios("8:00", "15:00", "anderson", 2500),
                new Funcionarios("15:00", "01:00",  "Cici", 2500)
        };
    }

    private static BlackJack[] iniciarBlackJack() {
        return new BlackJack[] {
                new BlackJack(Fichas.FICHA_VERMELHA, ModoDeJogo.MULTIPLAYER, LimiteDeJogadores.MAXIMO),
                new BlackJack(Fichas.FICHA_BRANCA, ModoDeJogo.TORNEIO, LimiteDeJogadores.MAXIMO)
        };
    }

    private static BlackJack[] DetalhesDoBlackJack(BlackJack[] jogos) {
        System.out.println("_____________ Detalhes Do BlackJack _____________");
        for (BlackJack jogo : jogos) {
            System.out.println("Ficha: " + jogo.getFichas());
            System.out.println("Valor da Ficha: " + jogo.getValorDaFicha());
            System.out.println("Modo de Jogo: " + jogo.getModoDeJogo());
            System.out.println("O maximo de jogadores: " + jogo.getLimiterr() );

            System.out.println("--------------------------------------");
        }
        return null;
    }

    private static void Regras() {
        System.out.println("________ Regras do Cassino ________");
        Regras regras = new Regras();
        regras.detalhesDaRegra();
    }

    private static void Pagamentos() {
        System.out.println("________ Processar Pagamentos ________");
        Caixar caixar = new Caixar();
        caixar.pagamentos();
    }

    private static void detalhesDoJogador() {
        System.out.println("________ Informações dos Jogadores ________");
        Cassino jogador = new Jogadores();
        jogador.apostar();
        jogador.consurmirAlco();
    }

    private static void Funcionarios(Funcionarios[] funcionarios) {
        System.out.println("________ Informações dos Funcionários ________");

            for (Funcionarios func : funcionarios) {
                func.detalhesDosFuncionarios();
            }


    }

    private static void Roleta() {
        System.out.println("__________Roleta __________");
        Roleta roleta = new Roleta(10, 300);
        roleta.detalhesDaRoleta();
        roleta.jogar();
    }

}

