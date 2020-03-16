package countString;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class CountString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter several strings:");
		Scanner input = new Scanner(System.in);
		String []s = input.nextLine().split(" ");
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		for (int i = 0;i < s.length;i++) {
			if (map.get(s[i]) == null) {
				map.put(s[i], 1);
			}
			else {
				map.put(s[i], map.get(s[i])+1);
			}
		}
		HashSet<String> set = new HashSet<String>();
		for (int i = 0;i < s.length;i++) {
			set.add(s[i]);
		}
		for (String str:set) {
			System.out.println(str+" = "+map.get(str));
		}
		input.close();
	}

}
