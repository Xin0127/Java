public class test {
    public static void main(String[] args) {
        Animal person = new Person("人", "昕昕");
        person.eat();
        person.sleep();
        person.think();
        person.talk();
        System.out.println();
        Animal cat = new Cat("猫");
        cat.eat();
        cat.sleep();
        cat.think();
        cat.talk();
        System.out.println();
        Animal bird = new Bird("鸟");
        bird.eat();
        bird.sleep();
        bird.think();
        bird.talk();
    }
}





