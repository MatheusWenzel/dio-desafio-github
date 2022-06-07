package one.digitalinnovation.basecamp;

public class Main {

    public static void main(String[] args) {

//        Calculadora
        System.out.println("Exercício calculadora");

        //Calculadora.soma(3,6);
       // Calculadora.subtração(9,1.8);
       // Calculadora.multiplicacao(7,8);
        //Calculadora.divisao(5,2.5);

        Calculadora.soma(57,12);
        Calculadora.subtração(57,12);
        Calculadora.multiplicacao(57,12);
        Calculadora.divisao(57,12);

//        Mensagem

        System.out.println("Execício mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        Emprestimo.calcular(1000,Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000,Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000,5);



    }
}
