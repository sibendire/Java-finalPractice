public class Mains {
    public static void main(String[] args) {
      // calculateScore(90,40);
        calculateScore(12,10);

    }
    public static int calculateScore(int score, double gameCompleted){
        if( (score == 10) && (gameCompleted <= 50)){
            System.out.println("your first score");
        } else if (gameCompleted == 20) {
            System.out.println("continue");
        }
        return -1;
    }
}
