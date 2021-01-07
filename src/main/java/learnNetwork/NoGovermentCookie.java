package learnNetwork;

import java.net.*;
import java.util.Locale;
import java.net.HttpCookie;
public class NoGovermentCookie implements CookiePolicy {


    //public boolean shouldAccept(URI uri, HttpCookie cookie)

    public static void main(String [] args){
        CookieManager manager = new CookieManager();
        manager.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
        CookieHandler.setDefault(manager);
    }

    @Override
    public boolean shouldAccept(URI uri, HttpCookie cookie) {
        if (uri.getAuthority().toLowerCase(Locale.ROOT).endsWith(".gov")
        || cookie.getDomain().toLowerCase(Locale.ROOT).endsWith(".gov")){
            return false;
        }
        return false;
    }
}
