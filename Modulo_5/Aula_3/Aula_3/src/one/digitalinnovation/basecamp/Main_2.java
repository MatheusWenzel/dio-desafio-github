package one.digitalinnovation.basecamp;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class Main_2 {

    public static void main(String[] args) {

        byte b1 = 10;
        byte b2 = 20;

        short s1 = 20000;
        // short s2 = 40000; maior do que o limite

        // int i1 = -1000000000000000; maior do que o limite
        int i2 = 28500;

        long l1 = 100000000000000000L;
        long l2 = 154000000000000000L; /// tem que adicionar o L no final

        //float f1 = 4.5; // porque tem que por o f no final
        float f2 = 10.68f;

        double d1 = 85.69; // sem o d já é double
        double d2 = 99.84d;

        // textuais

        char c1 = 'W'; // explicito
        // char c2 = 'TW'  errado porque é duas letras
        char c3 = '\u0057'; // certo, é o codigo do W // impricito

        String st1 = "Fulano";
        String st2 = "Cicrano";
        String st3 = "aqui é isso";

        // String dt1 ="09/02/1981"; não é interessante porque tem uma própria de data

        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(i2);
        System.out.println(b1);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(bo1);
        System.out.println(bo2);

    }
}
