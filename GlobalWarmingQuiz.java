import java.util.Scanner;

public class GlobalWarmingQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = 0;
        
        System.out.println("Global Warming Quiz\n");
        
        // Question 1
        System.out.println("1. What is the main greenhouse gas?");
        System.out.println("1) Oxygen   2) Carbon Dioxide   3) Nitrogen   4) Hydrogen");
        int ans1 = input.nextInt();
        if (ans1 == 2) score++;
        
        // Question 2
        System.out.println("\n2. Which year was the Paris Agreement signed?");
        System.out.println("1) 2012   2) 2015   3) 2018   4) 2020");
        int ans2 = input.nextInt();
        if (ans2 == 2) score++;
        
        // Question 3
        System.out.println("\n3. What is the primary cause of global warming?");
        System.out.println("1) Volcanic activity   2) Human activity   3) Solar flares   4) Ocean currents");
        int ans3 = input.nextInt();
        if (ans3 == 2) score++;
        
        // Question 4
        System.out.println("\n4. Which of these is NOT a consequence of global warming?");
        System.out.println("1) Rising sea levels   2) More extreme weather   3) Cooling oceans   4) Melting ice caps");
        int ans4 = input.nextInt();
        if (ans4 == 3) score++;
        
        // Question 5
        System.out.println("\n5. What does IPCC stand for?");
        System.out.println("1) International Panel on Climate Change");
        System.out.println("2) International Protection of Climate Coalition");
        System.out.println("3) Intergovernmental Panel on Climate Change");
        System.out.println("4) International Program for Climate Control");
        int ans5 = input.nextInt();
        if (ans5 == 3) score++;
        
        System.out.println("\nYou scored " + score + "/5");
        
        if (score == 5) System.out.println("Excellent!");
        else if (score == 4) System.out.println("Very good!");
        else System.out.println("Time to brush up on your knowledge of global warming.");
    }
}