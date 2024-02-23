import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // // 文字列出力
        // System.out.println("名前はKate Jonesです");
        
        // 文字入力→出力
        Scanner scanner = new Scanner(System.in);
        System.out.print("名前：");
        String firstName = scanner.next();
        
        System.out.print("苗字：");
        String lastName = scanner.next();

        System.out.println("名前は" + firstName + " " + lastName + "です");

    }
}
