package br.espm.poo.aula08;

import java.util.*;
import java.util.stream.Collectors;

public class Generico {

    public static void main(String[] args) {
        System.out.println(maior("Ana", "Antonio", "Humberto"));
        System.out.println(maior(1,-9, 10));

        Teste t = new Teste();
        System.out.println(maior(t, t, t));

        System.out.println("Exercicio");
        String[] a = new String[]{"Antonio", "Maria", "Jose"};
        System.out.println("   maior: " + maior(a));
        System.out.println(" contido: " + contido(a, "Jose"));
        System.out.println("ordenado: " + ordenado(a));
        System.out.println("repetido: " + repetido(a));
        Integer[] n = new Integer[]{4, 5, 6, 9};
        System.out.println("     maior: " + maior(n));
        System.out.println("   contido: " + contido(n, 7));
        System.out.println("  ordenado: " + ordenado(n));
        System.out.println("  repetido: " + repetido(n));
        System.out.println("intersecao: " + interseccao(n, new Integer[]{9, 5, 11}));
    }

    public static <T extends Comparable<T>> T maior(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }

    public static <T extends Comparable<T>> T maior(T[] a) {
        T max = a[0];
        for (T item : a) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }

    public static <T extends Comparable<T>> Boolean contido(T[] a, T target) {
        for (T item : a) {
            if (item.compareTo(target) == 0) {
                return true;
            }
        }
        return false;
    }

    public static <T extends Comparable<T>> Boolean ordenado(T[] a) {
        T anterior = a[0];
        for (T item : a) {
            if (item.compareTo(anterior) < 0) {
                return false;
            }
            anterior = item;
        }
        return true;
    }

    public static <T extends Comparable<T>> Boolean repetido(T[] a) {
        Set<T> jaTem = new TreeSet<>();
        for (T item : a) {
            if (jaTem.contains(item)) {
                return true;
            }
            jaTem.add(item);
        }
        return false;
    }

    public static <T extends Comparable<T>> Set<T> interseccao(T[] a, T[] b) {
        Set<T> inteseccao = new TreeSet<>();
        Set<T> primeiro = Set.of(a);
        for (T item : b) {
            if (primeiro.contains(item)) {
                inteseccao.add(item);
            }
        }
        return inteseccao;
    }

}

class Teste implements Comparable<Teste> {

    int id;

    @Override
    public int compareTo(Teste o) {
        return id > o.id ? +1 : id == o.id ? 0 : -1;
    }

}
