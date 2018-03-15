import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpfsFirewall {
    private transient InetAddress ip;
    private transient String hostName;
    private transient String plainIP;

    // ip is moved to the default constrcutor, as I have no fucking idea what format Inetaddress is running.
    protected IpfsFirewall(String hostName, String plainIP) {
        this.hostName = hostName;
        this.plainIP = plainIP;
    }

    protected String getPlainIP() {
        try {
            ip = InetAddress.getLocalHost();
            plainIP = String.valueOf(ip);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        return plainIP;
    }

    protected void getHostname() {
        hostName = ip.getHostName();
        System.out.println("Your current Hostname : " + hostName);
    }
}
