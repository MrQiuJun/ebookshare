package learnIO;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IO {
    public static void dump(InputStream inputStream, OutputStream outputStream) throws IOException {
        try(InputStream its = inputStream; OutputStream ots = outputStream ){
            byte [] data = new byte[1024];
            int length ;
            while ((length = inputStream.read(data)) != -1 ){
                outputStream.write(data, 0, length);
            }
        }
    }
}
