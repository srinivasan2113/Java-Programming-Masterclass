//3️⃣ Print sum of numbers from 1 to 100 using while.

class sum{
    public static void main(String args[])
    {
        int s=1;
        int end=100;
        int sum=0;
        while(s<=end){
            sum=sum+s;
            System.out.println(sum);
            s++;

        }
        System.out.println(sum);
    }
}