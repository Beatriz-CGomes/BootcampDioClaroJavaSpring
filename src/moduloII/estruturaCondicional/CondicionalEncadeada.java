package moduloII.estruturaCondicional;

public class CondicionalEncadeada {
    public static void main(String[] args) {
        //aqui é quando podemos ter uma terceira ou mais condições

        int nota = 6;

        if (nota >= 7) {
            System.out.println("Aprovado!");
        }
        else if(nota >= 5 && nota < 7) {
            System.out.println("Recuperação!");
        } else{
            System.out.println("Reprovado!");
        }

    }
}
