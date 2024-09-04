package desafios.iphone.model;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {


    @Override
    public void tocar() {
        System.out.println("Reproduzindo Música");
    }

    @Override
    public void pausar() {
        System.out.println("Música Pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando Música " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Deixando uma mensagem de voz na caixa postal...");
    }

    @Override
    public void exibirPaginaUrl(String link) {
        System.out.println("Exibindo o site " + link);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Exibindo novos links..");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando..");
    }
}
