package br.espm.poo.aula05;

public class Conta {

    private double saldo;
    private double limite;

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new RuntimeException("Valor informado invalido (valor > 0)");
        }
        this.saldo += valor;
    }

    public void sacar(String valor) {
        this.sacar(Double.valueOf(valor));
    }

    public void sacar(double valor) {
        if ((saldo + limite) - valor < 0) {
            throw new RuntimeException("Saldo insuficiente");
        }
        this.saldo -= valor;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                ", limite=" + limite +
                '}';
    }

}
