public class Bird extends Animal{
    public Bird(String type) {
        super(type);
    }
    public void eat() {
        System.out.println("鸟可以吃饭");
    }
    public void sleep() {
        System.out.println("鸟可以睡觉");
    }
    public void think() {
        System.out.println("鸟可以思考");
    }
    public void talk() {
        System.out.println("鸟不会说话");
    }
}

