public static void generateQuestion(int level, SecureRandom rand) {
    int max = (int) Math.pow(10, level); 
    int num1 = 1 + rand.nextInt(max);
    int num2 = 1 + rand.nextInt(max);
}