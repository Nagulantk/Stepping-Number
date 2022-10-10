public class SteppingNumber {
    static int previousRemainder;
    static int currentRemainder;
    static int onesDigit;
    static int firstDigit;

    public static boolean findingSteppingNumber(int number) {

        previousRemainder = number % 10;
        onesDigit = previousRemainder;
        number = number / 10;
        while (number != 0) {
            currentRemainder = number % 10;
            firstDigit = currentRemainder;
            if (previousRemainder - currentRemainder == 1 || currentRemainder - previousRemainder == 1)
            {
                previousRemainder = currentRemainder;
                number = number / 10;
                if (number == 0)
                {
                    if (onesDigit - firstDigit == 1 || firstDigit - onesDigit == 1)
                    {
                        return true;
                    }

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
