import java.util.Scanner;

public class ConsoleScanner {
    Scanner sc;

    public ConsoleScanner(){// конструктор ! вызоветься при использовании слова new
        sc = new Scanner(System.in);
    }
    public int getNumber() {
        System.out.println("Введите число ");
        int num = 0;
        if(sc.hasNextInt()){
            num = sc.nextInt();
        }
        return num;

    }
}
