package one.digitalinnovation.basecamp;

/*
 * Classe de exemplo para exerc[ici da Aula 1 de métodos
 * */


public class Calculadora {
//o void não vai ter retorno
    public static void soma(double numero1, double numero2) {

        double resultado = numero1 + numero2;

        System.out.println("A soma de " + numero1 + " mais " + numero2 +  " é " + resultado);


    }

    public static void subtração(double numero1, double numero2) {

        double resultado = numero1 - numero2;

        System.out.println("A subtração de " + numero1 + " mmenos " + numero2 +  " é " + resultado);

    }

    public static void multiplicacao(double numero1, double numero2) {

        double resultado = numero1 * numero2;

        System.out.println("A multiplicação de " + numero1 + " vezes " + numero2 +  " é " + resultado);

    }

    public static void divisao (double numero1, double numero2) {

        double resultado = numero1 / numero2;

        System.out.println("A divisão de " + numero1 + " por " + numero2 +  " é " + resultado);

    }

}
