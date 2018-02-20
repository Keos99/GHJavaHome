package Chapter5;

class TwoDShape7 {
    private double width;
    private double height;

    TwoDShape7() {
        width = 0.0;
        height = 0.0;
    }

    TwoDShape7(double width, double height){
        this.width = width;
        this.height = height;
    }

    TwoDShape7(double x){
        width = x;
        height = x;
    }

    TwoDShape7(TwoDShape7 twoDShape7){
        width = twoDShape7.width;
        height = twoDShape7.height;
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

class Triangle7 extends TwoDShape7{
    private String style;

    Triangle7(){
        super();
        style = "none";
    }

    Triangle7(String style, double width, double height){
        super(width, height);
        this.style = style;
    }

    Triangle7(double x){
        super(x);
        style = "закрашенный";
    }

    Triangle7(Triangle7 triangle7){
        super(triangle7);
        style = triangle7.style;
    }

    double area(){
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Треугольник " + style);
    }
}

public class Shapes7 {
    public static void main(String[] args) {
        Triangle7 triangle = new Triangle7("контурный", 8.0, 12.0);
        Triangle7 triangle2 = new Triangle7(triangle);

        System.out.println("Информация о triangle: ");
        triangle.showDim();
        triangle.showStyle();
        System.out.println("Площадь - " + triangle.area());

        System.out.println();

        System.out.println("Информация о triangle2: ");
        triangle2.showDim();
        triangle2.showStyle();
        System.out.println("Площадь - " + triangle2.area());
    }
}
