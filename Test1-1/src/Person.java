public class Person extends Animal{
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Person(String type, String name) {
        super(type);
        setName(name);
    }
    public void eat() {
        System.out.println(name + "可以吃饭");
    }
    public void sleep() {
        System.out.println(name + "可以睡觉");
    }
    public void think() {
        System.out.println(name + "可以深度思考");
    }
    public void talk() {
        System.out.println(name + "可以说多种语言");
    }
}
