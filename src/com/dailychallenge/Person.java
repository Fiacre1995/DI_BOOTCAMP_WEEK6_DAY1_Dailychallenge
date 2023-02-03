package com.dailychallenge;



public class Person {
	
	private String nom;
	private int age;
	private double salaire;
	
	public Person() {
				
			}
	
	

	public Person(String nom, int age, double salaire) {
		
		this.nom = nom;
		this.age = age;
		this.salaire = salaire;
	}



	public Person(String nom, int age) {
		super();
		this.nom = nom;
		this.age = age;
		this.salaire = -1; 
	}
	
	

	public void displayInfo() {
	
			System.out.println(this.nom);
			System.out.println(this.age);
			System.out.println(this.salaire);
			
	}

	public static void main(String[] args) {
		
		Person person = new Person();
		person.displayInfo();
		
		Person personne = new Person("dion", 20, 1500);
		personne.displayInfo();
		
		Person personne1 = new Person("KAMATE", 10);
		personne1.displayInfo();
		
	}

}
