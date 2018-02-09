package Chapter5;

class TwoDShape5 {
    private double width;
    private double height;

    TwoDShape5(){
        width = 0;
        height = 0;
    }

    TwoDShape5(double width, double height){
        this.height = height;
        this.width = width;
    }

    TwoDShape5(double x){
        width = x;
        height = x;
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
        System.out.println("Ширина и высота - " + width + " и " + height);
    }
}

class Triangle5 extends TwoDShape5 {
    private String style;

    Triangle5(){
        super();
        style = "none";
    }

    Triangle5(String style, double width, double height){
        super(width, height);
        this.style = style;
    }

    Triangle5(double x){
        super(x);
        style = "Закрашенный";
    }

    double area(){
        return getWidth() * getHeight() / 2;
    }

    void showStyle(){
        System.out.println("Треугольник " + style);
    }
}

public class Shapes5 {
    public static void main(String[] args) {
        Triangle5 triangle1 = new Triangle5();
        Triangle5 triangle2 = new Triangle5("Контурный", 8.0, 12.0);
        Triangle5 triangle3 = new Triangle5(4.0);

        triangle1 = triangle2;

        System.out.println("Информация о Т1 ");
        triangle1.showStyle();
        triangle1.showDim();
        System.out.println("Площадь - " + triangle1.area());

        System.out.println();

        System.out.println("Информация о Т2 ");
        triangle2.showStyle();
        triangle2.showDim();
        System.out.println("Площадь - " + triangle2.area());

        System.out.println();

        System.out.println("Информация о Т3 ");
        triangle3.showStyle();
        triangle3.showDim();
        System.out.println("Площадь - " + triangle3.area());

        System.out.println();
    }
}
