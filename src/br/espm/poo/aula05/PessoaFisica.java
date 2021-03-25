package br.espm.poo.aula05;

import java.util.List;

public final class PessoaFisica extends Cliente {

    private String cpf;
    private List<PessoaFisica> dependentes;
    private PessoaJuridica empresa;

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

    public List<PessoaFisica> getDependentes() {
        return dependentes;
    }

    public void setDependentes(List<PessoaFisica> dependentes) {
        this.dependentes = dependentes;
    }

    public PessoaJuridica getEmpresa() {
        return empresa;
    }

    public void setEmpresa(PessoaJuridica empresa) {
        this.empresa = empresa;
    }

}
