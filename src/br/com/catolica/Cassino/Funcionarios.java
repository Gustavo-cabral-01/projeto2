package br.com.catolica.Cassino;

public class Funcionarios extends Horario   {

    String nome;
    double salario;

    public Funcionarios(String horarioDeEntrada, String horarioDeSaida, String nome, double salario) {
        super(horarioDeEntrada, horarioDeSaida);
        this.nome = nome;
        this.salario = salario;
    }

    public static void funcionario() {
    }

    public String getNome() {

        return nome;
    }

    public double getSalario() {

        return salario;
    }


    public void detalhesDosFuncionarios() {
        horas();

        System.out.println("Horario de Entrada = " + HorarioDeEntrada);
        System.out.println("Horario de saida = "  + HorarioDeSaida);
        System.out.println("Nome do Funcionario = " + nome);
        System.out.println("Salario do Funcionario = "  + salario);


    }
}
