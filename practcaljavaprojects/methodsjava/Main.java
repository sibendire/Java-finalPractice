public class Main {
    public static void main(String[] args) {
         int firstScore = 500;
         double levelScore = 1000;
         int  secondScore = 100;
         double levelCompleted = 100;
         int bonus = 20;
        int  finalScore =  (firstScore + secondScore) * bonus;


         if(levelScore >= levelCompleted && levelCompleted < 100){
             System.out.println("Go to the next level");
         }else {
             System.out.println("Go back");
         }
    }
    //applying methods in java

    public static void calculateScore() {
        int firstScore = 500;
        double levelScore = 1000;
        int  secondScore = 100;
        double levelCompleted = 100;
        int bonus = 20;
        int  finalScore =  (firstScore + secondScore) * bonus;
        System.out.println("finalScore = " + finalScore);
        if (finalScore == firstScore * bonus){
            System.out.println("firstScore");
            System.out.println("secondScore");
        }else {
            System.out.println("secondScore values");
        }
    }
}
