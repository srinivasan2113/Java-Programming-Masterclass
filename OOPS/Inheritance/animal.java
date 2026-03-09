public class animal {
    void eat()
    {
        System.out.println("it can eat");
    }
}
class dog extends animal{
    void bark()
    {
        System.out.println("it can bark");
    }
}
class cat extends dog{
    void play()
    {
        System.out.println("it can play");
    }  
}
class main{
    public static void main(String[] args) {
        animal b1=new animal();
        
        dog b2=new dog();
        b2.eat();
        b2.bark();
        cat c1=new cat();
        System.out.println("---------------------------------cat------------------");
        c1.play();
        c1.eat();
        c1.bark();
    }
}
