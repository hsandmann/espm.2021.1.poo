package br.espm.poo.aula05;

import java.util.List;

public class PessoaJuridica extends Cliente {

    private String cnpj;
    private List<PessoaFisica> funcionarios;

    PessoaJuridica() {
        super();
        this.conta.setLimite(1000);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<PessoaFisica> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<PessoaFisica> funcionarios) {
        this.funcionarios = funcionarios;
    }

}
