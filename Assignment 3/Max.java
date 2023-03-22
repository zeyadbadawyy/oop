public static Integer max(ArrayList<Integer> list)
{
    Integer maxInteger = list.get(0);

    if (list.size()==0)
    {
        return null;
    }
    for (int i=0;i<list.size();i++)
    {
        if (list.get(i)>maxInteger)
        maxInteger=list.get(i);
    }
    return maxInteger;
}