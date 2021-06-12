
```  public class Main {
   public static int fibonacci(int i){
      if(i<=1) return 1; 
      else {
       return fibo(i-1)+fibo(i-2); 
      }
    }
    public static void main(String[] args){
      ArrayList<Integer> listaFibonacci = new ArrayList<>(); 
        
       listaFibonacci.add(fibo(1));
        listaFibonacci.add(fibo(2));
        listaFibonacci.add(fibo(3));
       listaFibonacci.add(fibo(4));
        listaFibonacci.add(fibo(5));
        listaFibonacci.add(fibo(6));
        listaFibonacci.add(fibo(7));
        listaFibonacci.add(fibo(8));
        listaFibonacci.add(fibo(9));
        listaFibonacci.add(fibo(10));
    }
 }
 
