import java.util.Scanner;
public class SteppingNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int startingNumber=input.nextInt();
        int endingNumber=input.nextInt();
        steppingNumber(startingNumber,endingNumber);
    }
    public static void steppingNumber(int startingNumber,int endingNumber)
    {
        int index;
        boolean condition;

        for(index=startingNumber;index<=endingNumber;index++)
        {
            if(index<=10)
            {
                System.out.println(index);
            }
            else
            {
                condition=findingSteppingNumber(index);
                if(condition)
                {
                    System.out.println(index);
                }

            }
        }
    }
    public static boolean findingSteppingNumber(int number) {

        int previousRemainder = number % 10;
        int onesDigit = previousRemainder;
        number = number / 10;
        while (number != 0) {
            int currentRemainder = number % 10;
            int firstDigit = currentRemainder;
            if (previousRemainder - currentRemainder == 1 || currentRemainder - previousRemainder == 1)
            {
                previousRemainder = currentRemainder;
                number = number / 10;
                if (number == 0&&(onesDigit - firstDigit == 1 || firstDigit - onesDigit == 1))
                {
                        return true;
                }
            }
            else
            {
                return false;
            }
        }
        return false;
    }
}