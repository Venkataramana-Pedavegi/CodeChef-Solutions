import java.util.*;

class MyArrayList
{
    private int[] arr;
    private int size;

    MyArrayList()
    {
        arr = new int[2];
        size = 0;
    }

    void add(int element)
    {
        if (size == arr.length)
        {
            int[] newArr =
                new int[arr.length * 2];

            for (int i = 0; i < arr.length; i++)
            {
                newArr[i] = arr[i];
            }

            arr = newArr;
        }

        arr[size] = element;
        size++;
    }

    int get(int index)
    {
        return arr[index];
    }

    int size()
    {
        return size;
    }

    void print()
    {
        for (int i = 0; i < size; i++)
        {
            if (i > 0)
            {
                System.out.print(" ");
            }

            System.out.print(arr[i]);
        }

        System.out.println();
    }
}

class Codechef
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();

        MyArrayList list = new MyArrayList();

        while (q-- > 0)
        {
            String operation = sc.next();

            if (operation.equals("add"))
            {
                int x = sc.nextInt();
                list.add(x);
            }
            else if (operation.equals("get"))
            {
                int index = sc.nextInt();
                System.out.println(list.get(index));
            }
            else if (operation.equals("size"))
            {
                System.out.println(list.size());
            }
            else if (operation.equals("print"))
            {
                list.print();
            }
        }

        sc.close();
    }
}