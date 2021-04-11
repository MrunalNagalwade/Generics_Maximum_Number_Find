package generics;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Max_Number_Test {
    Max_number max_number = new Max_number();

    //for Integer Number
    @Test
    public void FirstNumber_Max()
    {
        Integer[] intArray = { 9, 3,6,5,7 };
        int max = max_number.findMaxValue(intArray);
        Assertions.assertEquals( 9, max);
    }

    @Test
    public void SecondNumber_Max()
    {
        Integer[] intArray = { 30, 50, 24};
        Integer max = max_number.findMaxValue(intArray);
        Assertions.assertEquals( 50, max);
    }

    @Test
    public void ThirdNumber_max()
    {
        Integer[] intArray = { 9, 3,12};
        Integer max = max_number.findMaxValue(intArray);
        Assertions.assertEquals( 12,max);
    }


    //for Float Number
    @Test
    public void Float_Max_num()
    {
        Float[] floatArray = { 7.8f, 3.2f, 6.3f, 2.9f };
        Float maxf = max_number.findMaxValue(floatArray);
        Assertions.assertEquals( 7.8f, maxf);
    }

    @Test
    public void SecondFloat_Maximum()
    {
        Float[] floatArray = { 2.4f, 9.7f, 4.5f, 3.7f };
        Float maxf = max_number.findMaxValue(floatArray);
        Assertions.assertEquals( 9.7f, maxf);
    }

    @Test
    public void ThirdFloat_Maximum()
    {
        Float[] floatArray = { 8.9f, 7.2f, 12.6f, 9.2f };
        Float maxf = max_number.findMaxValue(floatArray);
        Assertions.assertEquals( 12.6f, maxf);
    }

    //for string
    @Test
    public void string_Maximum()
    {
        String[] stringArray = { "mrunal", "ritu", "riyan" };
        String maxs = max_number.findMaxValue(stringArray);
        Assertions.assertEquals( "riyan", maxs);
    }

    @Test
    public void string_max()
    {
        String[] stringArray = { "rutuja", "priyanka", "pooja" };
        String maxs = max_number.findMaxValue(stringArray);
        Assertions.assertEquals( "rutuja", maxs);
    }
    @Test
    public void third_max_string()
    {
        String[] stringArray = { "riya", "priya", "diksha" };
        String maxs = max_number.findMaxValue(stringArray);
        Assertions.assertEquals( "riya", maxs);
    }
}
