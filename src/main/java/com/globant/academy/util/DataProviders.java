package com.globant.academy.util;

import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider(name = "getData")
    public static Object[][] getData() {
        return new Object[][]{{"DataUtil.readRandomData()"}};
    }
}
