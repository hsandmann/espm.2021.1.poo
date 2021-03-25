package br.espm.poo.aula05;

public class PessoaJuridica extends Cliente {

    PessoaJuridica() {
        super();
        this.conta.setLimite(1000);
    }

    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

}
