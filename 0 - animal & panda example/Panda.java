/**
 * Created by thomas on 12/3/17.
 */
public class Panda extends Animal {

	private int levelOfCuteness;

	public Panda(String newName, String color, int newAge, int newLevelOfCuteness) {
		super(newName,color,newAge); // call parent constructor
		setLevelOfCuteness(newLevelOfCuteness);
	}

	public int getLevelOfCuteness() {
		return this.levelOfCuteness;
	}

	private void setLevelOfCuteness(int levelOfCuteness) {
		if (levelOfCuteness > 10) {
			this.levelOfCuteness = 10;
		}
		else {
			this.levelOfCuteness = levelOfCuteness;
		}
	}

	// override "eat" method in parent class
	@Override
	public void eat() {
		System.out.println("eating bamboo");
	}
}
