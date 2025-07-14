
package suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.login.Login_001;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        Login_001.class,

})
public class AllLoginTests {

}
