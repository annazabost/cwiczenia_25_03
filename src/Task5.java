public class Task5 {

    public void bubbleSort(Integer[] table){

        int sizeTable = table.length;
        for (int j = 0; j <sizeTable ; j++) {

            for (int i = 0; i < sizeTable-1; i++) {
                if (table[i] > table[i + 1]) {
                    int temp = table[i + 1];
                    table[i + 1] = table[i];
                    table[i] = temp;
                }

            }
        }
        for (int i = 0; i < sizeTable; i++) {

            System.out.println(table[i]);

        }

    }

}
