
/**
 * Write a description of class TestPro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestPro
{
    String w;
    char letters[]=new char[100];
    boolean tested[]=new boolean[100];
    void main(String word)
    {
        w=word;
        recurse(0);
    }
    void recurse(int pos)
    {
        if(pos==w.length())
        {
            for(int x=0;x<w.length();++x)
                System.out.print(letters[x]);
            System.out.println();
            return;
        }
        for(int x=0;x<w.length();++x)
        {
            if(!tested[x])
            {
                tested[x]=true;
                letters[pos]=w.charAt(x);
                recurse(pos + 1);
                tested[x]=false;
            }
        }
    }
}
