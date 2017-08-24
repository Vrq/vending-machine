import com.jt.Drink;
import com.jt.DrinkVendingMachine;
import java.util.HashMap;

public class DrinkVendingMachineTest {
    //the calculateChangeCoins method should always provide change with the least possible amount of coins
    public void testCalculateChangeCoins() {
        HashMap<Integer, Integer> moneySupply= new HashMap<>();
        DrinkVendingMachine drinkMachine = new DrinkVendingMachine();
        moneySupply.put(10, 5);
        moneySupply.put(20, 0);
        moneySupply.put(50, 3);
        moneySupply.put(100, 2);
        moneySupply.put(200, 1);

        int moneyToReturnA = 50;
        int moneyToReturnB = 110;
        int moneyToReturnC = 330;
        int moneytoReturnD = 460;

        HashMap calculatedChangeA = drinkMachine.calculateChangeCoins(moneyToReturnA, moneySupply);

    }
}
