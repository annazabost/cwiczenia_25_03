import java.util.Scanner;

public class Task1a {

    public int numberOfStrings(){

        System.out.println("Podaj liczbe imion: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }

    public String[] makeTable(int number){

        String[] names = new String[number];
        for (int i = 0; i <number ; i++) {
            int j = i+1;
            System.out.println("Podaj "+ j + " imie:");
            Scanner scanner = new Scanner(System.in);
            names[i] = scanner.nextLine();
        }
        return names;

    }

    public void lookForName(String[] table){

        int longestName = 0;
        int shortestName = 100;
        int indexLongest = 0;
        int indexShortest = 0;

        int sizeTable = table.length;
        for (int i = 0; i < sizeTable; i++) {
            int lengthName = table[i].length();
            if (lengthName>longestName){
                longestName = lengthName;
                indexLongest = i;
            }else if (lengthName<shortestName){
                shortestName=lengthName;
                indexShortest=i;
            }

        }
        System.out.println("Najdluzsze imie: " + table[indexLongest]);
        System.out.println("Najkrotsze imie: " + table[indexShortest]);

    }

    public void repeatOfName(String[] table){

        int number = 0;
        int sizeTable = table.length;
        for (int i = 0; i < sizeTable; i++) {

            for (int j = 0; j <sizeTable ; j++) {
                if(table[i].equals(table[j])){
                    number++;
                }

            }
            if (number!=1){
                System.out.println(table[i] + " powtarza sie " + number);
            }

            number = 0;

        }

    }


}
