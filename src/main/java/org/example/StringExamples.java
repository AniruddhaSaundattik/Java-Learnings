package org.example;

public class StringExamples {

    public String reverseInputString(final String str) {

        if(str == null)
            return null;
        if(str.isBlank())
            return "";

        char[] chrArray = str.toCharArray();
        StringBuffer result = new StringBuffer();
        for(int i = (chrArray.length - 1); i >= 0 ; i--) {
            result.append(chrArray[i]);
        }
        return result.toString();
    }
}
