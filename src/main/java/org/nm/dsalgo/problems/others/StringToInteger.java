package org.nm.dsalgo.problems.others;

public class StringToInteger {

	public static void main(String[] args) {
		StringToInteger _instance = new StringToInteger();
		System.out.println(_instance.myAtoi("+1"));

	}
	
    public int myAtoi(String str) {
        if(str == null || str.length() == 0){
            return 0;
        }
        str = str.trim();
        String sign = "+";
        int i = 0;
        if(str.charAt(i) == '-'){
            sign="-";
            i++;
        }else if (str.charAt(i) == '+') {
			i++;
		}
        double result = 0;
        while(i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9'){
            result = (result * 10) + str.charAt(i) - '0';
            i++;
        }
        if(sign.equals("-")){
            result = -1 * result;
        }
        if(result > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        if(result < Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        return (int)result;
    }

}
