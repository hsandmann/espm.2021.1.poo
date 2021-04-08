package br.espm.poo.aula07.listas;

public class Main {

    public static void main(String[] args) {

        Disciplina poo = new Disciplina("POO", "Selmini");
        Disciplina orgarq = new Disciplina("Org. e Arq. de Computadores", "Humberto");

        poo.adicionarAula(new Aula("Introducao a Classes", 8));
        poo.adicionarAula(new Aula("Heranca", 4));

        System.out.println("Total de duracao: " + poo.getDuracaoTotal());

        Aluno fernanda = new Aluno(1, "Fernanda");
        Aluno miotti = new Aluno(7, "Miotti");
        Aluno freitag = new Aluno(6, "Freitag");

        poo.adicionarAluno(fernanda);
        poo.adicionarAluno(miotti);
        poo.adicionarAluno(freitag);

        System.out.println(poo);

        System.out.println(freitag.getNome() + ": " + poo.estaMatriculado(freitag));
        System.out.println(poo.getNumeroDeAlunos());

        Aluno f = new Aluno(6, "Sexta-feira");
        poo.adicionarAluno(f);
        System.out.println(f.getNome() + ": " + poo.estaMatriculado(f));
        System.out.println(poo.getNumeroDeAlunos());
        System.out.println(poo);

    }

}
