
public class Animal implements Comparable<Animal>{

	int numLegs;
	String name;

	public String toString(){
		return name + " has " + numLegs + " legs.";
	}

	public int getLegs(){
		return this.numLegs;
	}

	public int compareTo(Animal a){
		return this.getLegs() - a.getLegs();	
	}

}