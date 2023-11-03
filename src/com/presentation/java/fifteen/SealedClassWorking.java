package com.presentation.java.fifteen;



sealed class SomeNames permits Sabeer, Muhaiadeen , Someone
{
    public void printName()
    {
        System.out.println("Default");
    }
}

non-sealed class Sabeer extends SomeNames
{
    public void printName()
    {
        System.out.println("Sabeer");
    }
}

non-sealed class Muhaiadeen extends SomeNames
{
    public void printName()
    {
        System.out.println("Muhaiadeen");
    }
}

/*class Presentation extends Someone{

}*/

final class Someone extends SomeNames
{
    public void printName()
    {
        System.out.println("someone");
    }
}


public class SealedClassWorking {

    public static void main(String[] args)
    {
        SomeNames h1 = new Sabeer();
        SomeNames h2 = new Muhaiadeen();
        SomeNames h3 = new Someone();

        h1.printName();
        h2.printName();
        h3.printName();
    }
}
