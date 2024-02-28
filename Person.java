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

        double bmi = bmi(weight, height);
        System.out.println("BMI��" + Math.round(bmi) + "�ł�");

        if (isHealthy(bmi) == true) {
            system.out.println("���N�ł�");
        }else{
            System.out.println("���N�ł͂���܂���");
        }
    }

    public static String fullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }

    public static double bmi(double weight, double height){
        return weight / height / height;
    }

    public static boolean isHealthy(double bmi){
        return bmi >= 18.5 && bmi < 25.0;
    }
}
