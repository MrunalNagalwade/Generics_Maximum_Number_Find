package generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Max_Number_Test {
    @Test
    public void givenThreeInput_WhenProperfirst_Number_ReturnTrue() {
        Integer firstnumber = 9;
        Integer secondnumber = 1;
        Integer thirdnumber = 4;
        Max_number max_number = new  Max_number();
        Integer maxNum = max_number.checkmaxnum(firstnumber,secondnumber,thirdnumber);
        Assertions.assertEquals((Integer)9,maxNum);
    }
}
