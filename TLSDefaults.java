/*
 Print Default TLS Protocols Supported and Enabled by JVM
javac TLSDefaults.java
java TLSDefaults

Sample Output
Default SSLContext Protocol: TLS
Enabled Protocols:
  TLSv1.3
  TLSv1.2
Supported Protocols:
  TLSv1
  TLSv1.1
  TLSv1.2
  TLSv1.3

TLS-related System Properties:
  jdk.tls.client.protocols = null
  https.protocols = null
  javax.net.ssl.trustStore = null
  javax.net.ssl.keyStore = null

*/
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.SSLSocket;

public class TLSDefaults {
    public static void main(String[] args) throws Exception {
        // Default SSL context
        SSLContext context = SSLContext.getDefault();
        System.out.println("Default SSLContext Protocol: " + context.getProtocol());

        SSLSocketFactory factory = context.getSocketFactory();
        SSLSocket socket = (SSLSocket) factory.createSocket();
        
        // Enabled by default
        System.out.println("Enabled Protocols: ");
        for (String proto : socket.getEnabledProtocols()) {
            System.out.println("  " + proto);
        }

        // Supported protocols by this JVM
        System.out.println("Supported Protocols: ");
        for (String proto : socket.getSupportedProtocols()) {
            System.out.println("  " + proto);
        }

        // TLS-related system properties
        String[] props = {
            "jdk.tls.client.protocols",
            "https.protocols",
            "javax.net.ssl.trustStore",
            "javax.net.ssl.keyStore"
        };
        System.out.println("\nTLS-related System Properties:");
        for (String prop : props) {
            System.out.printf("  %s = %s%n", prop, System.getProperty(prop));
        }
    }
}
