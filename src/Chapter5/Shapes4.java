package Chapter5;

class TwoDShape4 {
    private double width;
    private double height;

    TwoDShape4(double width, double height ){
        this.width = width;
        this.height = height;
    }

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
        System.out.println("Ширина и высота - " + getWidth() + " и " + getHeight());
    }
}

class Triangle4 extends TwoDShape4{
    private String style;

    Triangle4(String style, double weight, double height){
        super(weight,height);
        this.style = style;
    }

    double area(){
        return getWidth() * getHeight() / 2;
    }

    void showStyle(){
        System.out.println("треугольник" + style);
    }
}

public class Shapes4 {
    public static void main(String[] args) {
        Triangle4 triangle1 = new Triangle4("Закрашенный", 4.0, 4.0);
        Triangle4 triangle2 = new Triangle4("контурный", 8.0, 12.0);

        System.out.println("Информация о t1: ");
        triangle1.showStyle();
        triangle1.showDim();
        System.out.println("Площадь - " + triangle1.area());

        System.out.println();

        System.out.println("информация о t2: ");
        triangle2.showStyle();
        triangle2.showDim();
        System.out.println("Площадь - " + triangle2.area());
    }
}
