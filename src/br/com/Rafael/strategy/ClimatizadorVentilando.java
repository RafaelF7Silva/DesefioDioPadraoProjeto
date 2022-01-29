package br.com.Rafael.strategy;

public class ClimatizadorVentilando implements ClimatizadorAmbiente {


	@Override
	public void ligar() {

		}

	@Override
	public void ventilar() {
		System.out.println("Brisa ativada...");
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

