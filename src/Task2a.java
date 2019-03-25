import java.util.Scanner;

public class Task2a {

    public int takeNumber(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe od 1 do 100: ");
        int number = scanner.nextInt();
        while (number>100){
            System.out.println("Liczba jest zbyt duza! Podaj inna z zakresu od 1 do 100.");
            number = scanner.nextInt();
        }
        return number;

    }

    public void drawingNumbers(int number){


        int i = 0;
        int a = 0;
        while (a!=number) {
            double random = Math.random()*100;
            a = (int) random;
            i++;
        }

        System.out.println("Szukana liczba: " + number);
        System.out.println("Ilosc prob: " + i);



    }

}
