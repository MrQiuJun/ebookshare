package learnNetwork;

import org.testng.annotations.Test;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class QueryString {
    private StringBuilder query = new StringBuilder();

    public QueryString(){
    }
    public synchronized void add(String name, String value){
        encode(name, value);
        query.append('&');
    }

    private synchronized void encode(String name, String value){
        try {
            query.append(URLEncoder.encode(name, "UTF-8"));
            query.append('=');
            query.append(URLEncoder.encode(value, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public synchronized String getQuery() {
        return query.toString();
    }

    @Override
    public String toString(){
        return getQuery();
    }

    @Test
    public void test() throws UnsupportedEncodingException {
        QueryString queryString = new QueryString();
        queryString.add("bookName", "Java编程思维");
        String url = "http://49.235.252.43:8080/ebookshare/index.jsp?" + queryString;
        System.out.println(url);
        String decodeString = URLDecoder.decode(url,"utf-8");
        System.out.println(decodeString);
    }
}
