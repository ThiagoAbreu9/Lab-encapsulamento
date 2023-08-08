package br.edu.ufam.icomp.lab_encapsulamento;

import java.util.Random;

public class CarroLuxuoso extends Carro implements Localizavel{

	public CarroLuxuoso(String placa) {
		super(placa);
		// TODO Auto-generated constructor stub
	}
	@Override
	public Posicao getPosicao() {
		double latMinima = -2.960000;
		double latMaxima = -3.160000;
		
		double lonMinima = -59.820000;
		double lonMaxima = -60.120000;
		
		double altMinima = 15.0;
		double altMaxima = 100.0;
		
		Random aleatorio = new Random();
		
		//double latitude = valorMinimo + (valorMaximo - valorMinimo) * r.nextDouble();
		
		double latitude = latMinima + (latMaxima - latMinima) * aleatorio.nextDouble();
		
		double longitude = lonMinima + (lonMaxima - lonMinima) * aleatorio.nextDouble();
		
		double altitude = altMinima + (altMaxima - altMinima) * aleatorio.nextDouble();
		
		return new Posicao (latitude, longitude, altitude);
				
	}
	@Override
	public double getErroLocalizacao() {
		// TODO Auto-generated method stub
		return 15;
	}

}
