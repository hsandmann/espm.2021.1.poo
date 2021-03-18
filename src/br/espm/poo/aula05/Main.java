package br.espm.poo.aula05;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Cliente[] clientes = new Cliente[3];
        int indexCliente = 0;

        Scanner scanner = new Scanner(System.in);
        String line;
        do {
            System.out.print("> ");
            line = scanner.nextLine();
            switch (line) {
                case "help":
                    printMenu();
                    break;
                case "bye":
                    break;
                case "1":
                    clientes[indexCliente++ % clientes.length] = cadastrarCliente();
                    break;
                case "2":
                    listarClientes(clientes);
                    break;
                default:
                    System.out.println("Opcao invalida");
            }

        } while (!line.equals("bye"));

    }

    public static void printMenu() {
        System.out.println("--- Menu ---");
        System.out.println("1. Cadastra Cliente");
        System.out.println("2. Listar Clientes");
    }

    public static Cliente cadastrarCliente() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        return cliente;
    }

    public static void listarClientes(Cliente[] clientes) {
//        for (int i = 0; i < clientes.length; i++) {
//            Cliente c = clientes[i];
//            if (c != null) {
//                System.out.println(c.getUuid() + " - " + c.getNome());
//            }
//        }
        for (Cliente c : clientes) {
            if (c != null) {
                System.out.println(c.getUuid() + " - " + c.getNome());
            }
        }
    }

}
