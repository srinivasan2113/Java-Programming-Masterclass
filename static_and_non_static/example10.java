class example10
{
    public static void main(String[] args)
    {
        System.out.println("hello World!");
        main();
        main(20);

        System.out.println(Arrays.toString(args));
    }
    public static void main()
    {
        System.out.println("i am another class");
    }
    public static void main(int a)
    {

    }
}