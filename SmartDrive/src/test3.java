import java.util.Scanner;
public class test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] questions = {"How do you spell 'Hi'?",
                              "What is 1 + 1 =?",
                              "Is this a program?"};
        String[][] answers = {{"1. Hi 2. Hello 3. Idk 4. Yes"},
                              {"1. 2 2. 5 3. 8 4. 1"},
                              {"1. No 2. Yes 3. Maybe 4. Roblox"}};

        int[] key = {1, 2, 2};
        int scores = 0;
        int guess;

       System.out.println("===== Quiz =====");

        for(int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String answer : answers[i]) {
                System.out.println(answer);
            }

            System.out.print("Enter (1-4) as your answer: ");
            guess = scanner.nextInt();

            if(guess == key[i]) {
                System.out.println("Nice!");
                scores++;
            }
            else {
                System.out.println("Loser!");
            }
        }
        System.out.println("Score " + scores + " out of " + questions.length);
        scanner.close();
    }
}