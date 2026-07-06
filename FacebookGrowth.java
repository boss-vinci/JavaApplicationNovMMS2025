public class FacebookGrowth {
    public static void main(String[] args) {
        double users = 1000000000.0; // 1 billion
        double target1 = 1500000000.0; // 1.5 billion
        double target2 = 2000000000.0; // 2 billion
        int months = 0;
        
        while (users < target2) {
            users *= 1.04;  // 4% growth per month
            months++;
            
            if (users >= target1 && months == 1 || users >= target1 && (users / 1.04) < target1) {
                System.out.println("Months to reach 1.5 billion: " + months);
            }
        }
        
        System.out.println("Months to reach 2 billion: " + months);
    }
}