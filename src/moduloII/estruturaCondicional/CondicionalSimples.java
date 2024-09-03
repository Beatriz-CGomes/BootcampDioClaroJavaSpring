package moduloII.estruturaCondicional;

public class CondicionalSimples {
    public static void main(String[] args) {
        //a estrutura condicional pode ser simples ou composta

        //condicional simples ocorre quando uma validação de execução de fluxo somente quando a condição for positiva, consideramos como uma estrutura simples

        //condição simples tem apenas o fluxo de sim ou não, positiva ou negativa

        double saldo = 25.0;
        double valorSolicitado = 17.0;

        //essa condição precisa ser verdadeira para a instrução ser executada
        if (valorSolicitado < saldo)
            saldo = saldo - valorSolicitado;

        System.out.println(saldo);

    }
}
