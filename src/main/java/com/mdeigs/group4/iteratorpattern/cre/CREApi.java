package com.mdeigs.group4.iteratorpattern.cre;

import com.mdeigs.group4.iteratorpattern.cre.domain.UserData;

import java.util.HashMap;
import java.util.Map;

public class CREApi {
    private CREApi() {
    }

    public static Map<Integer, UserData> getCREInfo() {
        Map<Integer, UserData> creData = new HashMap<>();
        creData.put(100, new UserData("Paul", "Cainco", 100));
        creData.put(200, new UserData("Pedro", "La Salle", 1002));
        creData.put(300, new UserData("Jorge", "Segundo Anillo", 200));
        return creData;
    }
}
