package moduloII.estruturaExcecoes;

import java.text.NumberFormat;
import java.text.ParseException;

public class Hierarquia {
    public static void main(String[] args) {

        Number valor = Double.valueOf("a1.75");
        System.out.println(valor);

        Number valor2;
        try {
            valor2 = NumberFormat.getInstance().parse("a1.67");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        System.out.println(valor2);
    }
}
