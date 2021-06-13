package ed; 

public class Vetor{ 
  private Aluno[] alunos = new Aluno[100]; 
  public void adiciona(Aluno aluno){
    for(int i = 0; i <= alunos.length; i++){
      if(alunos[i] == null){
        aluno[i] = aluno; 
         break; 
      }
    }
  }
  public void pega(int posicao) {
    return null; 
  }
  public boolean contain(Aluno aluno){
    return false; 
  }
  public int tamanho(){
    return 0; 
  }
  public String toString(){
    return Arrays.toString(alunos); 
  }
  

} 
