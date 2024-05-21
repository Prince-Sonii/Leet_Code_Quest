public class Day1 {
    //Qno.1672 - Richest Customer Wealth
    //solution
    static int maximumWealth(int[][] accounts) {
        int maxNum = 0;
        for (int[] i : accounts) {
            int addWealth = 0;
            for (int j : i) {
                addWealth = addWealth + j;

            }
            if (maxNum < addWealth) {
                maxNum = addWealth;
            }

        }
        return maxNum;
    }
}