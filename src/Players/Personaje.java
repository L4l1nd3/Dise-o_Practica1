package Players;

public abstract class Personaje {
	int vida;
	int fuerza;
	int fortaleza;
	int stamina;
	
	String nombre;
	
	//Esto no se porque pero ya lo habíamos metido con el prfeo asi que!
	Estrategias strategy;
	Estado state;
	
	
	//Arma armado; A falta d eimplementar. 	 		
	Personaje(int vida, int fuerza, int fortaleza, int stamina, String nombre){
		this.vida = vida;
		this. fuerza = fuerza;
		this.fortaleza = fortaleza;
		this.stamina = stamina;
		this.nombre = nombre;
	}
		
}