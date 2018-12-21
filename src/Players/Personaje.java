package Players;
// Sería la polla tenr esta clase para los personajes, luego 2 para enemigos y mainCharacter y 
// luego cada tipo de enemigo, (mago agua, mago fuego, mago aire, mago...)
public abstract class Personaje {
	int intelecto, fuerza, HP, mana; //Atributos principales.
	String nombre;
	
	
	Estrategias strategy;
	Estado state;
	
	
	//Arma armado; A falta d eimplementar.
	Personaje(int intelecto, 
			int fuerza,
			int HP, 
			int mana, 
			String nombre){
		
	this.intelecto = intelecto;
	this. fuerza = fuerza;
	this.HP = HP;
	this.mana = mana;
	this.nombre = nombre;
	}
		
}