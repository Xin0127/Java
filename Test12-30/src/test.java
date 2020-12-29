public class test {
    public static void main(String[] args) {
        Graduate graduate1 = new Graduate("安宇","研究生");
        Undergraduate undergraduate1 = new Undergraduate("陈昕","本科生");
        Teacher teacher1 =  new Teacher("杨老师");
        Team team1 = new Team("电智团队",3,"Java程序设计");
        team1.tInTeam(teacher1);
        team1.GinTeam(graduate1);
        team1.UinTeam(undergraduate1);
        team1.Pri(team1);
    }
}
class Team {
    private String name;
    private Integer max;
    private Teacher teacher;
    private String className;
    private Undergraduate[] undergraduates;
    private Graduate[] graduates;
    public Team(String name,int max,String className){
        setName(name);
        setMax(max);
        setClassName(className);
        undergraduates = new Undergraduate[max / 2];
        graduates = new Graduate[max / 2];
    }
    public String getName() {
        return name;
    }
    public Integer getMax() {
        return max;
    }
    public Teacher getTeacher() {
        return teacher;
    }
    public String getClassName() {
        return className;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setMax(Integer max) {
        this.max = max;
    }
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    public void setClassName(String className) {
        this.className = className;
    }
    public void tInTeam(Teacher teacher) {
        setTeacher(teacher);
        System.out.println("指导老师 " + teacher.getName() + " 成功加入 " + getName());
    }
    public void UinTeam(Undergraduate undergraduate) {
        for(int i = 0;i < undergraduates.length;i++) {
            if(undergraduates[i] == (null)) {
                undergraduates[i] = undergraduate;
                System.out.println("本科生 " + undergraduate.getName() + " 成功加入 " + getName());
                break;
            }
            if(i == undergraduates.length - 1)
                System.out.println("该团队本科生名额已满");
        }
    }
    public void GinTeam(Graduate graduate) {
        for(int i = 0;i < graduates.length;i++) {
            if(graduates[i] == null) {
                graduates[i] = graduate;
                System.out.println("研究生 " + graduate.getName() + " 成功加入 " + getName());
                break;
            }
            if(i == graduates.length - 1)
                System.out.println("该团队研究生名额已满");
        }
    }
    public  void Pri(Team team) {
        System.out.println();
        System.out.println("团队名称:" + team.getName());
        System.out.println("指导老师:" + getTeacher().getName());
        System.out.println("课题名称:" + getClassName());
        System.out.print("研究生:");
        for(int i = 0;i < graduates.length;i++) {
            if(graduates[i] != null)
                System.out.println(" " + graduates[i].getName());
        }
        System.out.print("本科生:");
        for(int i = 0;i < undergraduates.length;i++) {
            if(undergraduates[i] != null)
                System.out.println(" " + undergraduates[i].getName());
        }
    }
}
class Teacher{
    private String name;
    public Teacher(String name) {
        setName(name);
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
class Undergraduate{
    private String name;
    private String eduBack;
    public Undergraduate(String name,String eduBack) {
        setName(name);
        setEduBack(eduBack);
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEduBack(String eduBack) {
        this.eduBack = eduBack;
    }
    public String getName() {
        return name;
    }
    public String getEduBack() {
        return eduBack;
    }
}
class Graduate{
    private String name;
    private String eduBack;
    public Graduate(String name,String eduBack) {
        setName(name);
        setEduBack(eduBack);
    }
    public String getName() {
        return name;
    }
    public String getEduBack() {
        return eduBack;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEduBack(String eduBack) {
        this.eduBack = eduBack;
    }
}