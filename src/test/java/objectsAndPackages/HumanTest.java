package objectsAndPackages;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class HumanTest {

    @Test
    public void returnFalseIfSexIsF() throws WrongSexException {
        Boolean addResult = Human.isMale("F");
        Boolean result = false;
        Assertions.assertEquals(result, addResult);
    }
}
