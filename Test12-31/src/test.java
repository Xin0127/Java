public class test {
    public static void main(String[] args) {
        Meat meat = new Meat("糖醋里脊");
        Vegetable vegetable = new Vegetable("土豆丝");
        StapleFood stapleFood =  new StapleFood("米饭");
        Meal meal = new Meal("营养套餐",3);
        meal.tInTeam(stapleFood);
        meal.GinTeam(meat);
        meal.UinTeam(vegetable);
        meal.Pri(meal);
    }
}
class Meal {
    private String name;
    private Integer max;
    private StapleFood stapleFood;
    private Vegetable[] vegetables;
    private Meat[] meats;
    public Meal(String name, Integer max){
        setName(name);
        setMax(max);
        vegetables = new Vegetable[max / 2];
        meats = new Meat[max / 2];
    }
    public String getName() {
        return name;
    }
    public Integer getMax() {
        return max;
    }
    public StapleFood getStapleFood() {
        return stapleFood;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setMax(Integer max) {
        this.max = max;
    }
    public void setStapleFood(StapleFood stapleFood) {
        this.stapleFood = stapleFood;
    }
    public void tInTeam(StapleFood stapleFood ) {
        setStapleFood(stapleFood );
        System.out.println("主食"+stapleFood .getName()+" 被选入"+getName());
    }
    public void UinTeam(Vegetable vegetable) {
        for(int i = 0; i < vegetables.length; i++) {
            if(vegetables[i] == (null)) {
                vegetables[i] = vegetable;
                System.out.println("素菜"+vegetable.getName()+" 被选入"+getName());
                break;
            }
            if(i == vegetables.length - 1)
                System.out.println("该套餐可选素菜种类已达上限");
        }
    }
    public void GinTeam(Meat stapleFood) {
        for(int i = 0; i < meats.length; i++) {
            if(meats[i] == null) {
                meats[i] = stapleFood;
                System.out.println("荤菜"+ stapleFood.getName()+" 被选入"+getName());
                break;
            }
            if(i == meats.length - 1)
                System.out.println("该套餐可选荤菜种类已达上限");
        }
    }
    public  void Pri(Meal meal) {
        System.out.println();
        System.out.println("套餐名称: " + meal.getName());
        System.out.println("主食: " + getStapleFood().getName());
        System.out.print("荤菜:");
        for(int i = 0; i < meats.length; i++) {
            if(meats[i] != null)
                System.out.println(" " + meats[i].getName());
        }
        System.out.print("素菜:");
        for(int i = 0; i < vegetables.length; i++) {
            if(vegetables[i] != null)
                System.out.println(" " + vegetables[i].getName());
        }
    }
}
class StapleFood {
    private String name;
    public StapleFood(String name) {
        setName(name);
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
class Vegetable {
    private String name;
    public Vegetable(String name) {
        setName(name);
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
class Meat {
    private String name;
    public Meat(String name) {
        setName(name);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
