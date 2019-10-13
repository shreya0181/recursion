class StaticGlobal
{
     static int x=0;
     static public int fun(int n)
    {
      
        if(n>0)
        {
            x++;
            
            return fun(n-1)+x;

        }
        return 0;

    }
    static  public int fun2(int n)
    {
  
        if(n>0)
        {
            return fun2(n-1)+n;

        }
        return 0;

    }
    public static void main(String args[])
    {
           int resStatic=fun(5);
           System.out.println(resStatic);
           int resNonStatic =fun2(5);
           System.out.println(resNonStatic);

    }
}