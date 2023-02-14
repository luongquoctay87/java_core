package test;

public class TestingThread {

    public static void main(String[] args) throws InterruptedException {
//        runThreadDemo();
//        ruRunnableDemo();
        threadSafe();
    }

    static void threadSafe() throws InterruptedException {
        System.out.println("Thread-Safe running... ");
        ThreadDemo T1 = new ThreadDemo("Thread-A");
        ThreadDemo T2 = new ThreadDemo("Thread-B");
        ThreadDemo T3 = new ThreadDemo("Thread-C");

        // set priority: quyen uu tien dc cap phat bo nho truoc
//        T1.setPriority(10); // max
//        T2.setPriority(5); // norm
//        T3.setPriority(1); // min

        T1.start();
        T1.join();
        T2.start();
//        T2.join();
//        T3.start();

        System.out.println("STOP->Thread-Safe !!!!!!!!");
    }

    static void runThreadDemo() {
        System.out.println("ThreadDemo running... ");
        ThreadDemo T1 = new ThreadDemo("Thread-1-HR-Database");
        T1.start();

        ThreadDemo T2 = new ThreadDemo("Thread-2-Send-Email");
        T2.start();

        System.out.println("STOP!!!!!!!!");
    }

    static void ruRunnableDemo() {
        System.out.println("RunnableDemo running... ");

        RunnableDemo R1 = new RunnableDemo("Thread-1-HR-Database");
        R1.start();

        RunnableDemo R2 = new RunnableDemo("Thread-2-Send-Email");
        R2.start();

        System.out.println("==> Main thread stopped!!! ");
    }
}
