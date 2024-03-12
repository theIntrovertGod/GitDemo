import java.util.Comparator;
public class carEngineSizeComparator implements  Comparator<Car>{
    public int compare(Car o1, Car o2){
        return o1.getEngineSize() - o2.getEngineSize();
    }
}
