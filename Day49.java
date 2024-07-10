class Day49 {
    //Qno. 1491 Average Salary Excluding the Minimum and Maximum Salary
    //Solution
    public double average(int[] salary) {
        double total_salary =0;
        double count =salary.length-2;
        double max_salary = 0;
        double min_salary = Double.MAX_VALUE;
        for(int i=0;i<salary.length;i++) {
            if(salary[i]>max_salary) {
                max_salary = salary[i];
            }
            if(salary[i]<min_salary) {
                min_salary = salary[i];
            }
        }
        for(int i=0;i<salary.length;i++) {
            if(salary[i]==max_salary || salary[i]==min_salary) {
                continue;
            }
            total_salary += salary[i];
        }
        return (total_salary)/count;
    }
}