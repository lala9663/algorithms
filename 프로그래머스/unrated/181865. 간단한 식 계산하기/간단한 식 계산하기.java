class Solution {
    public int solution(String binomial) {
        int answer = 0;

        String[] result = binomial.split(" ");

        int num1 = Integer.parseInt(result[0]);
        int num2 = Integer.parseInt(result[2]);
        String operator = result[1];

        switch (operator) {
            case "+":
                answer = num1 + num2;
                break;
            case "-":
                answer = num1 - num2;
                break;
            case "*":
                answer = num1 * num2;
                break;
            case "/":
                answer = num1 / num2;
                break;
        }

        return answer;
    }
}
