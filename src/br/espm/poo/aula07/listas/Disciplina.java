package br.espm.poo.aula07.listas;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

public class Disciplina {

    private final String nome;
    private final String professor;

    private List<Aula> listaAula = new LinkedList<>();
    private Set<Aluno> listaAluno = new HashSet<>();

    public Disciplina(String nome, String professor) {
        this.nome = nome;
        this.professor = professor;
    }

    public void adicionarAula(Aula aula) {
        listaAula.add(aula);
    }

    public void adicionarAluno(Aluno aluno) {
        listaAluno.add(aluno);
    }

    public Boolean estaMatriculado(Aluno aluno) {
        return listaAluno.contains(aluno);
    }

    public Integer getNumeroDeAlunos() {
        return listaAluno.size();
    }

    public Integer getDuracaoTotal() {
        return listaAula.stream().mapToInt(Aula::getDuracao).sum();
//      forma canonica
//        Integer soma = 0;
//        for (Aula a: listaAula) {
//            soma += a.getDuracao();
//        }
//        return  soma;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "nome='" + nome + '\'' +
                ", professor='" + professor + '\'' +
                ", listaAula=" + listaAula +
                ", listaAluno=" + listaAluno +
                '}';
    }

}
