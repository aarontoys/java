package challenges;
import java.util.HashMap;

public class Zombie implements Person{

	String name;
	int health;
	Human[] knownHumans;
	String[] victimPleas;
	HashMap<String, Human[]> stomachContents;

	// Constructors
	public Zombie(String name){
		this.name = name;
		this.health = 0;
	}

	public Zombie(String name, int health){
		this.name = name;
		this.health = health;
	}

	public void search(Human[] humans){
		// create a temp variable for sorting purposes
		Human temp = null;

		// zombie will zone in on the youngest human it locates, so
		// bubble sort the victims so that the youngest is listed first
		for(int i = 0; i < humans.length-1; i++){
			for(int j = 1; j < humans.length-i; j++){
				if(humans[j-1].age > humans[j].age){
					temp = humans[j-1];
					humans[j-1] = humans[j];
					humans[j] = temp;
				}			
			}
		}
		this.knownHumans = humans; 
	}

	public String eat(){
		// zombie eats the youngest human it finds
		// listens to them plea
		// obvs doesn't care
		String victimPlea = this.knownHumans[0].plea;

		// youngest human is now dead :(
		this.knownHumans[0].eaten = true;

		// victim is now in the stomach of the zombie
		// gross
		this.stomachContents = new HashMap<String, Human[]>();
		// stomachContents.put(this.name, new Human[]{this.knownHumans[0]});

		Human[] eatenVictims = this.stomachContents.get(this.name);

		if(eatenVictims == null){
			stomachContents.put(this.name, new Human[]{this.knownHumans[0]});
		} else {
			Human[] cpArr = new Human[eatenVictims.length*2];
			for(int i = 0; i < eatenVictims.length; i++){
				cpArr[i] = eatenVictims[i];
				System.out.println("info being copied over: " + cpArr[i].name);
			}
			cpArr[eatenVictims.length+1] = this.knownHumans[0];
			System.out.println("human being eaten: " + this.knownHumans[0].name);
			stomachContents.put(this.name, cpArr);
			System.out.println("zombie name: " + this.name);
		}

		System.out.println(stomachContents.get(this.name).length);

		// zombie gains health point from eating the youngest human
		health++;
		
		// humans have managed to run away as the zombie was eating
		// empty the array of zombie's known humans
		this.knownHumans = new Human[0];

		return victimPlea;
	}

	@Override
	public boolean isDead(){
		return true;
	}
}
