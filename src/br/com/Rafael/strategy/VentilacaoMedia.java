package br.com.Rafael.strategy;

public class VentilacaoMedia implements ClimatizadorAmbiente{
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
        System.out.println("Ventilação média selecionda...");
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
