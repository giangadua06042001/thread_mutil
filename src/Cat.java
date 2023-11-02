public class Cat {
    private String nameCat;
    private int old;
    private double weight;

    public Cat() {
    }

    public Cat(String nameCat, int old, double weight) {
        this.nameCat = nameCat;
        this.old = old;
        this.weight = weight;
    }

    public String getNameCat() {
        return nameCat;
    }

    public void setNameCat(String nameCat) {
        this.nameCat = nameCat;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "nameCat='" + nameCat + '\'' +
                ", old=" + old +
                ", weight=" + weight +
                '}';
    }
}
