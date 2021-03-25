package br.espm.poo.aula05;

import java.util.UUID;

public abstract class Cliente {

    private final UUID uuid;
    private String nome;
    private String telefone;
    protected Conta conta;

    protected Cliente() {
        this.uuid = UUID.randomUUID();
        this.conta = new Conta();
    }

    public final String getId() {
        return uuid.toString();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (null == nome || nome.trim().length() == 0) {
            throw new RuntimeException("Nome nao pode ser vazio");
        }
        this.nome = nome.trim();
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "uuid=" + uuid +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", conta=" + conta +
                '}';
    }

}
