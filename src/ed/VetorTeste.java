package ed;

public class VetorTeste {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ane");
        Aluno a2 = new Aluno("Alice");

        Vetor lista = new Vetor();

        System.out.println(lista.tamanho());
        lista.adiciona(a1);
        System.out.println(lista.tamanho());
        lista.adiciona(a2);
        System.out.println(lista);
        System.out.println(lista.contain(a1));

        Aluno a3 = new Aluno("Assis");
        System.out.println(lista.contain(a3));

        Aluno x = lista.pega(1);
        System.out.println(x);


    }
}
