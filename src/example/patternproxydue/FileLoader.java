package example.patternproxydue;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
 
public class FileLoader {
 
     public byte[] load( String fileName ) {
        byte [] myFile = null;
        try {
            InputStream is = new FileInputStream( fileName );
            myFile = new byte[is.available()];
            is.read(myFile);
        } catch (IOException ex) {}
        return myFile;
    }
}