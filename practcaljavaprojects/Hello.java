public class Hello {
    public static void main(String[] args) {
        System.out.println("Happy coding to me and friends");
        //primitive datatype
        //int
        int numberOne = 12;
        int numberTwo = 13 * 3;
        int totalNumbers = numberOne + numberTwo;
        System.out.println(totalNumbers);
        int myValue = 10000;
        int myMaxIntValue = Integer.MAX_VALUE;
        int myMinIntValue = Integer.MIN_VALUE;

        System.out.println("The max value is =" + myMaxIntValue);
        System.out.println("The min value is =" + myMinIntValue);
        System.out.println("max" + myValue);
        //byte
        byte myMaxByteValue = Byte.MAX_VALUE;
        byte myMinByteValue = Byte.MIN_VALUE;
        System.out.println("my max byte value is =" + myMaxByteValue);
        System.out.println("my min byte value is = " + myMinByteValue);
        //short
        short myMaxShortValue = Short.MAX_VALUE;
        short myMinShortValue = Short.MIN_VALUE;
        System.out.println("my max short value is =" + myMaxShortValue);
        System.out.println("my min short value is =" + myMinShortValue);
        //float value
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("my max float value is =" + myMaxFloatValue);
        System.out.println("my min float value is =" + myMinFloatValue);
        //double
        double myMaxDoubleValue = Double.MAX_VALUE;
        double myMinDoubleValue = Double.MIN_VALUE;
        System.out.println("The max double value is =" + myMaxDoubleValue);
        System.out.println("The min double value is =" + myMinDoubleValue);

        //simple declaration
        int myNumber = 5 / 3;
        float myFloatNumber = 5f;
        double myDoubleNumber = 5d;
        System.out.println("The int value is = " + myNumber);
        System.out.println("The float value is = " + myFloatNumber);
        System.out.println("The double value is =" + myDoubleNumber);

        //strings are not primitive data types
        String myStringValue = "This is my first String example";
        System.out.println("This is the results:" + myStringValue);
        myStringValue = myStringValue +",This the second String value";
        System.out.println("This is the results:"+ myStringValue);
        double doubleString = 100d;
        myStringValue =myStringValue + doubleString ;
        System.out.println("Get the answer :" + myStringValue);
        int myIntValues = 1000;
        double mydoubledValue = 2000;
        mydoubledValue = myIntValues + mydoubledValue;
        System.out.println("Here we go:" + mydoubledValue);

        //operators
         int numberOn = 23;
         int numberThree = 34;
         int result = (numberOn + numberThree) *(23+10);
        System.out.println("print the answer:" + result);
        result = (result + numberThree)/ (5-2);
        System.out.println("Test your self:" + result);

        //statements
        boolean isJoshua = true;
        if (isJoshua != false) {
            System.out.println("His a java developer");
            System.out.println("and javascript as well");

            int toFirst = 1000;
            if (toFirst != 1000) {
                System.out.println("This is my first test");
            }
                int toSecond = 8000;
            if ((toFirst > toSecond) && (toSecond <1000)){
                System.out.println("print happy coding");
            }
             int tosecond = 10;
            if ((tosecond < toFirst) ||( tosecond > 20)){
                System.out.println("print the second value");
            }
            boolean myJava = false;
            if (myJava != false) {
                System.out.println("start java 11");
            }
            boolean isBoy = true;
            if (isBoy == true){
                System.out.println("His aged marry");
            }
            // coding  challenge
            double firstDouble = 600.0d;
            double secondDouble = 800.0d;
            double sumDouble = (firstDouble + secondDouble) * (100);
            System.out.println("SumDouble" + sumDouble);
            double secondeDouble = sumDouble % 40.0;
            System.out.println("This is the results" + secondeDouble);
        }
        //ternary operator0
        boolean isDeveloper = true; 
        boolean wasDeveloper = isDeveloper ? true:false;
        if (wasDeveloper){
            System.out.println("His good to go coding challenges");
        }
    }
}