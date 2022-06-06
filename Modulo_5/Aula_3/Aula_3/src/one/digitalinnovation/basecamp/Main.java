package one.digitalinnovation.basecamp;

public class Main {
    public static void main(String[] args) {

        int i;
        // int i ; errado porque tem o mesmo nome
        int I;
        //int 1a; errado porque começa por numero
        int _1a; // Péssima prática porque começa por _
        int $aq; // Péssima prática porque começa por $

        i = 5;
        I =10;
        _1a = 20;
        $aq = 7;

        final int j = 10 ; // variavel constante
        // j = 15 esse daqui da problema porque j é contante
        int asrn24678md; // valiada mas incomum
        //int asrn24 678md; // não valida porque tem espaço
        int asrn24$678_md; // não valida porque tem _ e $
        //int asrn2$4%678_md; // não valida porque tem _ e $ e %

        asrn24678md = 100;
        asrn24$678_md = 10;

        int quantidadeProduto = 50;
        // int QuantidadeProduto; Nao vai dar erro mas ta fora das boas praticas
        final int NUMERO_TENTATIVAS =5; // VARIAVEL final então é toda maiuscula e separada por _
        // final int numeroTentativas = 5; não vai dar erro de compilação mas ta fora das boas praticas
        int QUANTITADE_OPCOES = 25; // não vai dar erro de compilação mas ta fora das boas praticas
        // int qtdProd; intelegivel não sabe de cara o que é

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(j);
        System.out.println(asrn24678md);
        System.out.println(asrn24$678_md);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTITADE_OPCOES);












    }
}
