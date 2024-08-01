package dayTwo;
import java.util.*;

public class numberCon {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number between 1-999");
        int number = scanner.nextInt();

        number(number);

        scanner.close();
            
    }

    /*
     * get a number. 
     * understand how much digits it has. /100 and /10
     * 
     * if it is over 100, you can get the other 2 digits by %100. 
     * get it, again see if the new number/10 is 1, 0, or more than 1.
     * than you can get the last digit by %10. 
     * 
     * if it is between 10-99, see if it is 10-19 or 20-99. you need to use three different methods.
     */

    public static String number(int number){
        String numberEng = "";
        if(number != 0){
            if(number/100 >=1){
                numberEng = hundreds(number);
            }
            else{
                if(number/10 >1){
                    numberEng = tens(number);
                }

                else if (number/10 ==1){
                    numberEng = teens(number);

                }
                else{
                    numberEng = digit(number);

                }
            }
        }
        else {
            numberEng = "zero";
        }
        System.out.println(numberEng);
        return numberEng;
    }

    /**
     * 
     * @param number hundreds.
     * @return
     */

    public static String hundreds(int number){
        String hundreds = "";

        int lastTwoDigits = number%100;

        if( lastTwoDigits/10 > 1 ){
            hundreds = digit(number/100) + " hundred "+ tens(lastTwoDigits);
        }
        else if (lastTwoDigits/10 ==1 ) {
            hundreds = digit(number/100) + " hundred "+ teens(lastTwoDigits);
        }
        else{
            hundreds = digit(number/100) + " hundred "+ digit(lastTwoDigits%10);
        }
        
        return hundreds;

    }

    /**
     * 
     * @param number enter a two digit number.
     * @return
     */

    public static String tens(int number){

        String tens = "";

        if(number/10 == 9){
            tens += "ninety";  
        }

        if(number/10 == 8){
            tens += "eighty";  
        }

        if(number/10 == 7){
            tens += "seventy";  
        }

        if(number/10 == 6){
            tens += "sixty";  
        }

        if(number/10 == 5){
            tens += "fifty";  
        }
  
        if(number/10 == 4){
            tens += "fourty";  
        }

        if(number/10 == 3){
            tens += "thirty";  
        }

        if(number/10 == 2){
            tens += "twenty";  
        }

        tens += " "+ digit(number%10);
        return tens;
    }

    /**
     * 
     * @param number enter a teen number.
     * @return
     */

    public static String teens(int number){

        String teen = "";

        if(number == 19){
            teen += "nineteen";
        }
        if(number == 18){
            teen += "eighteen";
        }
        if(number == 17){
            teen += "seventeen";
        }
        if(number == 16){
            teen += "sixteen";
        }
        if(number == 15){
            teen += "fifteen";
        }
        if(number == 14){
            teen += "fourteen";
        }
        if(number == 13){
            teen += "thirteen";
        }
        if(number == 12){
            teen += "twelve";
        }
        if(number == 11){
            teen += "eleven";
        }
        if(number == 10){
            teen += "ten";
        }

        return teen;
    }
    /**
     * 
     * @param number is the last digited version.
     * @return number in one digit only.
     */
    public static String digit(int number){

        String digit = "";

        if(number == 9 ){
            digit += "nine";  
          }
  
        if(number == 8){
            digit += "eight" ;  
        }

        if(number == 7 ){
            digit +="seven" ;  
        }

        if(number == 6){
            digit += "six";  
        }
        if(number == 5){
            digit += "five";  
          }
  
        if(number == 4){
            digit += "four";  
        }

        if(number == 3){
            digit += "three" ;  
        }

        if(number == 2 ){
            digit += "two";  
        }

        if(number == 1 ){
            digit += "one" ;  
        }
        return digit;
    }
}


