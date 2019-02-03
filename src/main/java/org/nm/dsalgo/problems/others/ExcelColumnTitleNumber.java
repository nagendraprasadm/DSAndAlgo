package org.nm.dsalgo.problems.others;

public class ExcelColumnTitleNumber {
	public static void main(String[] args) {
		ExcelColumnTitleNumber _instance = new ExcelColumnTitleNumber();
		System.out.println(_instance.convertToTitle(5));
		System.out.println(_instance.convertToTitle(1));
		System.out.println(_instance.convertToTitle(1404));
/*		System.out.println(_instance.titleToNumber("A"));
		System.out.println(_instance.titleToNumber("E"));
		System.out.println(_instance.titleToNumber("Z"));
		System.out.println(_instance.titleToNumber("AA"));
		System.out.println(_instance.titleToNumber("AE"));
		System.out.println(_instance.titleToNumber("AZ"));
		System.out.println(_instance.titleToNumber("BA"));
		System.out.println(_instance.titleToNumber("BE"));
		System.out.println(_instance.titleToNumber("BZ"));
		System.out.println(_instance.titleToNumber("AAA"));
		System.out.println(_instance.titleToNumber("AAB"));*/
		System.out.println(_instance.titleToNumber("BAZ"));

	}

	public String convertToTitle(int n) {
		char[] arr = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
				'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U',
				'V', 'W', 'X', 'Y', 'Z' };
		String res = "";
		if (n > 0) {
			while (n != 0) {
				char ch = arr[(n - 1) % 26];
				n = (n - 1) / 26;
				res = ch + res;
			}
		}
		return res;
	}
	
    public int titleToNumber(String s) {
    	/*int res = 0;
		if(s != null){
			int n = s.length();
			if(n > 1){
				for(int i = 1; i < n ; i++){
					res += Math.pow(26, i);
				}
			}
			char[] c = s.toCharArray();
			for(int i = 0 ; i < s.length() ; i++){
				char curC = c[i];
				int curI = (int)curC - 65;
				if(n > 1){
					res += Math.pow(26, n -1) * curI;
				}else{
					res += curI + 1;
				}
				n--;
			}
		}
		
		return res;*/
        char[] title = s.toCharArray();
        int number = 0;
        for(char c: title) {
            number = number * 26 + (c - 'A' + 1);
        }
        return number;
    }

}
