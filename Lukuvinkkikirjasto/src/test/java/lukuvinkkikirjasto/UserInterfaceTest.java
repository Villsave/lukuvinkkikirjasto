
package lukuvinkkikirjasto;

import java.util.ArrayList;
import java.util.Arrays;
import lukuvinkkikirjasto.userinterface.StubIO;
import lukuvinkkikirjasto.userinterface.UserInterface;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author henri
 */
public class UserInterfaceTest {
    
    @Test
    public void oneTitleCanBeAdded() {
        ArrayList<String> str = new ArrayList<>(Arrays.asList("u", "testTitle", "l", "p"));
        StubIO io = new StubIO(str);
        
        UserInterface ui = new UserInterface(io);
        ui.run();
        
        ArrayList<String> prints = io.getOutputs();
        assertTrue(prints.get(prints.size() - 2).equals("testTitle"));
    }
    
    @Test
    public void multipleTitlesCanBeAdded() {
        ArrayList<String> str = new ArrayList<>(Arrays.asList("u", "t1", "u", "t2", "u", "t3", "l", "p"));
        StubIO io = new StubIO(str);
        
        UserInterface ui = new UserInterface(io);
        ui.run();
        
        ArrayList<String> prints = io.getOutputs();
        
        assertTrue(prints.get(prints.size() - 4).equals("t1"));
        assertTrue(prints.get(prints.size() - 3).equals("t2"));
        assertTrue(prints.get(prints.size() - 2).equals("t3"));
    }
    
}
