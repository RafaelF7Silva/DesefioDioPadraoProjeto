package br.com.Rafael.strategy;

public class VentilacaoRapida implements ClimatizadorAmbiente{


    @Override
    public void ligar() {

    }

    @Override
    public void ventilar() {

    }

    @Override
    public void ventilacaolenta() {

    }

    @Override
    public void ventilacaomedia() {

    }

    @Override
    public void ventilacaorapida() {
        System.out.println("Ventilação rápida selecionda...");
    }

    @Override
    public void umidificar() {

    }

    @Override
    public void desligar() {

    }
}
