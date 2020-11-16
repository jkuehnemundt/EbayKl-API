/**
 * @author Jannik Kühnemundt
 */
package de.jkueh.ebaykl;

import java.io.IOException;

/**
 * Class represents an application example
 */
public class Main {

    public static void main(String[] args) throws IOException {
        EbayKl ebayKl = new EbayKl("android","TaR60pEttY" );
        Ad ad = ebayKl.getAd(984428077);
        System.out.println(ad.toString());

    }

}
