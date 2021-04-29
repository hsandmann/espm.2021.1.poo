package br.espm.poo.aula08;

import java.lang.reflect.Array;

public class Main {


    public static void main(String[] args) {

        try {
            float m = media(9.2, 0.1, 5.6, 2.3);
            System.out.println(m);
        } catch (ArithmeticException exception) {
            System.out.println("Erro de divisao por zero");
            System.out.println(exception.getMessage());
        } catch (ESPMException e) {
            System.out.println(e.getMessage());
            System.out.println("Voce nao erro, voce aprendeu!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro generico");
        } finally {
            System.out.println("Finalizou");
        }
    }

    public static float media(double... notas) throws ESPMException {
        try {
            if (notas.length == 0) {
                throw new ESPMException("É necessario ao menos uma nota");
            }
            float soma = 0;
            for (double nota: notas) {
                if (nota < 0 || nota > 10) {
                    throw new ESPMException("Nota out of bounds: [0;10]");
                }
                soma += nota;
            }
            return soma/notas.length;
        } catch (ArithmeticException e) {
            throw new ESPMException(e);
        }
    }

}
