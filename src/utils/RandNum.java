package utils;

import java.util.Random;

public final class RandNum {

    /**
     * @author Alexander Kraschinski
     * Class with methods to create Strings of random numbers
     */

    private RandNum(){}


    /**
     * @author Alexander Kraschinski
     * @param digitNum the number of digits the string will have
     * @return a string consisting of random numbers of the desired digit lenght
     */

    public static String randNum(int digitNum){
        StringBuilder stringBuilder = new StringBuilder();
        Random rand = new Random();

        for(int i = 0; i < digitNum; i++)
            stringBuilder.append(rand.nextInt(10));

        return stringBuilder.toString();
    }

    /**
     * @author Alexander Kraschinski
     * @param digitNum the number of digits the string will have (this does not include the digits the user adds at the start)
     * @param start a string containing the starting digits of the string
     * @return a string consisting of random numbers of the desired digit lenght
     */

    public static String randNum(int digitNum, String start){
        StringBuilder stringBuilder = new StringBuilder();
        Random rand = new Random();

        for(int i = 0; i < digitNum; i++)
            stringBuilder.append(rand.nextInt(10));

        return stringBuilder.insert(0, start).toString();
    }

    /**
     * @author Alexander Kraschinski
     * @param digitNum the number of digits the string will have (this does not include the digits the user adds at the start or end)
     * @param start a string containing the starting digits of the string
     * @param end the digits you want to concatenate at the end of the string
     * @return a string consisting of random numbers of the desired digit lenght
     */

    public static String randNum(int digitNum, String start, String end){
        StringBuilder stringBuilder = new StringBuilder();
        Random rand = new Random();

        for(int i = 0; i < digitNum; i++)
            stringBuilder.append(rand.nextInt(10));

        return stringBuilder.insert(0, start).append(end).toString();
    }

}
