package org.nm.dsalgo.problems.others.easy;

public class DefangedIPAddress
{
    // Best is to use Char Array Rather than splitting.
    public String defangIPaddr (String address)
    {
        if (address != null && address.length() > 0) {
            if (address.indexOf(".") > -1) {
                String[] addSplit = address.split("\\.");
                if (addSplit.length == 4) {
                    StringBuilder defangedIP = new StringBuilder("");
                    for (int i = 0; i < addSplit.length; i++) {
                        String splitPart = addSplit[i];
                        defangedIP.append(splitPart);
                        if (i < addSplit.length - 1) {
                            defangedIP.append("[.]");
                        }
                    }
                    return defangedIP.toString();
                }
            }
        }
        return address;
    }
}
