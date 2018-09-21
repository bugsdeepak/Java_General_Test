package programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * John works at a clothing store. He has a large pile of socks that he must pair them by color for sale.
You will be given an array of integers representing the color of each sock. Determine how many pairs of socks with matching colors there are.
John works at a clothing store and he's going through a pile of socks to find the number of matching pairs. More specifically, he has a pile of  loose socks where each sock  is labeled with an integer, , denoting its color. He wants to sell as many socks as possible, but his customers will only buy them in matching pairs. Two socks,  and , are a single matching pair if they have the same color ().

Given  and the color of each sock, how many pairs of socks can John sell?
Input Format

The first line contains an integer , the number of socks. 
The second line contains  space-separated integers describing the colors  of the socks in the pile.

Sample Input

9
10 20 20 10 10 30 50 10 20
Sample Output

3
 * @author antbened
 *
 */
public class PairingSocks {
	
	static int sockMerchant(int n, int[] ar) {
		int count = 0;
		//List to store the socks temporarily, till you find a pair
		List<Integer> elements = new ArrayList<Integer>(n);
		for (int i=0; i<ar.length; i++) {
			//A pair is found. Increment the count and remove the same
			if (elements.contains(ar[i])) {
				count++;
				elements.remove(new Integer(ar[i]));
			//New Sock color add them to the list	
			} else {
				elements.add(new Integer(ar[i]));
			}
		}
		return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }

}
