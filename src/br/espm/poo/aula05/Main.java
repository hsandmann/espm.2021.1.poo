package br.espm.poo.aula05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Cliente> clientes = new ArrayList<>();
        int indexCliente = 0;

        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        String line;
        while (running) {
            System.out.print("> ");
            line = scanner.nextLine();
            switch (line.toLowerCase()) {
                case "help":
                    printMenu();
                    break;
                case "bye":
                case "exit":
                    running = false;
                    break;
                case "1":
                case "add":
                    clientes.add(cadastrarCliente());
                    break;
                case "2":
                case "list":
                    listarClientes(clientes);
                    break;
                case "3":
                case "deL":
                    System.out.println("Para fazer. TODO");
                case "4":
                case "sacar":
                    System.out.println("Para fazer. TODO");
                    // TODO: se pessoa fisica so pode sacar ate 500
                    // TODO: se PJ pode sacar ate 2000
                case "5":
                case "depositar":
                    System.out.println("Para fazer. TODO");
                case "6":
                case "Buscar":
                    System.out.println("Buscar pelo nome. TODO");
                default:
                    System.out.println("Opcao invalida");
            }

        }
        System.out.println("Bye bye!");

    }

    public static void printMenu() {
        System.out.println("--- Menu ---");
        System.out.println("1. Cadastra Cliente");
        System.out.println("2. Listar Clientes");
    }

    public static Cliente cadastrarCliente() {
        Scanner scanner = new Scanner(System.in);

        Cliente cliente = null;

        String tipoPessoa = inputTipoPessoa();
        switch (tipoPessoa) {
            case "j":
                cliente = cadastrarPJ();
                break;
            case "f":
                cliente = cadastrarPF();
                break;
        }

        System.out.print("Nome: ");
        cliente.setNome(scanner.nextLine());

        System.out.print("Telefone: ");
        cliente.setTelefone(scanner.nextLine());

        return cliente;
    }

    public static void listarClientes(List<Cliente> clientes) {
//        for (int i = 0; i < clientes.length; i++) {
//            Cliente c = clientes[i];
//            if (c != null) {
//                System.out.println(c.getUuid() + " - " + c.getNome());
//            }
//        }
//        for (Cliente c : clientes) {
//            if (c != null) {
//                System.out.println(c.getUuid() + " - " + c.getNome());
//            }
//        }
//        Arrays.stream(clientes).forEach(c -> {
//            if (c != null) {
//                System.out.println(c);
//            }
//        });
        clientes.forEach(cliente -> {
            System.out.println(cliente.getClass().getName());
            if (cliente instanceof PessoaFisica) {
                PessoaFisica pf = (PessoaFisica) cliente; // cast de tipo
                System.out.println(pf.getCpf() + " - " + cliente);
            } else if (cliente instanceof PessoaJuridica) {
                PessoaJuridica ph = (PessoaJuridica) cliente;
                System.out.println(cadastrarPJ().getCnpj() + " - " + cliente);
            }
        });
    }

    private static String inputTipoPessoa() {
        String tipoPessoa = null;
        while (tipoPessoa == null) {
            System.out.print("Pessoa Juridica (j) ou Pessoa Fisica (f): ");
            tipoPessoa = new Scanner(System.in).nextLine();
            if (!"f".equals(tipoPessoa) && !"j".equals(tipoPessoa)) {
                tipoPessoa = null;
                System.out.println("Opcao invalida, aceito apenas f ou p");
            }
        }
        return tipoPessoa;
    }

    private static PessoaFisica cadastrarPF() {
        System.out.print(" CPF: ");
        String cpf = new Scanner(System.in).nextLine();

        PessoaFisica pf = new PessoaFisica();
        pf.setCpf(cpf);
        return  pf;
    }

    private static PessoaJuridica cadastrarPJ() {
        System.out.print("CNPJ: ");
        String cnpj = new Scanner(System.in).nextLine();

        PessoaJuridica pj = new PessoaJuridica();
        pj.setCnpj(cnpj);
        return pj;
    }

}
