package com.jt;

import java.util.HashMap;

/**
 * General purpose VendindMachine interface to provide functions that should be implemented by every machine type
 */
public interface VendingMachine {
    public HashMap<Integer, Integer> calculateChangeCoins(int moneyToReturn, HashMap<Integer, Integer> moneyStock);
}
