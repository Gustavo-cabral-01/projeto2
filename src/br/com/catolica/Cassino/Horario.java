package br.com.catolica.Cassino;

public abstract class Horario {
    public String HorarioDeEntrada;
    String HorarioDeSaida;


    public Horario(String horarioDeEntrada, String horarioDeSaida) {
        this.HorarioDeEntrada = horarioDeEntrada;
        this.HorarioDeSaida = horarioDeSaida;

    }

    public String getHorarioDeEntrada() {

        return (HorarioDeEntrada + "11:00");
    }

    public String getHorarioDeSaida() {
        return (HorarioDeSaida + "22:00");
    }




    public  String horas() {
        return "Horario{" +
                "HorarioDeEntrada='" + HorarioDeEntrada + '\n' +
                ", HorarioDeSaida='" + HorarioDeSaida + '\n' + '}';
    }
}
