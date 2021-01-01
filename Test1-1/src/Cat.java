public class Cat extends Animal{
    public Cat(String type) {
        super(type);
    }
    public void eat() {
        System.out.println("猫可以吃饭");
    }
    public void sleep() {
        System.out.println("猫可以睡觉");
    }
    public void think() {
        System.out.println("猫可以思考");
    }
    public void talk() {
        System.out.println("猫不会说话");
    }
}