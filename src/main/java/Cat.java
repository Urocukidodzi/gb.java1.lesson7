import java.util.Random;

public class Cat {

    int countCat = 0;
    String name;
    boolean isFull = false;
    int hungryLvl;

    public Cat(int hungryLvl){
        countCat++;
        this.name = "HUNGRYcat"+ countCat;
        Random random = new Random();
        this.hungryLvl=hungryLvl;
    }
    public Cat(){
        countCat++;
        this.name = "HUNGRYcat"+ countCat;
        Random random = new Random();
        this.hungryLvl = random.nextInt(15)+10;
    }

    public void isFull() {
        System.out.println("the cat is full? It is " + isFull);
    }

    public void getHungryLvl() {
        System.out.println(name + " want eat " + hungryLvl + " bits of food.");
    }

    public void eat(Bowl bowl){
        if (bowl.value-hungryLvl>=0){
            bowl.value-=hungryLvl;
            hungryLvl = 0;
            this.isFull=true;
//        } else {
//            System.out.println("need another bowl, few food");
        }


    }
}
