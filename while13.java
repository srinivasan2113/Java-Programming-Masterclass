
class oddeven
{
    public static void main (String args [])
    {
int number = 123456789;
int temp_number = Math.abs(number);
int even_count = 0;
int odd_count = 0;


while (temp_number > 0)
{
    int digit = temp_number % 10;

    if (digit % 2 == 0)
    {
        even_count += 1;
    }
    else
    {
        odd_count += 1;
    }

    temp_number = temp_number/10;
}

System.out.println("Number: "+number);
System.out.println("Even digits: "+even_count);
System.out.println("Odd digits:"+odd_count);
    }
}