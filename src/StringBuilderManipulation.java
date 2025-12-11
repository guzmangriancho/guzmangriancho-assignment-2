import java.util.Scanner;

public class StringBuilderManipulation {

    public static void main(String[] args) {
        repeater();
    }

    public static void repeater() {
        Scanner scanner = new Scanner(System.in);

        // while with input validation
        int wordCount = 0;
        boolean validWordCount = false;
        while (!validWordCount) {
            System.out.print("How many words do you want to enter?: ");
            if (scanner.hasNextInt()) {
                wordCount = scanner.nextInt();
                if (wordCount < 1) {
                    System.out.println("Invalid input");
                } else {
                    validWordCount = true;
                }
            } else {
                System.out.println("Invalid input");
                scanner.next();
            }
            scanner.nextLine();
        }

        String[] words = new String[wordCount];
        System.out.println("Please enter " + wordCount + " words:");
        for (int i = 0; i < wordCount; i++) {
            System.out.print("#" + (i + 1) + ": ");
            words[i] = scanner.next();
            scanner.nextLine();
        }

        // while with input validation
        int repetitions = 0;
        boolean validRepetitions = false;
        while (!validRepetitions) {
            System.out.print("How many times do you want to repeat the words?: ");
            if (scanner.hasNextInt()) {
                repetitions = scanner.nextInt();
                if (repetitions < 1) {
                    System.out.println("Invalid input");
                } else {
                    validRepetitions = true;
                }
            } else {
                System.out.println("Invalid input");
                scanner.next();
            }
            scanner.nextLine();
        }

        StringBuilder resultBuilder = new StringBuilder();

        for (String word : words) {
            for (int i = 0; i < repetitions; i++) {
                resultBuilder.append(word).append(" ");
            }
        }

        System.out.println("RESULT: " + resultBuilder);
        scanner.close();
    }
}