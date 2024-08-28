import java.util.*;
public class ProxyInternet implements Internet {
     Internet internet = new RealInternet();
    private static List<String> bannedSites;

    static {
        bannedSites = new ArrayList<String>();
        bannedSites.add("abc.com");
        bannedSites.add("def.com");
        bannedSites.add("ijk.com");
        bannedSites.add("lnm.com");
    }
    
    @Override
    public void connectTo(String serverHost , User user) throws Exception {
        if(user.hasInternetAccess){
        if(bannedSites.contains(serverHost.toLowerCase())) {
            throw new Exception("Access Denied");
        }

        internet.connectTo(serverHost , user);
    }else{
        throw new Exception("No Internet Access");
    }

    
}
}

