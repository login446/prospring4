package com.apress.prospring4.ch4.kindergarten;

import com.apress.prospring4.ch4.Food;
import com.apress.prospring4.ch4.FoodProviderService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 11.10.2016.
 */
public class FoodProviderServiceImpl implements FoodProviderService {
    @Override
    public List<Food> provideLunchSet() {
        List<Food> lunchSet = new ArrayList<Food>();
        lunchSet.add(new Food("Milk"));
        lunchSet.add(new Food("Biscuits"));

        return lunchSet;
    }
}
