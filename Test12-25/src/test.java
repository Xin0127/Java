import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        //设计一个抽象类图形类，在该类中包含有至少两个抽象方法求周长和求面积，
        //分别定义圆形类、长方形类、正方形类来继承图形类，并实现上述两个方法。
        // 并创建实例验证。
        Rectangle rec = new Rectangle();
        rec.setLength(10);
        rec.setWidth(5);
        double rec_area = rec.area();
        double rec_perimeter = rec.perimeter();
        System.out.println("矩形的面积："+rec_area+"，周长"+rec_perimeter);

        Circle cir = new Circle();
        cir.setDiameter(10);
        double cir_area = cir.area();
        double cir_perimeter = cir.perimeter();
        System.out.println("圆形的面积："+cir_area+"，周长"+cir_perimeter);
    }

}
