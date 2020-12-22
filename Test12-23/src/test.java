public class test {
    //定义一个汽车类，要求该类中至少包含5个私有的属性（为每个属性定义设置和获取方法）,
    // 该类中至少包含两个构造方法（一个无参，一个有参），
    // 以及包含5~6个方法来描述汽车对象的行为（其中一个方法要能打印输出汽车对象的所有属性值）。
    public static void main(String[] args) {
        Car newcar = new Car();
        newcar.setID_num("17507526869");
        newcar.setDriver("昕昕");
        newcar.setCar_num("陕A·12345");
        newcar.setColor("红");
        newcar.setType("奥迪");
        newcar.show();
    }
}
class Car{
    private String ID_num;
    private String driver;
    private String type;
    private String car_num;
    private String color;
    public void setID_num(String ID_num) {
        this.ID_num = ID_num;
        System.out.println();
    }
    public String getID_num() {
        return ID_num;
    }
    public void setDriver(String driver) {
        this.driver = driver;
    }
    public String getDriver() {
        return driver;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
    public void setCar_num(String car_num) {
        this.car_num = car_num;
    }
    public String getCar_num() {
        return car_num;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void show(){
        System.out.println("车主手机号："+this.ID_num);
        System.out.println("车主姓名："+this.driver);
        System.out.println("车牌号："+this.car_num);
        System.out.println("车颜色："+this.color);
        System.out.println("车型号："+this.type);
    }
}


