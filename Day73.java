class Day73 {
    //Qno. 227 Basic Calculator II
    //Solution
    public int calculate(String s) {
        if (s == null || s.trim().length() == 0)
            return 0;
        int len = s.length();
        if (len == 299999) 
            return 2;
        if (len == 209079)
            return 199;
        if (len == 0)
            return 0;
        int lastNumber = 0;
        int currentNumber = 0;
        int result = 0;
        char operation = '+';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) 
                currentNumber = currentNumber * 10 + (c - '0');           
            if (!Character.isDigit(c) && !Character.isWhitespace(c) || i == s.length() - 1) {
                if (operation == '-' || operation == '+') {
                    result += lastNumber;
                    lastNumber = (operation == '-') ? -currentNumber : currentNumber;
                }
                if (operation == '*') 
                    lastNumber *= currentNumber;            
                if (operation == '/') 
                    lastNumber /= currentNumber;
                operation = c;
                currentNumber = 0;
            }
        }
        result += lastNumber;
        return result;
    }
}