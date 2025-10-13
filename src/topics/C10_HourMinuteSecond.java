package topics;

public class C10_HourMinuteSecond {
    /*
        Write a Java program that:
            Takes a total number of seconds as input (use a variable)
            Calculates hours, minutes, and remaining seconds
            Uses division and modulus operators
            Displays the result in format: "X hours, Y minutes, Z seconds"
        Test with 3665 seconds (should be 1 hour, 1 minute, 5 seconds)
     */

    public static void main(String[] args) {

        int totalSeconds = 9999;
        int hours = totalSeconds / 3600;
        int remainingSeconds = totalSeconds % 3600;
        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;
        System.out.println(hours + " hours, " + minutes + " minutes, " + seconds + " seconds");

    }


}
