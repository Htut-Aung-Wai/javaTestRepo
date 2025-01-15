package array;

import java.util.ArrayList;

public class array_list {

    public static void main (String[] args)
    {
        ArrayList<String> arr_list=new ArrayList<String>();

        arr_list.add("Htut");
        arr_list.add("Aung");
        arr_list.add("Wai");

        for (String a:arr_list)
        {
            System.out.print(a+" ");
        }


    }
}
