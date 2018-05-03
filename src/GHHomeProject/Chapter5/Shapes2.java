package GHHomeProject.Chapter5;

class TwoDShape2 {
    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    void showDim(){
        System.out.println("Ширина и высота: " + width + " и " + height);
    }
}

class Triangle2 extends TwoDShape2{
    String style;

    double area(){
        return getWidth() * getHeight() / 2;
    }
    void showStyle(){
        System.out.println("Треугольник " + style);
    }
}

public class Shapes2 {
    public static void main(String[] args) {
        Triangle2 triangle1 = new Triangle2();
        Triangle2 triangle2 = new Triangle2();

        triangle1.setWidth(4.0);
        triangle1.setHeight(4.0);
        triangle1.style = "Закрашенный";

        triangle2.setWidth(8.0);
        triangle2.setHeight(12.0);
        triangle2.style = "Контурный";

        System.out.println("Информация о t1: ");
        triangle1.showDim();
        triangle1.showStyle();
        System.out.println("Площадь t1: " + triangle1.area());

        System.out.println("Информация о t2: ");
        triangle2.showDim();
        triangle2.showStyle();
        System.out.println("Площадь t2: " + triangle2.area());
    }
}
