package generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Max_Number_Test {
    @Test
    public void givenThreeInput_WhenProper_first_Number_ReturnTrue() {
        Integer firstnumber = 9;
        Integer secondnumber = 1;
        Integer thirdnumber = 4;
        Max_number max_number = new  Max_number();
        Integer maxNum = max_number.checkmaxnum(firstnumber,secondnumber,thirdnumber);
        Assertions.assertEquals((Integer)9,maxNum);
    }
    @Test
    public void givenThreeInput_WhenProper_second_Number_ReturnTrue() {
        Float firstnumber = 67.7f;
        Float secondnumber = 90.3f;
        Float thirdnumber = 12.4f;
        Max_number max_number = new  Max_number();
        Float maxNum = max_number.checkmaxnumFloat(firstnumber,secondnumber,thirdnumber);
        Assertions.assertEquals((Float)90.3f,maxNum);
    }
}
