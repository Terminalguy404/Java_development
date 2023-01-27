import java.util.Scanner;

class User
{
    public static void main(String[] args) {
        int a;
        float b;
        String name;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your name");
        name = obj.nextLine();
        System.out.println("Your name is :" + name);

    }
}

