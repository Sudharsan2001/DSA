/*
There are several cards arranged in a row, and each card has an associated number of points. The points are given in the integer array cardPoints.

In one step, you can take one card from the beginning or from the end of the row. You have to take exactly k cards.

Your score is the sum of the points of the cards you have taken.

Given the integer array cardPoints and the integer k, return the maximum score you can obtain.

 

Example 1:

Input: cardPoints = [1,2,3,4,5,6,1], k = 3
Output: 12
Explanation: After the first step, your score will always be 1. However, choosing the rightmost card first will maximize your total score. The optimal strategy is to take the three cards on the right, giving a final score of 1 + 6 + 5 = 12.
Example 2:

Input: cardPoints = [2,2,2], k = 2
Output: 4
Explanation: Regardless of which two cards you take, your score will always be 4.
*/


class max_points_can_obtain_from_cards {
	
	public static void main(String[] args){
	int[] cardPoints = new int[] {1,2,3,4,5,6,1};
	int k =3;
	System.out.println("maximum score "+ maxScore(cardPoints,k  ));
	}
	
    public static int maxScore(int[] cardPoints, int k) {
        int lsum = 0, rsum = 0, maxsum = 0;
        int n = cardPoints.length;
        for (int i = 0; i < k; i++) {
            lsum = lsum + cardPoints[i];
            maxsum = lsum;
        }
        int rindex = n - 1;
        for (int i = k - 1; i >= 0; i--) {
            lsum = lsum - cardPoints[i];
            rsum = rsum + cardPoints[rindex];
            maxsum = Math.max(maxsum, lsum + rsum);
            rindex--;
        }
        return maxsum;
    }
}