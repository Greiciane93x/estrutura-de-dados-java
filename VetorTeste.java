package ed; 

public class VetorTeste {
  public static void main(String[] args){
    Aluno a1 = new Aluno("Ane");
    Aluno a2 = new Aluno("Alice"); 
    
   Vrtor lista =  new Vetor(); 
   lista.adiciona(a1); 
   lista.adiciona(a2); 
    
    System.out.println(lista); 
  }  
}
