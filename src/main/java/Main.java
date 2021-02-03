public class Main {

    public static void main(String[] args) {

        //test();

        task5(5);

    }

    private static void task5(int numberOfCats) {
        Cat cats[] = new Cat[numberOfCats];
        Bowl bowl = new Bowl(80);
        for (int i = 0; i < numberOfCats; i++) {
            cats[i] = new Cat();
//            cats[i].getHungryLvl();
//            bowl.getValue();
            cats[i].eat(bowl);
            cats[i].isFull();
        }

    }

    public static void test() {
        Cat cat = new Cat();
        Bowl bowl = new Bowl();

        cat.getHungryLvl();
        bowl.getValue();

        cat.eat(bowl);

        cat.getHungryLvl();
        cat.isFull();
    }
}
