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

        System.out.println("���O��" + firstName + " " + lastName + "�ł�");

    }
}
