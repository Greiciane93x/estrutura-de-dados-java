package ed;

public class Aluno {
    public String nome;
    public Aluno(String nome) {this.nome = nome;}
    public String getNome(){return nome;}

    @Override
    public boolean equals(Object object) {
        if(object == null) {return false;}
        Aluno outro = (Aluno) object;
        return outro.getNome().equals(this.nome);
    }
    public String toString(){return nome; }

}
