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

        System.out.print("�g��(m)");
        double height = scanner.nextDouble();

        System.out.print("�̏d(kg)");
        double weight = scanner.nextDouble();

        System.out.println("���O��" + firstName + " " + lastName + "�ł�");
        System.out.println("�N���" + age + "�΂ł�");

        if (age >= 20) {
            System.out.println("���N�҂ł�");
        }else{
            System.out.println("�����N�҂ł�");
        }

        printData(firstName, lastName, age, height, weight);

    }

    public static void printData(String firstName, String lastName, int age, double height, double weight){
        System.out.println("���O��" + fullName(firstName, lastName) + "�ł�");
        System.out.println("�N���" + age + "�΂ł�");

        if (age >= 20) {
            System.out.println("���N�҂ł�");
        }else{
            System.out.println("�����N�҂ł�");
        }
        System.out.println("�g����" + height + "m�ł�");
        System.out.println("�̏d��" + weight + "kg�ł�");
    }

    public static String fullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }

}
