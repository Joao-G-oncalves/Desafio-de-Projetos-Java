package celular;

import navegador.NavegadorInternet;
import player.ReprodutorMusical;
import telefone.AparelhoTelefonico;

public class IPhone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico {

    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo...");
    }

    @Override
    public void inicarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando Música!");
    }

    @Override
    public void pausar() {
        System.out.println("Música Pausada");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Música Selecionada");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página!");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página!");
    }


}
