import java.util.Random;

public class DieRoller
{
    public static void main(String[] args)
    {

        Random gen = new Random();
        int die1 = 0;
        int die2 = -1;
        int die3 = -2;
        int dieRoll = 0;
        int roll = 0;

        System.out.println("roll#\tdie1\tdie2\tdie3\tdieRoll");
        System.out.println("_______________________________________");

        while(die1 != die2)
        {
            die1 = gen.nextInt(6) + 1;
            die2 = gen.nextInt(6) + 1;
            die3 = gen.nextInt(6) + 1;
            dieRoll = die1 + die2 + die3;
            roll++;
            System.out.printf("%3d%8d%8d%8d%9d\n",roll,die1,die2,die3,dieRoll);



        }
    }
}
