package com.qa.hotel.test;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/com/qa/hotel/test/hotelAPI.feature")
public class Runner {

}
