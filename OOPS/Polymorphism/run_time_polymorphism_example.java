
    class fruit{
        public void name(){
            System.out.println("apple");
        }
    }


    class Mango extends fruit{
        public void name(){
            System.out.println("mango");
        }
    }

public class run_time_polymorphism_example {
        public static void main(String args[])
        {
            fruit f=new fruit();
            f.name();
            fruit f2=new Mango();
            f2.name();
        }
    }

