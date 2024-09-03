package moduloII.estruturaExcecoes;

public class ExececaoPersonalizadaMain {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("12345678");
        } catch (ExcecaoPersonalizada e) {
            throw new RuntimeException(e);
        }
    }
    static String formatarCep(String cep) throws ExcecaoPersonalizada {
        if (cep.length() != 8) {
            throw new ExcecaoPersonalizada();

            return "12.3456-78";
        }
    }

