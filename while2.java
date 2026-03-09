//2️⃣ Print even numbers between 1 and 50 using while loop.

class evenfrom50
{
    public static void main(String args[])
    {
        int s=1;
        int end=50;
        while(s<=end){
            if(s%2==0)
                System.out.println(s);
            s++;
        }
    }
}