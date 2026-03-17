package domain;

public class Estudante {
    public String nome;
    public int idade;
    public String turma;

    public Estudante(String nome, int idade, String turma) {
        this.nome = nome;
        this.idade = idade;
        this.turma = turma;
    }

    public String getEstudante() {
        return "\nAluno: " + nome + "\nIdade: " + idade + "\nTurma: " + turma;
    }


}
