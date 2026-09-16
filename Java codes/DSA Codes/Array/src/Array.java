public class Array {
   private int [] items;
   private int count;
   public Array(int lenght)
   {
       items =new int[lenght];
   }

   public void print()
   {
       for (int i=0; i<count; i++)
       {
           System.out.println(items[i]);
       }
   }
    public void insert(int item)
    {
        if(count== items.length)
        {
            int[] newItems=new int[count*2];
            for (int i=0; i<items.length; i++)
            {
                newItems[i]=items[i];
            }
            items=newItems;
        }
        items[count++]=item;
    }

    public void removeAt(int index)
    {
        if (index < 0 || index>=count)
            throw new IllegalArgumentException();

        for(int i = index; i< count; i++)
        {
            items[i]= items[i + 1];
        }
        count--;
    }

    public int indexOf (int value)
    {
        for (int i = 0; i< count; i++)
        {
            if (items[i]==value)
            {
                return i;
            }
        }
        return -1;
    }






}
