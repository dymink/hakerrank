

	import java.io.*;
	import java.util.*;

	public class Solution {

	    public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			
			int tc = scan.nextInt();
			for(int i = 0; i < tc; i++) {
				int dollars = scan.nextInt();
				int flavors = scan.nextInt();
				
				int[] flavorsArr = new int[flavors];
				for(int j =0; j < flavors; j++) {
					flavorsArr[j] = scan.nextInt();
				}
				
				int val1 = 0;
				int val2 = 0;
				
				for(int z =0; z < flavors; z++) {
					int temp = flavorsArr[z];
					for(int x = z+1; x < flavors; x++) {
						if(temp + flavorsArr[x] == dollars) {
							if(z > x) {
								val1 = x + 1;
								val2 = z + 1;
							}else {
								val1 = z + 1;
								val2 = x + 1;
							}
						}
					}
				}
				
				System.out.println(val1 + " " + val2);
			}
			scan.close();
		}
	}

