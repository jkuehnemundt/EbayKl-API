/**
 * @author Jannik Kühnemundt
 */
package de.jkueh.ebaykl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;

/**
 * Class represents a Price
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Price {

    private float amount;
    private String priceType;
    private String currency;

    @JsonProperty("amount")
    private void unpackAmount(HashMap<String,String> amount) {
        this.amount = Float.parseFloat(amount.get("value"));
    }

    @JsonProperty("price-type")
    private void unpackPriceType(HashMap<String,String> priceType) {
        this.priceType = priceType.get("value");
    }

    @JsonProperty("currency-iso-code")
    private void unpackCurrency(HashMap<String,Object> currency) {
        HashMap<String,String> temp = (HashMap<String,String>) currency.get("value");
        this.currency = temp.get("value");
    }

    /**
     * Gets the amount
     * @return amount
     */
    public float getAmount() {
        return amount;
    }

    /**
     * Get the price
     * @return price
     */
    public String getPriceType() {
        return priceType;
    }

    /**
     * Get the currency
     * @return currency
     */
    public String getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        return "Amount: " + getAmount() + " " + getCurrency() + " " + getPriceType();
    }
}
