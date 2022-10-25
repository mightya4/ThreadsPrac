import java.util.Thread;

public class ThreadProgram implements Runnable {
    
    public void run() {
        System.out.println("Thread is running.");
    }
    
    public static void main(String[] args) {
        ThreadProgram threadObj = new ThreadProgram();
        Thread newThread = new Thread(threadObj);
        newThread.start();
    }
}
