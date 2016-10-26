package com.apress.prospring4.ch3.annotation;

import com.apress.prospring4.ch3.Oracle;
import org.springframework.stereotype.Component;

/**
 * Created by admin on 20.09.2016.
 */
@Component("oracle")
public class BookwormOracle implements Oracle {
    public String defineMeaningOfLife() {
        return "Encyclopedias are a waste of money - use the Internet";
    }
}
