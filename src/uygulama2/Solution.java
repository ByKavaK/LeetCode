package uygulama2;

public class Solution {
	public boolean isPalindrome(int x) {
		
		int sayi = 0;
		
		if(x < 0 || x != 0 && x%10 == 0) {
			return false;
		}
		
		if(-Math.pow(2, 31)<= x && x <= Math.pow(2, 31)-1) {
			while(x > sayi) {
				
				sayi = sayi * 10 + x%10;
				x /= 10;
			}
		}
		return (x == sayi || x == sayi/10);
    }
}
