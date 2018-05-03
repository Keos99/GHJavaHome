public class MainBox {
    public static void main(String[] args) {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();
        Apple apple5 = new Apple();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        Orange orange4 = new Orange();

        Box<Apple> appleBox = new Box<>(apple1);
        appleBox.add(apple2);
        Box<Apple> appleBox1 = new Box<>(apple3, apple4, apple5);
        Box<Orange> orangeBox = new Box<>(orange1);
        orangeBox.add(orange2);
        Box<Orange> orangeBox1 = new Box<>(orange3,orange4);

        System.out.println(appleBox.compare(orangeBox));
        System.out.println(appleBox.compare(appleBox1));
        System.out.println(orangeBox1.compare(orangeBox));
        appleBox.pepper(appleBox1);
        orangeBox.pepper(orangeBox1);
        System.out.println(appleBox.getFruitList());
        System.out.println(orangeBox.getFruitList());
        System.out.println(appleBox1.getFruitList());
        System.out.println(orangeBox1.getFruitList());
    }
}
