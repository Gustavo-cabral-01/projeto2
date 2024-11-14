package br.com.catolica.Cassino;

import java.util.Random;
import java.util.Scanner;

public class Roleta extends Jogos {

    public Roleta(double EntradaMinimar, double EntradaMaxima) {
        super(EntradaMinimar, EntradaMaxima);
    }


    public void detalhesDaRoleta() {
        detalhes();
        System.out.println("entrada minimar na Roleta é = " +  EntradaMinimar);
        System.out.println("Entrada maxima na Roleta è = " + EntradaMaxima);


    }
    public void jogar() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        System.out.print("Digite o valor da sua aposta (entre " + EntradaMinimar + " e " + EntradaMaxima + "): ");
        double aposta = scanner.nextDouble();


        if (aposta < EntradaMinimar || aposta > EntradaMaxima) {
            System.out.println("Aposta fora do limite permitido!");
            return;
        }

        System.out.print("Escolha um número entre 0 e 30: ");
        int numeroEscolhido = scanner.nextInt();


        if (numeroEscolhido < 0 || numeroEscolhido > 30) {
            System.out.println("Número indisponivel");
            return;
        }

        int numeroSorteado = random.nextInt(31);
        System.out.println("Número sorteado: " + numeroSorteado);

        if (numeroEscolhido == numeroSorteado) {
            System.out.println("Você ganhou " + (aposta * 30) + "!");
        } else {
            System.out.println("Você perdeu");
        }
    }

}