package object;

import java.util.Arrays;
import java.util.Comparator;

public class comparatortest {
	public static void main(String[] args) {
		lengcomparator mylc = new lengcomparator();
		String[] str  = {"123456","1234567890","12345"};
		Arrays.sort(str, mylc);
		for(String e:str) System.out.println(e);
	}
}

class lengcomparator implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o1.length()-o2.length();
	}
}
