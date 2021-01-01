public abstract class Animal {
    private String type;
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public Animal(String type) {
        setType(type);
    }
    public abstract void eat();
    public abstract void sleep();
    public abstract void think();
    public abstract void talk();
}
