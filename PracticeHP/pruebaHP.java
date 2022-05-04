import java.util.Random;

public class pruebaHP{

    public static void main(String[] args) {
        Random aleatorio = new Random();// Inicializamos random

        int tipoP = aleatorio.nextInt(5)+1;
        String casa = "";
        String genero = "";
        String nombre = "";
        String boggart = "";
        String patronus = "";

        if (tipoP == 1) {
            casa = "Gryffindor";
            genero = "Masculino";
            nombre = "Albus Percival Wulfric Brian Dumbledore";
            boggart = "El cuerpo de su hermana Ariana";
            patronus = " el Fenix";
        }

        else if (tipoP == 2) {
            casa = "Hufflepuff";
            genero = "Masculino";
            nombre = "Newton Scamander";
            boggart = "Tener que trabajar en una oficina";
            patronus = " el Puercoespin";
        }

        else if (tipoP == 3) {
            casa = "Gryffindor";
            genero = "Masculino";
            nombre = "Neville Longbottom";
            boggart = "El profesor Severus Snape";
            patronus = "No corpóreo";
        }

        else if (tipoP == 4) {
            casa = "Gryffindor";
            genero = "Femenino";
            nombre = "Hermione Jean Granger";
            boggart = "La profesora McGonagall diciéndole que reprobó todo";
            patronus = " la Nutria";
        }

        else {
            casa = "Gryffindor";
            genero = "Masculino";
            nombre = "Fred Weasley";
            boggart = "Lord Voldemort";
            patronus = " la Urraca";
        }

        HarryPotter personaje = new HarryPotter(casa, genero, nombre, boggart, patronus);

        System.out.print(personaje);

    }

}
