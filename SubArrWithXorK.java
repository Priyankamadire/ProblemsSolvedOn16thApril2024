/*Subarray with given XOR
Programming
Hashing
Medium
53.8% Success

765

12

Bookmark
Asked In:
Problem Description
 
 

Given an array of integers A and an integer B.

Find the total number of subarrays having bitwise XOR of all elements equals to B.



Problem Constraints
1 <= length of the array <= 105

1 <= A[i], B <= 109



Input Format
The first argument given is the integer array A.

The second argument given is integer B.



Output Format
Return the total number of subarrays having bitwise XOR equals to B.



Example Input
Input 1:

 A = [4, 2, 2, 6, 4]
 B = 6
Input 2:

 A = [5, 6, 7, 8, 9]
 B = 5


Example Output
Output 1:

 4
Output 2:

 2


Example Explanation
Explanation 1:

 The subarrays having XOR of their elements as 6 are:
 [4, 2], [4, 2, 2, 6, 4], [2, 2, 6], [6]
Explanation 2:

 The subarrays having XOR of their elements as 5 are [5] and [5, 6, 7, 8, 9]
*/
public class SubArrWithXorK {
    public int solve(int[] A, int B) {
        int n = A.length;
        /*
        int cnt =0;
        for(int i=0;i<n;i++){
                int xor = 0;
            
            for(int j=i;j<n;j++){
                // for(int k=i;k<j;k++){
                    xor=xor^A[j];
                // }
            
                if(xor==B){
                    cnt++;
                }
            }
        }
        return cnt;*/
        HashMap<Integer,Integer> hm = new HashMap<>();
        int xor=0;
        int cnt=0;
        hm.put(xor,1);
        for(int i=0;i<n;i++){
            xor=xor^A[i];
            int x = xor^B;
            if(hm.containsKey(x)){
                cnt+=hm.get(x);
            }
            if(hm.containsKey(xor)){
                hm.put(xor,hm.get(xor)+1);
            }
            else{
                hm.put(xor,1);
            }
        }
        return cnt;
    }
}
