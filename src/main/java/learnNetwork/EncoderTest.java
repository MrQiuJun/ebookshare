package learnNetwork;

import org.testng.annotations.Test;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class EncoderTest {
    @Test
    public void test() throws UnsupportedEncodingException {
        String encodedUrl = URLEncoder.encode("bookName=Java编程思维","utf-8");
        System.out.println(encodedUrl);

         encodedUrl = URLEncoder.encode("this string has space",
                 "utf-8");
        System.out.println(encodedUrl);
    }
}
