import java.util.Arrays;
import java.util.Scanner;

public class Compare_name {

    public  static  void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String[] names = input.split(", ");

        Arrays.sort(names);

        System.out.println(String.join(", ", names));

        sc.close();
    }
}
