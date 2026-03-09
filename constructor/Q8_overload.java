public class Q8_overload{
String title;
String author;
int price;

Q8_overload(String index,String writer)
{
    title=index;
    author=writer;
    price=-1;
    
}
Q8_overload(String index,String writer,int cost)
{
    title=index;
    author=writer;
    price=cost;
}
void display()
{
    System.out.print("Title = "+title+","+ "Author = "+author+","+"price =" );
    if(price==-1)
    {
        System.out.println(" not set");
    }
    else
    {
        System.out.println(price);
    }
}

public static void main(String args[])
{
    Q8_overload book1=new Q8_overload("java advanced","srini");
    Q8_overload book2=new Q8_overload("java pro","srini",100000);




    System.out.print("book1-->");
    book1.display();
    System.out.print("book2-->");
    book2.display();
    

}
}