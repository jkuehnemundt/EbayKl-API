/**
 * @author Jannik Kühnemundt
 */
package de.jkueh.ebaykl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;

/**
 * Class represents a Category
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Category {

    private String idName;
    private String localizedName;
    @JsonProperty("id")
    private int id;
    private int parentId;

    @JsonProperty("id-name")
    private void unpackIdName(HashMap<String,String> idName) {
        this.idName = idName.get("value");
    }

    @JsonProperty("localized-name")
    private void unpacklocalizedName(HashMap<String,String> localizedName) {
        this.localizedName = localizedName.get("value");
    }

    @JsonProperty("parent-id")
    private void unpackparentId(HashMap<String,String> parentId) {
        this.parentId = Integer.parseInt(parentId.get("value"));
    }
}
