/**
 * @author Jannik Kühnemundt
 */
package de.jkueh.ebaykl;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;
import java.util.HashMap;

/**
 * Class represents an Ad
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Ad {

    private String title;
    private String description;
    @JsonProperty("price")
    private Price price;
    private String posterType;
    private String imprint;
    @JsonProperty("ad-address")
    private Address adAddress;
    private String adStatus;
    private String contactName;
    private String contactNameInitials;
    private BigInteger userId;
    private BigInteger storeId;
    private String sellerAccountType;
    private String adExternalReferenceId;
    private String phone;
    private XMLGregorianCalendar startDateTime;
    private XMLGregorianCalendar userSinceDatetime;
    @JsonProperty("category")
    private Category category;

    @JsonProperty("title")
    private void unpackTitle(HashMap<String,String> title) {
        this.title = title.get("value");
    }

    @JsonProperty("description")
    private void unpackDescription(HashMap<String,String> description) {
        this.description = description.get("value");
    }

    @JsonProperty("poster-type")
    private void unpackPosterType(HashMap<String,String> posterType) {
        this.posterType = posterType.get("value");
    }

    @JsonProperty("imprint")
    private void unpackImprint(HashMap<String,String> imprint) {
        this.imprint = imprint.get("value");
    }

    @JsonProperty("ad-status")
    private void unpackadStatus(HashMap<String,String> adStatus) {
        this.adStatus = adStatus.get("value");
    }

    @JsonProperty("contact-name")
    private void unpackContactName(HashMap<String,String> contactName) {
        this.contactName = contactName.get("value");
    }

    @JsonProperty("contact-name-initials")
    private void unpackContactNameInitials(HashMap<String,String> contactNameInitials) {
        this.contactNameInitials = contactNameInitials.get("value");
    }

    @JsonProperty("user-id")
    private void unpackUserId(HashMap<String,String> userId) {
        this.userId = new BigInteger(userId.get("value"));
    }

    @JsonProperty("store-id")
    private void unpackStoreId(HashMap<String,String> storeId) {
        if (storeId.get("value") != null) {
            this.storeId = new BigInteger(storeId.get("value"));
        }

    }

    @JsonProperty("seller-account-type")
    private void unpackSellerAccountType(HashMap<String,String> sellerAccountType) {
        this.sellerAccountType = sellerAccountType.get("value");
    }

    @JsonProperty("ad-external-reference-id")
    private void unpackAdExternalReferenceId(HashMap<String,String> adExternalReferenceId) {
        this.adExternalReferenceId = adExternalReferenceId.get("value");
    }

    @JsonProperty("phone")
    private void unpackPhone(HashMap<String,String> phone) {
        this.phone = phone.get("value");
    }

    /*
    @TODO later
    @JsonProperty("start-date-time")
    private void unpackStartDateTime(HashMap<String,String> startDateTime) throws DatatypeConfigurationException {
        this.startDateTime = DatatypeFactory.newInstance().newXMLGregorianCalendar(startDateTime.get("value"));
    }

    @JsonProperty("user-since-date-time")
    private void unpackUserSinceDateTime(HashMap<String,String> userSinceDatetime) throws DatatypeConfigurationException {
        this.userSinceDatetime = DatatypeFactory.newInstance().newXMLGregorianCalendar(userSinceDatetime.get("value"));
    }
    */

    /**
     * Gets the title
     * @return title
     */
    public String getTitle() {
        return title + " ";
    }

    /**
     * Gets the description
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Gets the price
     * @return price
     */
    public Price getPrice() {
        return price;
    }

    /**
     * Gets the posterTyp
     * @return posterType
     */
    public String getPosterType() {
        return posterType;
    }

    /**
     * Gets the imprint
     * @return imprint
     */
    public String getImprint() {
        return imprint;
    }

    /**
     * Gets the address
     * @return address
     */
    public Address getAdAddress() {
        return adAddress;
    }

    /**
     * Gets the adStatus
     * @return adStatus
     */
    public String getAdStatus() {
        return adStatus;
    }

    /**
     * Gets the contactName
     * @return contactName
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * Gets the contactNameInitials
     * @return contactNameInitials
     */
    public String getContactNameInitials() {
        return contactNameInitials;
    }

    /**
     * Gets the userId
     * @return userId
     */
    public BigInteger getUserId() {
        return userId;
    }

    /**
     * Gets the storeId
     * @return
     */
    public BigInteger getStoreId() {
        return storeId;
    }

    /**
     * Gets the sellerAccountType
     * @return sellerAccountType
     */
    public String getSellerAccountType() {
        return sellerAccountType;
    }

    /**
     * Gets the adExternalReferenceId
     * @return adExternalReferenceId
     */
    public String getAdExternalReferenceId() {
        return adExternalReferenceId;
    }

    /**
     * Gets the phone number
     * @return phone number
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Gets the startDateTime
     * @return startDateTime
     */
    public XMLGregorianCalendar getStartDateTime() {
        return startDateTime;
    }

    /**
     * Gets the userSinceDatetime
     * @return userSinceDatetime
     */
    public XMLGregorianCalendar getUserSinceDatetime() {
        return userSinceDatetime;
    }

    /**
     * Get the category
     * @return category
     */
    public Category getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return getTitle() + " " + getAdExternalReferenceId() + " " + getAdStatus() + " " + getContactName() + " " + getContactNameInitials() + " " + getImprint() + " " + getDescription()
                + " " + getPhone() + " " + getPosterType() + " " + getSellerAccountType() + " " + getAdAddress() + " " + getCategory() + " " + getPrice() + " " + getStartDateTime() + " " + getStoreId() + " "
                + getUserId() + " " + getUserSinceDatetime();
    }
}
