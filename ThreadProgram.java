import java.util.Thread;

public class ThreadProgram extends Thread {
    
    public void run() {
        System.out.println("Thread is running.");
    }
    
    public static void main(String[] args) {
        ThreadProgram threadObj = new ThreadProgram();
        threadObj.start();
    }
}
