package Players;
//Se deberá emplear un patrón Abstract Factory para crear los diferentes
//enemigos. Existirán varios tipos de enemigos, comunes a todos los mundos/escenarios pero
//adaptados a cada mundo/escenario

//Habrá distintas categorías de enemigos (guerreros, hechiceros, mutantes…), cada uno
//con sus características propias.
//Las mismas categorías aplican en todos los mundos/escenarios, pero en cada uno de
//dichos mundos cada categoría de enemigo presenta características diferentes (por
//ejemplo, los brujos de la selva podrían hacer vuelos cortos y los brujos del mar vuelos
//largos).

public abstract class Enemy extends Personaje {
	
	Enemy(int intelecto, int fuerza, int HP, int mana, String nombre) {
		super(intelecto, fuerza, HP, mana, nombre);
		// TODO Auto-generated constructor stub
	}

}
