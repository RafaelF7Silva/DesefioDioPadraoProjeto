package br.com.Rafael.strategy;

public class ClimatizadorLigado implements ClimatizadorAmbiente {


	@Override
	public void ligar() {

			System.out.println("O climatizador está ligado!");
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

	}
}

