public class Cat {
    private String name;
    private boolean satiety;
    private final int DEFAULT_APPETITE = 50;

    public Cat(String name) {
        this.name = name;
    }
    public boolean eat (Plate plate){
        if(plate.dereaceFood(DEFAULT_APPETITE)){
            System.out.println("Cat " +name+" eats...");
            satiety = true;
        }else {
            return false;
        }

        return false;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", satiety=" + satiety +
                '}';
    }
}
