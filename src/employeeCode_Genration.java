


import java.util.Scanner;

public class  employeeCode_Genration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        String empId = sc.nextLine();

        String[] parts = name.split(" ");

        String code = "";
        code += parts[0].charAt(0);
        code += parts[1].charAt(0);

        code += empId.replace("EMP-", "");

        System.out.println(code);

        sc.close();
    }
}
