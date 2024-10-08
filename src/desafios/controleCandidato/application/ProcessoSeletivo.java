package desafios.controleCandidato.application;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("\tProcesso seletivo");
        String[] candidatos = {"FELIPE", "MARCIA", "PAULO", "AUGUSTO", "MONICA"};
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato) {
        int tentativaRealizadas = 1;
        boolean continuaTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuaTentando = !atendeu;

            if (continuaTentando) {
                tentativaRealizadas++;
            } else {
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }
        } while (continuaTentando && tentativaRealizadas < 3);
        if (atendeu) {
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativaRealizadas + " TENTIVAS");
        } else {
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO DE TENTIVAS " + tentativaRealizadas + " REALIZADAS");
        }

    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados() {
        String[] candidatos = {"FELIPE", "MARCIA", "PAULO", "AUGUSTO", "MONICA"};
        System.out.println("Imprimindo a lista de candidatos informando o indicde do elemento");
        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de nº " + (indice + 1) + " é" + candidatos[indice]);
        }

        System.out.println("Forma abrevida de interação for each");
        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado " + candidato);
        }

    }

    static void selecaoCandidatos() {
        String[] candidatos = {"FELIPE", "MARCIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "JULIANA", "BEATRIZ", "MARCIO", "LARISSA"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário: " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionada para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2000);
    }

    static void analisarCandidato(double SalarioPretendido) {
        double salaBase = 2000.0;
        if (salaBase > SalarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salaBase == SalarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DEMAIS CANDIDATOS");
        }
    }
}
