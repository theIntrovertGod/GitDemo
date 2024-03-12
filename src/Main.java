import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }
        System.out.println("Car class demo");

        Car c1= new Car(100000, 1200, 80);
        Car c2= new Car(200000, 1000, 100);
        Car c3= new Car(300000, 800, 120);
        Car c4= new Car(400000, 600, 140);
        List<Car> carList = new ArrayList<>(Arrays.asList(c2, c1, c4, c3));
        carList.sort(new CarPriceComparator());
        System.out.println(carList);

    }
}