import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // // ������o��
        // System.out.println("���O��Kate Jones�ł�");
        
        // �������́��o��
        Scanner scanner = new Scanner(System.in);
        System.out.print("���O�F");
        String firstName = scanner.next();
        
        System.out.print("�c���F");
        String lastName = scanner.next();

        System.out.print("�N��F");
        int age = scanner.nextInt();

        System.out.println("���O��" + firstName + " " + lastName + "�ł�");
        System.out.println("�N���" + age + "�΂ł�");

        if (age >= 20) {
            System.out.println("���N�҂ł�");
        }else{
            System.out.println("�����N�҂ł�");
        }

    }
}
