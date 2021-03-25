package br.espm.poo.aula06;

import br.espm.poo.aula05.Cliente;
import br.espm.poo.aula05.PessoaFisica;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Set nao suporta repeticoes
        Set<Integer> numeros = new HashSet<>();
        numeros.add(9);
        numeros.add(3);
        numeros.add(1);
        numeros.add(5);
        numeros.add(9);
        System.out.println(Arrays.toString(numeros.toArray()));

        Set<String> nomes = new TreeSet<>();
        nomes.add("Antonio");
        nomes.add("Victor");
        nomes.add("Fernanda");
        nomes.add("Rafael");
        nomes.add("Rafael");
        System.out.println(Arrays.toString(nomes.toArray()));

        // Suporta duplicacao de objetos ou referencias
        List<String> listanomes = new ArrayList<>();
        listanomes.add("Rafael");
        listanomes.add("Antonio");
        listanomes.add("Victor");
        listanomes.add("Fernanda");
        listanomes.add(null);
        listanomes.add("Rafael");
        listanomes.add(null);
        System.out.println(Arrays.toString(listanomes.toArray()));
        listanomes.remove("Rafael");
        listanomes.remove(null);
        listanomes.remove(null);
        Collections.sort(listanomes);
        System.out.println(Arrays.toString(listanomes.toArray()));

        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "Rafael");
        map.put(4, "Antonio");
        map.put(10, "Julia");
        map.put(8, "Guimaraes");
        map.put(2, "Rafael");
        System.out.println(map.toString());
        map.put(4, "Freitag");
        System.out.println(map.toString());

        Map<String, Cliente> findByID = new TreeMap<>();
        Map<String, Cliente> findByNome = new TreeMap<>();
        Map<String, Cliente> findByCpf = new TreeMap<>();

        PessoaFisica pf1 = new PessoaFisica();
        pf1.setNome("Humberto");
        pf1.setCpf("234.234.234-34");

        PessoaFisica pf2 = new PessoaFisica();
        pf2.setNome("Ana Clara");
        pf2.setCpf("34.54.2334.342");

        findByID.put(pf1.getId(), pf1);
        findByNome.put(pf1.getNome(), pf1);
        findByCpf.put(pf1.getCpf(), pf1);
        findByID.put(pf2.getId(), pf2);
        findByNome.put(pf2.getNome(), pf2);
        findByCpf.put(pf2.getCpf(), pf2);

        System.out.println(findByID.toString());
        System.out.println(findByNome.toString());

        System.out.println(findByNome.get("Ana Clara"));
        findByNome.get("Ana Clara").setTelefone("123");
        System.out.println(findByCpf.get("34.54.2334.342"));

    }

}
