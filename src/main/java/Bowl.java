import java.util.Random;

public class Bowl {

    int value = 0;

    public Bowl() {
        Random random = new Random();
        this.value = random.nextInt(70) + 10;
    }

    public Bowl(int value) {
        this.value = value;
    }

    public void addValue(int addValue) {
        if (addValue > 0) {
            this.value = value + addValue;
        }
    }

    public void getValue() {
        System.out.println("in bowl " + value + " bit of food");
    }
}
