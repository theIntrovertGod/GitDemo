import java.util.Comparator;
public class CarPriceComparator implements Comparator<Car> {
    public int compare(Car o1, Car o2) {
        return o1.getPrice() - o2.getPrice();
    }
}
