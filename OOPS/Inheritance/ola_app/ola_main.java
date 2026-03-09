package ola_app;

public class ola_main {
    

    if(r instanceof Mini)
    {
        Mini m=(Mini)r;
        m.displayMini();
    }
    else if(r instanceof Auto)
    {
        Auto a=(Auto)r;
        a.displayAuto();
    }
    else if (r instanceof Prime)
    {
        Prime p=(Prime)r;
        p.displayPrime();
    }
    else {
        System.out.println("Invalid Ride");
    }
}
