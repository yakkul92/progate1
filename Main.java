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

        System.out.print("年齢：");
        int age = scanner.nextInt();

        System.out.print("身長(m)");
        double height = scanner.nextDouble();

        System.out.print("体重(kg)");
        double weight = scanner.nextDouble();

        System.out.println("名前は" + firstName + " " + lastName + "です");
        System.out.println("年齢は" + age + "歳です");

        if (age >= 20) {
            System.out.println("成年者です");
        }else{
            System.out.println("未成年者です");
        }

        Person.printData(firstName, lastName, age, height, weight);

    }



}
