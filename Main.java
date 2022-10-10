import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int startingNumber=input.nextInt();
        int endingNumber=input.nextInt();
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
                condition=SteppingNumber.findingSteppingNumber(index);
                if(condition)
                {
                    System.out.println(index);
                }

            }
        }

    }
}