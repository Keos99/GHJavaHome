package GHHomeProject.Chapter5;

class TwoDShape6 {
    private double width;
    private double height;

    TwoDShape6 () {
        width = 0.0;
        height = 0.0;
    }

    TwoDShape6(double width, double height){
        this.width = width;
        this.height = height;
    }

    TwoDShape6(double x){
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

class Triangle6 extends TwoDShape6{
    private String style;

    Triangle6(){
        super();
        style = "none";
    }

    Triangle6(String style,double width, double height){
        super(width,height);
        this.style = style;
    }

    Triangle6(double x){
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

class ColorTriangle6 extends Triangle6{
    private String color;

    ColorTriangle6(String color, String style, double height, double width){
        super(style,width,height);
        this.color = color;
    }

    String getColor(){
        return color;
    }

    void showColor(){
        System.out.println("Цвет - " + color);
    }
}

public class Shapes6 {
    public static void main(String[] args) {
        ColorTriangle6 colorTriangle1 = new ColorTriangle6("синий", "контурный", 8.0, 12.0);
        ColorTriangle6 colorTriangle2 = new ColorTriangle6("красный", "закрашенный", 2.0, 2.0);

        System.out.println("Информация о t1: ");
        colorTriangle1.showColor();
        colorTriangle1.showDim();
        colorTriangle1.showStyle();
        System.out.println("Площадь: " + colorTriangle1.area());

        System.out.println();

        System.out.println("Информация о t2: ");
        colorTriangle2.showColor();
        colorTriangle2.showDim();
        colorTriangle2.showStyle();
        System.out.println("Площадь: " + colorTriangle2.area());
    }
}
