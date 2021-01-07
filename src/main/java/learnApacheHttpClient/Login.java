package learnApacheHttpClient;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Login {
    protected CookieStore cookieStore = null;
    protected String x_auth = null;

    public boolean doLogin(){
        String url = "http://abc";
        String json_content = "{\"abc\":\"cde\"}";

        CloseableHttpClient client = HttpClientBuilder.create().build();
        StringEntity entity = new StringEntity(json_content,"UTF-8");
        entity.setContentEncoding("UTF-8");
        entity.setContentType("application/json;charset=UTF-8");
        HttpPost query_post = new HttpPost(url);
        query_post.setEntity(entity);

        try{
            HttpClientContext loginHttpClientContext = new HttpClientContext().create();
            HttpResponse res = client.execute(query_post, loginHttpClientContext);
            if (res.getStatusLine().getStatusCode() == 200){
                String retStr = readInputStreamIntoString(res.getEntity().getContent(), "UTF-8");
                System.out.println("RETMSG: " + retStr);

                JsonObject jo = (JsonObject) (new JsonParser().parse(retStr));
                boolean o_succ = jo.get("success").getAsBoolean();
                System.out.println("o_succ:"+ o_succ);
                System.out.println(res.getFirstHeader("X-Authorized"));
                cookieStore = loginHttpClientContext.getCookieStore();
                x_auth =res.getFirstHeader("X-Authorized").getValue();
                return o_succ;
            }

        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }
    public static String readInputStreamIntoString(InputStream is, String charset) throws IOException {
        return new String(readInputStream(is), charset);
    }
    public static byte[] readInputStream(InputStream is) throws IOException {
        byte[] buffer = new byte[1024];
        int len = 0;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        while ((len = is.read(buffer)) > 0)
            bos.write(buffer, 0 , len);
        bos.close();
        return bos.toByteArray();
    }
}

