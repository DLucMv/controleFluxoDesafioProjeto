package org.example;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int parametro1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        int parametro2= sc.nextInt();

        try{
            contar(parametro1, parametro2);
        }catch (ParametrosInvalidosException pie){
            pie.printStackTrace();
            System.err.println(pie.getMsg());
        }

    }

    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException{
        if(parametro2 < parametro1)
            throw new ParametrosInvalidosException();

        int contador = parametro2 - parametro1;
        for (int i = 0; i < contador ; i++) {
            System.out.println("Imprimindo o número " + (i+1));
        }
    }

}