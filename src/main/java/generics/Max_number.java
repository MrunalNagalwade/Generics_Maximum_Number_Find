package generics;

public class Max_number {
    public <E extends Integer> Integer checkmaxnum(E firstnumber, E secondnumber, E thirdnumber)
    {
        if (firstnumber.compareTo(secondnumber) > 0 )
        {
            return firstnumber;
        }
        else if (thirdnumber.compareTo(secondnumber) > 0)
        {
            return thirdnumber;
        }
        else
        {
            return secondnumber;
        }
    }

    public <E extends Float> Float checkmaxnumFloat(E firstnumber, E secondnumber, E thirdnumber)
    {
        if (firstnumber.compareTo(secondnumber) > 0 )
        {
            return firstnumber;
        }
        else if (thirdnumber.compareTo(secondnumber) > 0)
        {
            return thirdnumber;
        }
        else
        {
            return secondnumber;
        }
    }
}
