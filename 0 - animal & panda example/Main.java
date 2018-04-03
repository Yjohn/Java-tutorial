public class Main {

    public static void main(String[] args) {

        Animal animal1 = new Animal(); // constructed with blank values
        Animal animal2 = new Animal("cat","white",7);

        Panda panda1 = new Panda("panda","white&black", 20, 10);

        System.out.println(panda1.getName());
        System.out.println(panda1.getLevelOfCuteness());
    }

}