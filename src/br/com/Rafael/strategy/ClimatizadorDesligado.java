package br.com.Rafael.strategy;

public class ClimatizadorDesligado implements ClimatizadorAmbiente{
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

    }

    @Override
    public void umidificar() {

    }

    @Override
    public void desligar() {
        System.out.println("O climatizador está desligando!");
    }
}
