class Day13 {
    //Qno.66 Plus One
    //Solution
    public int[] plusOne(int[] digits) {
        int [] ans = new int[digits.length];
        int carrySum=1;
        for(int i=digits.length-1;i>-1;i--) {
            carrySum+=digits[i];
            if(carrySum>9) {
                ans[i] = carrySum%10;
                carrySum/=10;
            } else {
                ans[i] = carrySum;
                carrySum/=10;
            }
        }
        if(carrySum>0) {
            int [] ans2 = new int[ans.length+1];
            for(int i=0;i<ans.length;i++) {
                ans2[i+1] = ans[i];
            }
            ans2[0]=carrySum;
            return ans2;
        }
        return ans;
    }
}