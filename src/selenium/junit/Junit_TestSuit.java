package selenium.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({Login.class,FindAFlight.class,SelectAFlight.class,BookAFlight.class,Confirmation.class})
public class Junit_TestSuit {

}
