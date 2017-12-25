
/**
 * Write a description of class Applet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.zip.*;
import javax.swing.*;
import java.util.*;
import java.io.*;

public class AkashSwing
{
    ZipFile zFile;
    String output;
    String names[];
    byte[] reader=new byte[1024];
    
    AkashSwing(String name)
    {
        try
        {
            zFile=new ZipFile(new File(name));
        }
        catch(ZipException zex)
        {}
        catch(IOException ioex)
        {}
    }
    void setLocation(String destin)
    {
        output=new String(destin);
    }
    void getEntries()
    {
        names=new String[zFile.size()];
        Enumeration enumeration=zFile.entries();
        for (int x=0; enumeration.hasMoreElements() ;++x) 
          names[x]=new String(enumeration.nextElement().toString());
    }
    void extract(String fileName)
    {
        ZipEntry ze=zFile.getEntry(fileName);
        FileOutputStream foStream=null;
        InputStream is=null;
        try
        {
            foStream=new FileOutputStream(fileName);
            is=zFile.getInputStream(ze);
        }
        catch(Exception e){}
        
        int temp=0;
        loop:
        while(temp!=-1)
        {
            try
            {
                temp=is.read(reader,0,reader.length);
                foStream.write(reader,0,temp);
            }
            catch(Exception e)
            {
                break loop;
            }
        }
    }
}
