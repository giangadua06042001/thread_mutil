public class Product extends Thread {
    private String productName;
    private double price;
    private double size;

    public Product() {
    }

    @Override
    public void run() {
        System.out.println("Tao cua Product");
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Product{" +

                ", price=" + price +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Product());
        System.out.println("Vừa tạo một thread chưa cấp vùng nho");
        thread.start();
        System.out.println("ten cua thread" + ":" + thread.getName());
        try {
            Thread.sleep(5000);
            Cat cat=new Cat("Meo",2,2.2);
            System.out.println(cat);
            Thread.sleep(7000);
            Cat catNew=new Cat("Meo2",3,3.3);
            System.out.println(catNew);
            thread.join(3000);
            System.out.println("Thread da chet");
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
