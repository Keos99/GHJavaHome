package Chapter5;

class TwoDShape3 {
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
        System.out.println("Ширина и высота" + width + " и " + height);
    }
}

class Triangle3 extends TwoDShape3 {
    private String style;

    Triangle3(String s, double w, double h){
        setHeight(h);
        setWidth(w);

        style = s;
    }

    double area(){
        return getHeight() * getWidth() / 2;
    }

    void shoStyle(){
        System.out.println("Треугольник " + style);
    }
}

public class Shapes3 {
    public static void main(String[] args) {
        Triangle3 triangle1 = new Triangle3("Закрашенный", 4.0, 4.0);
        Triangle3 triangle2 = new Triangle3("Контурный", 8.0, 12.0);

        System.out.println("Информация о t1 ");
        triangle1.shoStyle();
        triangle1.showDim();
        System.out.println("Площадь - " + triangle1.area());

        System.out.println();

        System.out.println("Информация о t2 ");
        triangle2.shoStyle();
        triangle2.showDim();
        System.out.println("Площадь - " + triangle2.area());

    }
}
