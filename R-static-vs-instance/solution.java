1.

public class Tree {
	private double height; // non-static because height differs between each tree
	private int numberOfBranches; // non-static because number of branches differs between each tree
	public static final double AVERAGE_TREE_HEIGHT = 20; // static because average tree height has nothing to do with individual tree and doesn't change
	public static final String COLOR = "Green"; // could be static or non-static depending on your rationalization

	public Tree(double height, int numberOfBranches) {
		this.height = height;
		this.numberOfBranches = numberOfBranches;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getNumberOfBranches() {
		return numberOfBranches;
	}

	public void setNumberOfBranches(int numberOfBranches) {
		this.numberOfBranches = numberOfBranches;
	}
}

2.
public class Main {

    public static void main(String[] args) {

        Tree tree = new Tree(35, 112);

        if (tree.getHeight() < Tree.AVERAGE_TREE_HEIGHT) {
            System.out.println("This tree is shorter than average");
        }
        else {
            System.out.println("This tree is taller than average");
        }

    }

}
