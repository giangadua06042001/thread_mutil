public class Main {
    public static void main(String[] args) {
      Thread thread=new Thread_mutil();

        // NEW
        System.out.println("Trạng thái chủ đề: " + thread.getState());

        // STARTED
        thread.start();
        System.out.println("Thread sau khi bắt đầu: " + thread.getState());

        try {
            // WAITING
            Thread.sleep(1000);
            System.out.println("Trạng thái chủ đề sau khi ngủ: " + thread.getState());

            // TIMED_WAITING
            Thread.sleep(2000);
            System.out.println("Trạng thái chủ đề sau khi ngủ lại: " + thread.getState());

            // TERMINATED
            thread.join();
            System.out.println("Trạng thái chủ đề sau khi tham gia " + thread.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}