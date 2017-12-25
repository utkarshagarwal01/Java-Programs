class ncr
{
ncr(ncr  c)
{
}
    public static void main(String[] args) {

                System.out.println(comp(Integer.parseInt(args[0]),Integer.parseInt(args[1])));

    }

    static int comp(int n,int r)
    {
       if(r==1)
        return n;
        else if(n==r)
        return 1;
        else
        return (comp(n-1,r)+comp(n-1,r-1));
    }
}