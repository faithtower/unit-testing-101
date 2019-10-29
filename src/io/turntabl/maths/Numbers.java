package io.turntabl.maths;

public class Numbers {

    public static int sumTwonumbers(int num1, int num2){
        return num1 + num2;
    }

    public static boolean isPositive(int num){
        if ( num <= 0 ){
            return false;
        }else{
            return true;
        }
    }

    public static boolean isNegative(int num){
        if ( num >= 0 ){
            return true;
        }else{
            return false;
        }
    }


}
