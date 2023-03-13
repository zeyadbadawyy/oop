public class MyInteger
{
    private int value;

    public MyInteger(int v)
    {
        value=v;
    }
    public int getValue()
    {
        return value;
    }

    public boolean isEven()
    {
        if(value%2==0)
        {
            return true;
        }
        else
            return false;
    }
    public boolean isOdd()
    {
        if(value%2!=0)
        {
            return true;
        }
        else
            return false;
    }
    public boolean isPrime()
    {
        if(value==1 || value==2)
        {
            return true;
        }
        else
        {
            for (int i=2;i<value;i++)
            {
                if (value%i==0)
                {
                    return false;
                }
            }
        }
        return true;
    }



    public static boolean isEven(int Int)
    {
        if(Int%2==0)
        {
            return true;
        }
        else
            return false;
    }

    public static boolean isOdd(int Int)
    {
        if(Int%2==1)
        {
            return true;
        }
        else
            return false;
    }

    public static boolean isPrime(int Int)
    {
        if (Int==1 || Int==2)
        {
            return true;
        }
        else
        {
            for (int i=2;i<Int;i++)
            {
                if (i%Int==0)
                    return false;
            }
        }
        return true;
    }

    public static boolean isEven(MyInteger Int)
    {
        return Int.isEven();
    }

    public static boolean isOdd(MyInteger Int)
    {
        return Int.isOdd();
    }

    public static boolean isPrime(MyInteger Int)
    {
        return Int.isPrime();
    }

    public boolean equals(int x)
    {
        if (x==value)
            return true;
        else
            return false;
    }

    public boolean equals(MyInteger Int)
    {
        if (Int.value==value)
            return true;
        else
            return false;
    }
}
