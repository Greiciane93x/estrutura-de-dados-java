package ed;

import java.util.Arrays;

public class Vetor {
    private Aluno[] alunos = new Aluno[100];
    private int totalDeAlunos = 0;

//    public void adiciona(Aluno aluno){
//        this.alunos(totalDeAlunos) = aluno;
//        totalDeAlunos++;
//    }
//    public void pega(int posicao){return null;}
    public boolean contain(Aluno aluno){
        for(int i = 0; i < alunos.length; i++){
            if(aluno.equals(alunos[i])){return true;}
        }
        return false;
    }
    public int tamanho() {return totalDeAlunos;}
    public String toString(){return Arrays.toString(alunos);}
}
