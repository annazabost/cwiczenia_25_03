public class Task5Test {


    public void run(){
        Task5 task5 = new Task5();
        Integer[] table = {32,5,6,2,4,5,7,5};
        task5.bubbleSort(table);
        task5.bubbleSort(new Integer[] {4,2,5,7,8,5});
        task5.bubbleSort(3, 4, 5, 6, 5, 4, 3); //metoda przyjmuje Integer... table - czyli wiele argumentow, ktore traktuje jak tablice

    }
}
