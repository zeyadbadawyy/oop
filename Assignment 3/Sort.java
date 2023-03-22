public static void sort (ArrayList<Integer> list)
{
    for (int i=0;i<list.size();i++)
    {
        for (int j=i+1;j<list.size();j++)
        {
            if(list.get(i)>list.get(j))
            {
                int tmp = list.get(i);
                list.set(i,list.get(j)) ;
                list.set(j,tmp);
            }

        }

    }
}