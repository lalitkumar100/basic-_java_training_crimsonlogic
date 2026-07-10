import java.util.HashMap;
import java.util.Scanner;

public class Most_frequest_char {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String str = sc.nextLine();

            HashMap<Character, Integer> map = new HashMap<>();

            // Count frequency of each character
            for (char ch : str.toCharArray()) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }

            char maxChar = ' ';
            int maxCount = 0;

            // Find most frequent character
            for (char ch : str.toCharArray()) {
                if (map.get(ch) > maxCount) {
                    maxCount = map.get(ch);
                    maxChar = ch;
                }
            }

            System.out.println(maxChar + " = " + maxCount);

            sc.close();
        }
    }

