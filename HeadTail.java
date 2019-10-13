class HeadTail{
  static  void fun(int n)
    {

        // Tail
        if(n>0)
        {
            System.out.print(n+" ");
            fun(n-1);
        }

    }
    public static void main(String args[] )
    {
          int n=5;
          fun(5);
    }
}