package Chapter5;

abstract class TwoDShape9{
    private double width;
    private double height;
    private String name;

    TwoDShape9(){
        width = 0.0;
        height = 0.0;
        name = "none";
    }

    TwoDShape9(double width, double height, String name){
        this.width = width;
        this.height = height;
        this.name = name;
    }

    TwoDShape9(double x, String name){
        width = x;
        height = x;
        this.name = name;
    }

    TwoDShape9(TwoDShape9 twoDShape9){
        width = twoDShape9.width;
        height = twoDShape9.height;
        name = twoDShape9.name;
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

    abstract double area();
}

class Triangle9 extends TwoDShape9{
    private String style;

    Triangle9(){
        super();
        style = "none";
    }

    Triangle9(String style, double weight, double height){
        super(weight,height,"треугольник");
        this.style = style;
    }

    Triangle9(double x){
        super(x,"треугольник");
        style = "Закрашенный";
    }

    Triangle9(Triangle9 triangle9){
        super(triangle9);
        style = triangle9.style;
    }

    double area(){
        return getWidth() * getHeight() / 2;
    }

    void showStyle(){
        System.out.println("Треугольник: " + style);
    }
}

class Rectangle9 extends TwoDShape9 {
    Rectangle9() {
        super();
    }

    Rectangle9(double width, double height) {
        super(width,height,"Треугольник");
    }

    Rectangle9(double x){
        super(x,"прямоугольник");
    }

    Rectangle9(Rectangle9 rectangle9){
        super(rectangle9);
    }

    boolean isSquare(){
        if (getWidth() == getHeight()){
            return true;
        } else {
            return false;
        }
    }

    double area(){
        return getHeight() * getWidth();
    }
}

public class AbsShape {
    public static void main(String[] args) {
        TwoDShape9 shapes[] = new TwoDShape9[4];

        shapes[1] = new Triangle9("Контурный",8.0,12.0);
        shapes[2] = new Rectangle9(10);
        shapes[3] = new Rectangle9(10, 4);
        shapes[4] = new Triangle9(7.0);

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Объект - " + shapes[i].getName());
        }
    }
}
