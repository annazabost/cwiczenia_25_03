public class Task1 {

    public void run(){
        Task1a task1a = new Task1a();
        int number = task1a.numberOfStrings();
        String[] table = task1a.makeTable(number);
        task1a.lookForName(table);
        task1a.repeatOfName(table);
    }

}
