//4️⃣ Print multiplication table of any number using while.

class tables
{
    public static void main(String args[])
    {
        int s=1;
        int end=10;
        while (s<=end){
            int b=s*5;
            System.out.println(s+" * 5 = "+b);
            s++;
        }
    }
}