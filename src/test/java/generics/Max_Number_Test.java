package generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Max_Number_Test {
    @Test
    public void givenThreeInput_WhenProper_ReturnTrue() {
        Integer firstnumber = 1;
        Integer secondnumber = 7;
        Integer thirdnumber = 8;
        Max_number max_number = new  Max_number();
        Integer maxNum = max_number.checkmaxnum(firstnumber,secondnumber,thirdnumber);
        Assertions.assertEquals((Integer)8,maxNum);
    }
}
