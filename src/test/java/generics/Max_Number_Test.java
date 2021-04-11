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
    public void givenThreeInput_WhenProper_second__integerNumber_ReturnTrue() {
        Integer firstnumber = 34;
        Integer secondnumber = 56;
        Integer thirdnumber = 23;
        Max_number max_number = new  Max_number();
        Integer maxNum = max_number.checkmaxnum(firstnumber,secondnumber,thirdnumber);
        Assertions.assertEquals((Integer)56,maxNum);
    }
    @Test
    public void givenThreeInput_WhenProper_third_integerNumber_ReturnTrue() {
        Integer firstnumber = 45;
        Integer secondnumber = 78;
        Integer thirdnumber = 80;
        Max_number max_number = new  Max_number();
        Integer maxNum = max_number.checkmaxnum(firstnumber,secondnumber,thirdnumber);
        Assertions.assertEquals((Integer)80,maxNum);
    }
    @Test
    public void givenThreeInput_WhenProper_first_floatNumber_ReturnTrue() {
        Float firstnumber = 120.7f;
        Float secondnumber = 90.3f;
        Float thirdnumber = 12.4f;
        Max_number max_number = new  Max_number();
        Float maxNum = max_number.checkmaxnumFloat(firstnumber,secondnumber,thirdnumber);
        Assertions.assertEquals((Float)120.7f,maxNum);
    }
    @Test
    public void givenThreeInput_WhenProper_second_floatNumber_ReturnTrue() {
        Float firstnumber = 67.7f;
        Float secondnumber = 90.3f;
        Float thirdnumber = 12.4f;
        Max_number max_number = new  Max_number();
        Float maxNum = max_number.checkmaxnumFloat(firstnumber,secondnumber,thirdnumber);
        Assertions.assertEquals((Float)90.3f,maxNum);
    }
    @Test
    public void givenThreeInput_WhenProper_third_floatNumber_ReturnTrue() {
        Float firstnumber = 12.7f;
        Float secondnumber = 50.3f;
        Float thirdnumber = 80.4f;
        Max_number max_number = new  Max_number();
        Float maxNum = max_number.checkmaxnumFloat(firstnumber,secondnumber,thirdnumber);
        Assertions.assertEquals((Float)80.4f,maxNum);
    }
    @Test
    public void givenThreeInput_WhenProper_first_stringNumber_ReturnTrue() {
        String firstNAME = "mrunal";
        String secondNAME = "puja";
        String thirdNAME = "subodh";
        Max_number max_number = new  Max_number();
        String maxNum = (String) max_number.checkmaxString(firstNAME,secondNAME,thirdNAME);
        Assertions.assertEquals((String)"subodh",maxNum);
    }
    @Test
    public void givenThreeInput_WhenProper_second_stringNumber_ReturnTrue() {
        String firstNAME = "riya";
        String secondNAME = "swety";
        String thirdNAME = "priyanka";
        Max_number max_number = new  Max_number();
        String maxNum = (String) max_number.checkmaxString(firstNAME,secondNAME,thirdNAME);
        Assertions.assertEquals((String)"swety",maxNum);
    }
    @Test
    public void givenThreeInput_WhenProper_third_stringNumber_ReturnTrue() {
        String firstNAME = "aparna";
        String secondNAME = "priya";
        String thirdNAME = "sneha";
        Max_number max_number = new  Max_number();
        String maxNum = (String) max_number.checkmaxString(firstNAME,secondNAME,thirdNAME);
        Assertions.assertEquals((String)"sneha",maxNum);
    }
}
