package com.baba.string;

import java.util.Arrays;

public class ParseFiscal {

    public static void main(String[] args) {
        String s = getFiscalByType(ChequeSearchType.URL, "https://monitoring.e-kassa.gov.az/#/index?doc=81MNVYeck969D");

        System.out.println(s);
    }

    private static String getFiscalByType(ChequeSearchType searchType, String value) {
        return searchType == ChequeSearchType.ID ? value : getFiscalIdFromChequeUrl(value);
    }

    private static String getFiscalIdFromChequeUrl(String chequeUrl) {
        String[] urlParts = chequeUrl.split("doc=");

        System.out.println(Arrays.toString(urlParts));

        if (urlParts.length < 2) return null;

        String longFiscal = urlParts[1];
        System.out.println(longFiscal);

        return longFiscal.substring(0, 12);
    }
}
