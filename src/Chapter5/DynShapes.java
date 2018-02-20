package Chapter5;

class TwoDShape8 {
    private double width;
    private double height;
    private String name;



    TwoDShape8(){
        width = 0;
        height = 0;
        name = "none";
    }

    TwoDShape8(double width, double height, String name){
        this.width = width;
        this.height = height;
        this.name = name;
    }

    TwoDShape8(double x, String name){
        width = x;
        height = x;
        this.name = name;
    }

    TwoDShape8(TwoDShape8 twoDShape8){
        width = twoDShape8.width;
        height = twoDShape8.height;
        name = twoDShape8.name;
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

    public String getName() {
        return name;
    }

    void showDim(){
        System.out.println("Ширина и высота - " + width + " и " + height);
    }

    double area(){
        System.out.println("Метод area() должен быть переопределен!");
        return 0.0;
    }
}

class Triangle8 extends TwoDShape8{
    private String style;

    Triangle8(String style, double width, double height){
        super(width,height, "треугольник");
        this.style = style;
    }

    Triangle8(double x){
        super(x,"треугольник");
        style = "закрашенный";
    }

    Triangle8(Triangle8 triangle8){
        super(triangle8);
        style = triangle8.style;
    }

    double area(){
        return getWidth() * getHeight() / 2;
    }

    void showStyle(){
        System.out.println("Треугольник: " + style);
    }
}

class Rectangle extends TwoDShape8{
    Rectangle(){
        super();
    }

    Rectangle(double width, double height){
        super(width, height, "Прямоугольник");
    }

    Rectangle(double x){
        super(x, "Прямоугольник");
    }

    Rectangle(Rectangle rectangle){
        super(rectangle);
    }

    boolean isSquare(){
        if ( getWidth() == getHeight() ) {
            return true;
        } else {
            return false;
        }
    }

    double area(){
        return getWidth() * getHeight();
    }
}

public class DynShapes {
    public static void main(String[] args) {
        TwoDShape8 shapes [] = new TwoDShape8[5];

        shapes[0] = new Triangle8("контурный", 8.0, 12.0);
        shapes[1] = new Rectangle(10.0);
        shapes[2] = new Rectangle(10,4);
        shapes[3] = new Triangle8(7.0);
        shapes[4] = new TwoDShape8(10, 20, "Фигура");

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Объект - " + shapes[i].getName());
            System.out.println("Площадь - " + shapes[i].area());
            System.out.println();
        }
    }
}
