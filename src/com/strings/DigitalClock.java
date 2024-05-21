package com.strings;

/**
 * problem statement:
 *
 * You are building a logic for a clock that requires you convert
 * absolute time in minutes into a format supported by a digital clock.
 *
 * See examples below:
 * 125 minutes can be displayed as 2:05
 * 155 minutes can be displayed as 2:35
 *
 * (You can assume the maximum value of minutes will be less than 24 X 60)
 *
 * Input -> Input is a single integer - 1180
 * Output -> Output is a string denoting the digital clock time -> 19:40
 */
public class DigitalClock {
    public static void main(String[] args) {

        System.out.println(digitalClock(1180));
        System.out.println(digitalClock(125));
        System.out.println(digitalClock(155));
    }

    public static String digitalClock(int minutes) {
       int minutesLeft = minutes %60;
       int hours = minutes / 60;

       return hours + ":" + (minutesLeft < 10 ? "0" + minutesLeft: minutesLeft) ;
    }
}
