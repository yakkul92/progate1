public class Person {
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
        System.out.println("BMI��" + Math.round(bmi(weight, height)) + "�ł�");
    }

    public static String fullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }

    public static double bmi(double weight, double height){
        return weight / height / height;
    }
}
