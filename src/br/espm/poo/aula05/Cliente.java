package br.espm.poo.aula05;

import java.util.UUID;

public class Cliente {

    private final UUID uuid;
    private String nome;
    private Conta conta;

    public Cliente() {
        this.uuid = UUID.randomUUID();
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

}
