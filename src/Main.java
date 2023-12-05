import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(calc(input));
    }

    public static String calc(String input) throws Exception {
        new Exeptions().checkOne(input);

        String [] str = input.split(" ");
        new Exeptions().checkThree(str);

        int one = new Digits().transform(str[0]);
        int two = new Digits().transform(str[2]);

        String rez = String.valueOf( new Digits().count(str[1],one,two));
        if(new Exeptions().checkTwo(str[0]) == 0){
            rez = new Digits().reverse(Integer.parseInt(rez));
        }

        return rez;
    }

}