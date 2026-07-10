import java.util.Scanner;


public class CheckDuplicateEmail {

    public  static  void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter first email");
        String password1 = sc.nextLine();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter second email");
        String passwor2 = sc1.nextLine();


        if(passwor2.equals(password1)){
            System.out.println("same email");
        }
        else{
            System.out.println("differnt email");
        }

    }
}
