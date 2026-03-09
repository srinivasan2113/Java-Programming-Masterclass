class parent {
    int x=10;
}
 class child extends parent {

    int x= 20;
}
 class mehodShadow {
    public static void main(String[] args) {
        parent p1= new parent();
        System.out.println(p1.x);
    }
    
    
}





