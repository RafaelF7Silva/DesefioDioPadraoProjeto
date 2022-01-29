package br.com.Rafael;

import br.com.Rafael.strategy.*;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		ClimatizadorAmbiente ligado =  new ClimatizadorLigado();
        ClimatizadorAmbiente ventilar = new ClimatizadorVentilando();
		ClimatizadorAmbiente lento = new VentilacaoLenta();
		ClimatizadorAmbiente media = new VentilacaoMedia();
		ClimatizadorAmbiente rapido = new VentilacaoRapida();
		ClimatizadorAmbiente umidificacao = new UmidificarAmbiente();
		ClimatizadorAmbiente desligado =  new ClimatizadorDesligado();


		Scanner teclado = new Scanner(System.in);
		int opcao = 0;


		System.out.println("=======CLIMATIZADOR DIO========");
		do {
			System.out.println("Selecione uma opção abaixo: ");
			System.out.println("1 - Ligar");
			System.out.println("2 - Modo Brisa");
			System.out.println("3 - Ventilação Lenta");
			System.out.println("4 - Ventilação Média");
			System.out.println("5 - Ventilação Rápida");
			System.out.println("6 - Sistema de Umidificação	");
			System.out.println("7 - Desligar");

			opcao = teclado.nextInt();
			Sistema cli = new Sistema();
			switch (opcao) {

				case 1:
				System.out.println("Iniciando o Cliamtizador Dio!");
				System.out.println();
				cli = new Sistema();
				cli.setComportamento(ligado);
				cli.ligar();
				System.out.println();
                 break;

				 case 2:

				cli.setComportamento(ventilar);
				cli.ventilar();
				System.out.println();
				break;

				case 3:
				cli.setComportamento(lento);
				cli.lento();

				break;

				case 4:
				System.out.println();
				System.out.println("Opção média selecionada..");
				System.out.println();
				cli.setComportamento(media);
				cli.media();
					break;

				case 5:
				System.out.println();
				System.out.println("Opção rápida selecionada..");
				System.out.println();
				cli.setComportamento(rapido);
				cli.rapido();

				break;

				case 6:
				System.out.println();
				cli.setComportamento(umidificacao);
				cli.umidificar();
				System.out.println();

				case 7:
				System.out.println("Opção desligar selecionada..");
				System.out.println();
				cli.setComportamento(desligado);
				cli.desligar();


				case 0:
				break;


				default:
					System.out.println("Opção Invalida");
			    break;
			}
		}
			while (opcao > 0) ;
			teclado.close();
		}

	}


