public class TestSlova
{
     public static void main(String[] args)
    {
        Slovo sl1 = new Slovo("kiss");
        System.out.println(sl1.dejPlural());

        System.out.println("Expected: kisses");
        System.out.println(new Slovo("phase").dejPlural());
        System.out.println("Expected: phases");
        System.out.println(new Slovo("dish").dejPlural());
        System.out.println("Expected: dishes");
        System.out.println(new Slovo("massage").dejPlural());
        System.out.println("Expected: massages");
        System.out.println(new Slovo("witch").dejPlural());
        System.out.println("Expected: witches");
        System.out.println(new Slovo("judge").dejPlural());
        System.out.println("Expected: judges");
        System.out.println(new Slovo("lap").dejPlural());
        System.out.println("Expected: laps");
        System.out.println(new Slovo("cat").dejPlural());
        System.out.println("Expected: cats");
        System.out.println(new Slovo("clock").dejPlural());
        System.out.println("Expected: clocks");
        System.out.println(new Slovo("cuff").dejPlural());
        System.out.println("Expected: cuffs");
        System.out.println(new Slovo("death").dejPlural());
        System.out.println("Expected: deaths");
        System.out.println(new Slovo("boy").dejPlural());
        System.out.println("Expected: boys");
        System.out.println(new Slovo("girl").dejPlural());
        System.out.println("Expected: girls");
        System.out.println(new Slovo("chair").dejPlural());
        System.out.println("Expected: chairs");
        System.out.println(new Slovo("day").dejPlural());
        System.out.println("Expected: days");
        System.out.println(new Slovo("monkey").dejPlural());
        System.out.println("Expected: monkeys");
        System.out.println(new Slovo("bath").dejPlural());
        System.out.println("Expected: baths");
        System.out.println(new Slovo("cherry").dejPlural());
        System.out.println("Expected: cherries");
        System.out.println(new Slovo("knife").dejPlural());
        System.out.println("Expected: knives");
    }
}

