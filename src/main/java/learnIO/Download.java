package learnIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class Download {
    public static void downloadFile(String url, String fileName, String filePath) throws IOException {
        URL url1 = new URL(url);
        InputStream inputStream = url1.openStream();
        OutputStream outputStream = new FileOutputStream(filePath + fileName);
        IO.dump(inputStream, outputStream);
    }
}
