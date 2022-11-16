import java.util.Random;

/**
 * Java class for Challenge 1
 * Sophos Bootcamp 2022
 */
public class Challenge1 {
    /**
     * Method that returns a 10-digit random number
     * @param type type that selects the start of the number
     * @return 10-digit random number
     */
    static String randomNumbers(String type) {
        Random r = new Random();
        String start = "00";
        int random = 10000000 + r.nextInt(90000000);
        if (type.equals("TipoA")) {
            System.out.println("Type A");
            start = "54";
        }
        if (type.equals("TipoB")) {
            System.out.println("Type B");
            start = "08";
        }
        return start + random;
    }

    static int[] sortNumbers(int[] numbers, String order) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int tmp = 0;
                if (order.equals("Asc")) {
                    if (numbers[i] > numbers[j]) {
                        tmp = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = tmp;
                    }
                }
                if (order.equals("Desc")) {
                    if (numbers[i] < numbers[j]) {
                        tmp = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = tmp;
                    }
                }
            }
        }
        return numbers;
    }
}
