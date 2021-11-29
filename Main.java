package com.company;



abstract class Features
{
    abstract void video();
    abstract void game();
    abstract void getdetails();
}

class Macbook_C201121 extends Features
{
    Macbook_C201121(){}
    public void getdetails()
    {
        System.out.println("""
                16 GB RAM
                2 TB internal storage
                6000 mAh battery""");
    }
    Macbook_C201121(int cost)
    {
        System.out.println("Macbook_C201121 price is "+cost+"Taka");
    }
    public void music(){
        System.out.println("Music is playing in Macbook_C201121 ");
    }
    public void camera(){
        System.out.println("Your Macbook_C201121 is ringing ");
    }
    public void game(){
        System.out.println("You can't Play Game in Macbook_C201121");
    }
    public void video(){
        System.out.println("You can't run video in Macbook_C201121 ");
    }
}

class Samsung_C201121 extends Macbook_C201121  {
    public void getdetails(){
        System.out.println("""
            8 GB RAM
            1 TB internal storage
            5000 mAh battery""");
    }
    Samsung_C201121(int cost,int charger_cost){
        super(cost-10000);
        System.out.println("Samsung_C201121 price is cost " + cost+" And charger cost is "+ charger_cost);
    }
    public void music_Video(){
        System.out.println("Music is playing  with video in your Samsung_C201121 ");
    }
    @Override
    public void camera(){
        System.out.println("Your Samsung_C201121 is ringing ");
    }
    public void game(){
        System.out.println("Your game is opening in Samsung_C201121");
    }
    public void video(){
        System.out.println("Your Video is running in Samsung_C201121");
    }
}



public class Main {
    public static void main(String[] args) {
        Macbook_C201121 phone0 = new Macbook_C201121(120000);

        System.out.println("Details about this Laptop\n" );

        phone0.getdetails();
        System.out.println(".....................\n");
        Macbook_C201121 phone1 = new Samsung_C201121(15000,20000);
        System.out.println("Details about this Laptop\n" );
        phone1.getdetails();
        System.out.println(".....................\n");
        phone1.camera();
        phone1.game();
        phone1.video();
        phone0.game();
    }
}
