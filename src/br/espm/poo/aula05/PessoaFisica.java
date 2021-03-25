package br.espm.poo.aula05;

public class PessoaFisica extends Cliente {

    private String cpf;

    public PessoaFisica() {
        super();
        this.conta.setLimite(100);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String getNome() {
        return "PF: " + super.getNome();
    }

}
