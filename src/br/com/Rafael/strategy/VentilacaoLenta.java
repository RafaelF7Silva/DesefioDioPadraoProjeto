package br.com.Rafael.strategy;

public class VentilacaoLenta implements ClimatizadorAmbiente {


    @Override
    public void ligar() {

    }

    @Override
    public void ventilar() {

    }

    @Override
    public void ventilacaolenta() {
        System.out.println("Ventilação lenta selecionada...");
    }

    @Override
    public void ventilacaomedia() {

    }

    @Override
    public void ventilacaorapida() {

    }

    @Override
    public void umidificar() {

    }

    @Override
    public void desligar() {

    }
}
