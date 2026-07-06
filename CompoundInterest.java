public class CompoundInterest {
    public static void main(String[] args) {
        double principal = 1000.0;
        
        System.out.printf("%-6s", "Year");
        for (int rate = 5; rate <= 10; rate++) {
            System.out.printf("%12d%%", rate);
        }
        System.out.println();
        
        for (int year = 1; year <= 10; year++) {
            System.out.printf("%-6d", year);
            
            for (int rate = 5; rate <= 10; rate++) {
                double amount = principal * Math.pow(1.0 + rate / 100.0, year);
                System.out.printf("%13.2f", amount);
            }
            System.out.println();
        }
    }
}