package moduloII.estruturaRepeticao;

public class BreakAndContinue {
    public static void main(String[] args) {
        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3) {
                continue; //saía de comando 1 2 4 5
                //break; //saída de comando 1 2
            }
            System.out.println(numero);
        }
    }
}
