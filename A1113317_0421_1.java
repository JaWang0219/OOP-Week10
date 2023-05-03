import java.util.Scanner;

public class A1113317_0421_1 {
    public static void main(String[] args) {

        String mail = "[a-z]+@([a-z]+.[a-z]+)+";

        Scanner inputmail = new Scanner(System.in);   
        String emailString;
        boolean emailResult;

        System.out.print("Please input email address: ");
        emailString = inputmail.nextLine();

        emailResult = emailString.matches(mail);

        if (emailResult)
            System.out.println("格式正確");
        else
            System.out.println("格式錯誤");
    }
}