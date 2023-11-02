public class Thread_mutil extends Thread {
    public Thread_mutil() {
    }

    @Override
    public void run() {
        try {
            // RUNNABLE
            System.out.println("Trạng thái luồng đang chạy: " + Thread.currentThread().getState());

            // BLOCKED
            synchronized (this) {
                Thread.sleep(500);
                System.out.println("Trang thai da bi khoa");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

