package desafios.iphone.application;

import desafios.iphone.model.Iphone;

import java.util.Scanner;

public class IphoneMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Iphone iphone1 = new Iphone();
        Iphone iphone2 = new Iphone();

        //funcionalidade do Reprodutor Musical
        iphone1.selecionarMusica("Adele -  Love int the dark");
        iphone1.tocar();
        iphone1.pausar();

        iphone2.pausar();
        iphone2.tocar();
        iphone2.selecionarMusica("Metallica - Nothing else matters");


        //funcionalidade do Aparelho Telefonico
        iphone1.ligar("99999999");
        iphone1.atender();
        iphone1.iniciarCorreioVoz();

        iphone2.atender();
        iphone2.ligar("8888888");
        iphone2.iniciarCorreioVoz();

        //funcionalidade Navegador Internet
        iphone1.exibirPaginaUrl("www.google.com.br");
        iphone1.atualizarPagina();
        iphone1.adicionarNovaAba();

        iphone2.exibirPaginaUrl("www.youtube.com.br");
        iphone2.adicionarNovaAba();
        iphone2.atualizarPagina();


        sc.close();
    }
}
