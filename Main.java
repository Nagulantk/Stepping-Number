import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int startingNumber=input.nextInt();
        int endingNumber=input.nextInt();
        int index,number,onesDigit,firstDigit;
        int rem,rem1;
        for(index=startingNumber;index<=endingNumber;index++)
        {
            if(index<=10)
            {
                System.out.println(index);
            }
            else
            {number=index;
                rem=number%10;
                onesDigit=rem;
                number=number/10;
               while(number!=0)
               {
                   rem1=number%10;
                   firstDigit=rem1;
                   if(rem-rem1==1||rem1-rem==1)
                   {
                       rem=rem1;
                       number=number/10;
                       if(number==0)
                       {  if(onesDigit-firstDigit==1||firstDigit-onesDigit==1)
                       {
                           System.out.println(index);
                       }

                       }
                   }
                   else {
                       break;
                   }
               }
            }
        }

    }
}