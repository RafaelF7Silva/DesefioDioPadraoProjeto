package br.com.Rafael.strategy;

public class Sistema {

	private ClimatizadorAmbiente comportamento;

	public void setComportamento(ClimatizadorAmbiente comportamento) {
		this.comportamento = comportamento;
	}

	public void ligar() {

		comportamento.ligar();
	}

	public void ventilar() {

		comportamento.ventilar();

	}

	public void lento() {

		comportamento.ventilacaolenta();

	}

	public void media() {

		comportamento.ventilacaomedia();
	}
	public void rapido() {

		comportamento.ventilacaorapida();
	}

	public void umidificar() {

		comportamento.umidificar();

	}

	public void desligar() {

		comportamento.desligar();
	}

}