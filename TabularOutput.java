public class TabularOutput {
    public static void main(String[] args) {
        System.out.println("N\tN*10\tN*100\tN*1000");
        
        for (int n = 1; n <= 5; n++) {
            System.out.printf("%d\t%d\t%d\t%d%n", 
                n, n*10, n*100, n*1000);
        }
    }
}