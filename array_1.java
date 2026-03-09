class Array1
{
    public static void main(String args [])
    {
        int a[]={10,20,30,40};                //array starts from 0th index
        String  players[]={"srini","vasan","dhoni"};
        System.out.println(a);           //not output comes only show the address
        System.out.println(a[1]);
        System.out.println(players[2]);

        String colors[]=new String[5];
        colors[0]="green";
        colors[1]="blue";
        colors[2]="pink";
        colors[3]="red";
        colors[4]="green";

        System.out.println(colors[4]);



        //how to print array elements
        int age[]={20,21,22,23,24,25};
        //how to know the length of the array
        System.out.println(age.length);
        int n=age.length;
        for (int i=0;i<n;i++)
        {
            System.out.print(age[i]);
            System.out.print(" ");

        }
        

    }
}