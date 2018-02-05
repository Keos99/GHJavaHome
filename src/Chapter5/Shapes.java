package Chapter5;

class TwoDShape {
    double width;
    double height;

    void showDim(){
        System.out.println("Ширина и высота - " + width + " и " + height);
    }
}

class Triangle extends TwoDShape{
    String style;

    double area () {
        return width * height/2;
    }
    void showStyle(){
        System.out.println("Треугольник " + style);
    }
}

public class Shapes {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle();
        Triangle triangle2 = new Triangle();

        triangle1.width = 4.0;
        triangle1.height = 4.0;
        triangle1.style = "закрашенный";

        triangle2.width = 8.0;
        triangle2.height = 12.0;
        triangle2.style = "контурный";

        System.out.println("Информация о t1: ");
        triangle1.showStyle();
        triangle1.showDim();
        System.out.println("площадь - " + triangle1.area());

        System.out.println("Информация о t2: ");
        triangle2.showStyle();
        triangle2.showDim();
        System.out.println("площадь - " + triangle2.area());
    }
}
