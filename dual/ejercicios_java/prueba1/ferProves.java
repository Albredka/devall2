import java.util.ArrayList;

import jdk.jshell.execution.Util;

public class ferProves {

	// Proves apartat 2

	// He considerat que la matricula hauria de ser privada doncs una matricula sempre es la mateixa i per tant no hauria de poderse modificar fora de la clase, sino dins d'aquesta amb els getters i setters en cas d'error, en canvi, la anitguitat si que es variable amb el pas del temps. 

	public static class Vehicle {

		protected String matricula;
		protected int antiguitat;
		protected static int maximaAntiguitat;

		// Proves apartat 3

		// Constructors

		public Vehicle() {

		}

		public Vehicle(String matricula, int antiguitat) {

			this.matricula = matricula;
			this.antiguitat = antiguitat;

			if (this.antiguitat > maximaAntiguitat) {
				maximaAntiguitat = this.antiguitat;
			}
		}

		// Proves apartat 4

		// Getters

		public String getMatricula() {

			return matricula;
		}

		public int getAntiguitat() {
			return antiguitat;
		}

		// Setters

		// Aquest metode setter permetra cambiar el valor de la propietat matricula que
		// es "private", ja que

		public void setMatricula(String novaMatricula) {
			this.matricula = novaMatricula;
		}

		public void setAntiguitat(int novaAntiguitat) {
			this.antiguitat = novaAntiguitat;
		}

		// ToString

		public String toString() {
			if (this.antiguitat <= 0 && this.matricula.length() >= 6 && this.matricula.length() <= 9) {
				String r = String.valueOf(this.antiguitat) + " " + this.matricula;
				return r;
			} else {
				return null;
			}
		}
	}

	// Proves apartat 5

	public static class Utilitari extends Vehicle {

		// Propietat

		protected float VelocitatMax;
		protected Object pilot;

		// Constructor

		public void Utilitari(int novaVelocitatMax, Pilot p){
			
			this.VelocitatMax = novaVelocitatMax;
			this.pilot = p;
			
		}

		public void Utilitari(int novaVelocitatMax) {
			this.VelocitatMax = novaVelocitatMax;
		}

		// Getters

		public float getVelocitatMax() {
			return VelocitatMax;
		}

		// Setters

		public void setVelocitatMax(float novaVelocitatMax) {
			if (novaVelocitatMax >= 0) {
				this.VelocitatMax = novaVelocitatMax;
			}
		}

		// Proves apartat 6

		public void setMatricula(String novaMatricula) {
			char c = novaMatricula.charAt(0);
			if (c >= 'A' && c <= 'Z') {
				this.matricula = novaMatricula;
			}
		}

		// To string

		public String toString() {
			if (this.antiguitat <= 0 && this.matricula.length() >= 6 && this.matricula.length() <= 9) {
				String r = String.valueOf(this.antiguitat) + " " + this.matricula + " " + this.VelocitatMax;
				return r;
			} else {
				return null;
			}
		}

		// Proves apartat 7

		// Getter de maximaAntiguitat. Si, he hagut de crear una nova variable a d'alt,i fer un if per evaluar quina antiguitat es mes petita, crear un setter static per fer-lo un metode de clase.

		public static int getMaximaAntiguitat() {
			return maximaAntiguitat;
		}
	}

	// Proves apartat 8

	// Classe
	public class Pilot{
		String nom;
		Object utilitari;

	// Getter
		public String getNom(){
			return nom;
		}

	// Setter
		public void setNom(String nouNom){
			this.nom = nouNom;
		}

		public void assignarPilot(Pilot p){
			 
		}
	
	// Constructor
		public void Pilot(){

		}

		public void Pilot(Utilitari utilitari){
			this.utilitari = utilitari;
		}
		
	}

	public static void main(String[] args) {

		Vehicle vehicle1 = new Vehicle("1234ADFLA", 1);

		Vehicle vehicle2 = new Vehicle("1234ADFLB", 5);

		int r = Utilitari.getMaximaAntiguitat();

		System.out.println(r);
	}
}


	



