import java.util.Scanner;
class calculator
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.println("------calculator--------");
        System.out.println("Enter 1 for addition");
        System.out.println("Enter 2 for subdraction");
        System.out.println("Enter 3 for Division");
        System.out.println("Enter 4 for multiplication");

        System.out.print("Now Enter your operation:");
        int value=sc.nextInt();
        
        switch(value)
        {
            case 1:System.out.println("your choosen value is addition");
                   System.out.print("enter the value1:");
                   int a= sc.nextInt();
                   System.out.print("enter the value2:");
                   int b= sc.nextInt();
                   int c= a+b;
                   System.out.println("the addition of the given no. is:"+c);
                   break;
            case 2:System.out.println("your are choose value is subdraction");
                  System.out.print("enter the value 1:");
                  int d=sc.nextInt();
                  System.out.print("enter the value2:");
                  int e= sc.nextInt();
                  int f=d-e;
                  System.out.println("the sub of the give value is:"+f);
                  break;
            case 3:System.out.println("your choosen value is devision");
                   System.out.print("enter the value1:");
                   int g= sc.nextInt();
                   System.out.print("enter the value2:");
                   int h= sc.nextInt();
                   int i= g/h;
                   System.out.println("the addition of the given no. is:"+i);
                   break;
            case 4:System.out.println("your are choose value is subdraction");
                  System.out.print("enter the value 1:");
                  int j=sc.nextInt();
                  System.out.print("enter the value2:");
                  int k= sc.nextInt();
                  int l=j*k;
                  System.out.println("the sub of the give value is:"+l);
                  break;
            default:
                System.out.println("the give operation is wrong check the operation");

        }

    }
}