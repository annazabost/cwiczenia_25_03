import java.io.IOException;

public class Task6a {

    public void run(){
        Task6 task6 = new Task6();
        try {
            task6.newFile();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
