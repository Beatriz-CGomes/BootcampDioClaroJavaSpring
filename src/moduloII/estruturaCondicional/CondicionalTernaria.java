package moduloII.estruturaCondicional;

public class CondicionalTernaria {
    public static void main(String[] args) {
        //aqui é um if e else de uma forma estruturada

        int nota = 7;
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);

        //aqui é encadeada
        String resultado2 = nota >= 7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado2);
    }
}
