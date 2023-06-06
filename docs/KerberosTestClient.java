import org.ietf.jgss.*;

public class KerberosTestClient {
    public static void main(String[] args) {
        try {
            // Specify the service principal name (SPN) and Kerberos ticket cache path
            String servicePrincipal = "trino/my-trino-coordinator.example.com@EXAMPLE.COM";
            String ticketCachePath = "/path/to/krb5cc_trino";

            // Create a GSSManager
            GSSManager gssManager = GSSManager.getInstance();

            // Create a GSSName for the service principal
            GSSName serviceName = gssManager.createName(servicePrincipal, GSSName.NT_USER_NAME);

            // Create a GSSCredential from the ticket cache
            GSSCredential clientCredential = gssManager.createCredential(null, GSSCredential.INDEFINITE_LIFETIME,
                    new Oid("1.2.840.113554.1.2.2"), GSSCredential.INITIATE_ONLY);
            
            // Create a GSSContext for secure communication
            GSSContext context = gssManager.createContext(serviceName, new Oid("1.2.840.113554.1.2.2"), clientCredential,
                    GSSContext.DEFAULT_LIFETIME);

            // Set the ticket cache path in the GSSContext
            context.requestCredDeleg(true);
            context.setOption(new GSSCredentialOption(GSSCredentialOption.TICKET_CACHE, ticketCachePath));

            // Establish the secure connection
            byte[] token = new byte[0];
            while (!context.isEstablished()) {
                token = context.initSecContext(token, 0, token.length);
            }

            // Secure connection established, perform further operations
            System.out.println("Secure connection established!");

            // Cleanup resources
            context.dispose();
        } catch (GSSException e) {
            e.printStackTrace();
        }
    }
}
