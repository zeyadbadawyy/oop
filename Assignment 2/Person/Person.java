public class Person
{
    private String name;
    private String address;
    private int phoneNum;
    private String email;

    public String getName()
    {
        return name;
    }

    public String getAddress()
    {
        return address;
    }

    public int getPhoneNum()
    {
        return phoneNum;
    }

    public String getEmail()
    {
        return email;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setPhoneNum(int phoneNum)
    {
        this.phoneNum = phoneNum;
    }

    public Person(String n, String a, int p, String e)
    {
        name=n;
        address=a;
        phoneNum=p;
        email=e;
    }
    public String toString() {
        return "Person," + name;
    }
}
