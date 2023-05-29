import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random Rand = new Random();
        int numerals[] = new int[100000];

        for(int i = 0; i < numerals.length; i++)
        {
            numerals[i] = Rand.nextInt(1000000);
        }
        System.out.print("The array befor sorting:  ");
        printing(numerals);
        System.out.println("");

        boolean dosomething = true;
        while(dosomething)
        {
            dosomething = false;
            for(int i = 0; i < numerals.length - 1; i++)
            {
                if(numerals[i] > numerals[i + 1])
                {
                    dosomething = true;
                    int temp = numerals[i];
                    numerals[i] = numerals[i + 1];
                    numerals[i + 1] = temp;
                }
            }

        }

        System.out.print("After Sorting: ");
        printing(numerals);


    }

    private static void printing(int myarray[])
    {
        for(int i = 0; i < myarray.length; i++)
        {
            System.out.print(myarray[i] + " ");
        }
    }
}
