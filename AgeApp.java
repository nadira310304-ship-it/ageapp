public class AgeApp {
    public static void main(String[] args) {
        int age = 100; // Change this value to test different ages

        // 1. Specific age checks & Special Announcements
        if (age == 18) {
            System.out.println("You can drive a car.");

        // Check for 10-year milestones up to 120
        if (age >= 10 && age <= 120 && age % 10 == 0) {
            System.out.println("Anniversary Party!!");

        // Special 100th Birthday 3-line congratulations
        if (age == 100) {
            System.out.println("Congratulations on turning 100!");
            System.out.println("What an incredible milestone!");
            System.out.println("Wishing you joy and good health!");
    
        
        }
        
    }

       
