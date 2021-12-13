public class Main {
    public static void main(String[] args) {
       Cat[] cats = new Cat[]{
               new Cat("Misov"),
               new Cat("Pisov"),
               new Cat("Dechk")
       };
       Plate plate = new Plate(100);

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
        }
        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i]);
        }

    }



}
