package br.espm.poo.aula07.listas;

public class Aula {

    private final String conteudo;
    private final Integer duracao;

    public Aula(String conteudo, Integer duracao) {
        this.conteudo = conteudo;
        this.duracao = duracao;
    }

    public String getConteudo() {
        return conteudo;
    }

    public Integer getDuracao() {
        return duracao;
    }

    @Override
    public String toString() {
        return "Aula{" +
                "conteudo='" + conteudo + '\'' +
                ", duracao=" + duracao +
                '}';
    }

}
