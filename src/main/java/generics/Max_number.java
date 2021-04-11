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
    //For String
    public <T extends Comparable> Comparable checkmaxString(T firstNAME, T secondNAME, T thirdNAME)
    {
        if (firstNAME.compareTo(secondNAME) > 0 )
        {
            return (String) firstNAME;
        }
        else if (thirdNAME.compareTo(secondNAME) > 0)
        {
            return (String) thirdNAME;
        }
        else
        {
            return (String) secondNAME;
        }
    }

}
