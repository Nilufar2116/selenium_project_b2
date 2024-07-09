package com.ucode.utility;

public class Wait {

    public static void waitForGivingTime(int second){

        try {
            Thread.sleep((long) second * 1000);
        } catch (Exception e){
            e.getStackTrace();
        }
    }
}
