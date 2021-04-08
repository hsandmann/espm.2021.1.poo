package br.espm.poo.aula07.listas;

import java.util.Objects;

public class Aluno {

    private final Integer rm;
    private final String nome;

    public Aluno(Integer rm, String nome) {
        this.rm = rm;
        this.nome = nome;
    }

    public Integer getRm() {
        return rm;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(rm, aluno.rm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rm);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "rm=" + rm +
                ", nome='" + nome + '\'' +
                '}';
    }

}
