package br.com.senaisp.bauru.juliana.licao04.exercicio;

import java.util.Random;

public class MetodosCalculo {

		/**
		 * Metodo que calcula a temperatura Celsius a partir de uma
		 * temperatura em Fahrenheit.
		 * @param temp Informar a temperatura em ºF
		 * @return Retorna a temperatura em ºC
		 */
		public double converterF2c (double temp) {
			return (temp - 32 ) * 5 / 9;
		}
		
		/**
		 * Metodo que calcula a hipotenusa
		 * @param co informar o cateto oposto
		 * @param ca informar o cateto adjacente
		 * @return Retorna o valor da hipotenusa
		 */
		
		public double calcularHipotenusa(double co, double ca) {
			return Math.sqrt(Math.pow(co, 2)+Math.pow(ca, 2) );
		}
		
		public int jogarDados( ) {
			Random rnd = new Random();
			return rnd.nextInt(6)+1+ rnd.nextInt(6)+1;
		}

}
