class RaggedArray
{
    public static void main (String args[])
    {
        int Arr[][]=new int[4][];
        Arr[0] = new int [3];
        Arr[1] = new int [5];
        Arr[2] = new int [6];
        Arr[3] = new int [2];

        System.out.println(Arr.length);
        System.out.println(Arr[0].length);
        System.out.println(Arr[1].length);
        System.out.println(Arr[2].length);
        System.out.println(Arr[3].length);

    }
}