package ed; 

public class Vetor{ 
  private Aluno[] alunos = new Aluno[100]; 
  private int totalDeAlunos = 0; 
  
  
  // o algoritmo abaixo tem uma performance maior, porque ele não precisa 
  // varrer o array inteiro 
  public void adicionad(Aluno aluno){
    this.alunos(totalDeAlunos) = aluno; 
    totalDeAlunos++; 
  }
 // Um algoritmo de complexidade O (n) (linear) é aquele cujo crescimento no 
 // número de operações é diretamente proporcional ao crescimento do número de 
 //itens. É o caso de algoritmos de busca em uma matriz unidimensional não 
 //ordenada, por exemplo.
 // o que caracteriza uma baixa performance 
   
 // exemplo abaixo é um algoritmo complexidade O (n)
 // public void adiciona(Aluno aluno){
 //   for(int i = 0; i <= alunos.length; i++){
 //     if(alunos[i] == null){
 //       aluno[i] = aluno; 
 //        break; 
 //     }
 //   }
 // }
  public void pega(int posicao) {
    return null; 
  }
  public boolean contain(Aluno aluno){
    
    for(int = 0; i < alunos.length; i++){
      if(aluno.equals(alunos[i])){return true;}
    }
    return false; 
  }
  public int tamanho(){
    return totalDeAlunos; 
  }
  public String toString(){
    return Arrays.toString(alunos); 
  }
  

} 
