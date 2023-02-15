package test;

public class UsingJoinMethod extends Thread {

    public UsingJoinMethod(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName());
        for (int i = 1; i <= 5; i++) {
            try {
                System.out.print(i + " ");
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) throws InterruptedException {
        UsingJoinMethod t1 = new UsingJoinMethod("Thread 1");
        UsingJoinMethod t2 = new UsingJoinMethod("Thread 2");
        t1.start();
//        t1.join();
        // Main Thread phải chờ 450ms mới được tiếp tục chạy.
        // Không nhất thiết phải chờ Thread t1 kết thúc
        t1.join(450);

        t2.start();
        System.out.println("Main Thread Finished");
    }
}
