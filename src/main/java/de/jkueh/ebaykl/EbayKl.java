package de.jkueh.ebaykl;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import java.io.IOException;

/**
 * Java implementation of the ebay kleinanzeigen API
 */
public class EbayKl {

    public static final String ROOTNODE = "{http://www.ebayclassifiedsgroup.com/schema/ad/v1}ad";
    private final String url = "https://api.ebay-kleinanzeigen.de/api/";
    private Client client = ClientBuilder.newClient();
    private HttpAuthenticationFeature feature;

    public EbayKl(String userID, String password) {
        this.feature = HttpAuthenticationFeature.basic(userID,password);
    }

    /**
     * Gets an Ad
     * @param id Id of the ad
     * @return Ad
     * @throws IOException
     */
    public Ad getAd(int id) throws IOException {

        ObjectMapper m = new ObjectMapper();
        JsonNode adNode = m.readTree(client
                .target(url + "ads/")
                .path(String.valueOf(id)+".json")
                .register(feature)
                .request(MediaType.APPLICATION_JSON)
                .get(String.class));

        return m.treeToValue(adNode.get(ROOTNODE).get("value"),Ad.class);

    }

}
