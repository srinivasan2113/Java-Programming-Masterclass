package constructor_pro;

import java.time.Year; 
public class Q4_expired {
    String product;
    int manufacturing_year;
    int shelf_life;
    int current_year;
    String status;

    Q4_expired(String pro,int man,int shel)
    {
        product=pro;
        manufacturing_year=man;
        shelf_life=shel;
        current_year=Year.now().getValue();

    }
    void display()
    {
        System.out.println("Product Name : "+product);
         System.out.println("current year : "+current_year);
        int value=current_year-manufacturing_year;
        if(value>shelf_life)
        {
            status="Expired";
        }
        else{
            status="good";
        }
        System.out.println("Status      :"+status);
    }

    public static void main(String args[])
    {
        Q4_expired p1=new Q4_expired("milk",2022,1);
        p1.display();
    }

}
