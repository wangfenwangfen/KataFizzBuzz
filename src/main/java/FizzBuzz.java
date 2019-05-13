public class FizzBuzz {

    public String affiche(int numberBegin, int numberEnd) {

        String result;
        String resultToatl = "";

        for(int theNumber = numberBegin; theNumber <= numberEnd; theNumber++ ){

            result = String.valueOf(theNumber);

            if(isMultiply3(theNumber))
                result = "fizz";

            if(isMultyply5(theNumber))
                result = "buzz";

            if(isMultiply15(theNumber))
                result = "fizzbuzz";

            resultToatl +=result;
        }


        return resultToatl;
    }

    private boolean isMultiply15(int theNumber) {
        return theNumber%15==0;
    }

    private boolean isMultyply5(int theNumber) {
        return theNumber%5==0;
    }

    boolean isMultiply3(int number){
        return number%3 ==0;
    }
}
