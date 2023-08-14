//If we want to initialize the object at the time of its creation then we can make use of a constructor.
//Constructor is a special method that doesn't have a return value
//Constructor name should be same as the class name it belongs to.
//constructor is automatically created anytime an object is created
class Human
{
    String name;
    int age;
    public Human()//constructor creation
    {
        // age=56;
        // name="Ananta";
        System.out.println("from constructor ");
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
}
public class JavaConstructor {
    public static void main(String[] args)
    {
        Human h=new Human();
        //below statements will automatically call the constructor Human
        // Human h2=new Human();
        // Human h3=new Human();
    }
}
