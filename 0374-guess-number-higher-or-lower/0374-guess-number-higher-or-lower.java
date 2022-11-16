/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int l = 0, r = n;
        while (l <= r) {
            int m = l + (r - l) / 2;
 
            // Check if x is present at mid
            int g=guess(m);
            if (g == 0)
                return m;
 
            // If x greater, ignore left half
            if (g ==1)
                l = m + 1;
 
            // If x is smaller, ignore right half
            else
                r = m - 1;
        }
 
        // if we reach here, then element was
        // not present
        return -1;
        
        
    }
}