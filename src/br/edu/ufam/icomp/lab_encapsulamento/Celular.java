package br.edu.ufam.icomp.lab_encapsulamento;

import java.util.*;
public class Celular implements Localizavel{
	
	private int codPais, codArea, numero;
	
	
	public Celular(int codPais, int codArea, int numero) {
		
		setCodPais(codPais);
		setCodArea(codArea);
		setNumero(numero);
	}
	
	public final void setCodPais(int codPais) {
		
		if(codPais >= 1 && codPais <= 1999) {
			this.codPais = codPais;
		}else {
			this.codPais = -1;
		}
	}
	
	public int getCodPais() {
		return codPais;
	}
	
	public final void setCodArea(int codArea) {
		
		if(codArea >= 10 && codArea <= 99) {
			this.codArea = codArea;
		}else {
			this.codArea = -1;
		}
	}
	public int getCodArea() {
		return codArea;
	}
	
	public final void setNumero(int numero) {
		if(numero >= 10000000 && numero <= 999999999) {
			
			this.numero = numero;
		}else {
			
			this.numero = -1;
		}
	}
	
	public int getNumero() {
		return numero;
	}
	
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
	
	public double getErroLocalizacao() {
		return 50.0;
	}
}
