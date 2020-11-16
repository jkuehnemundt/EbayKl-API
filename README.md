EbayKi-API
======
Java implementation of the eBay Kleinanzeigen API

Usage
-----


```java
        EbayKl ebayKl = new EbayKl("userid","password");
        Ad ad = ebayKl.getAd(984428077);
        System.out.println(ad.getTitle());
```