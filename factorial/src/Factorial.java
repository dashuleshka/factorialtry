public class Factorial {
    private Integer answer;
    private int n;

    public Factorial(int n) {
        this.n = n;
        this.answer = 1;
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                answer *= i;
            }
        } else if (n < 0) {
            answer = 0;
        }
    }
    @Override
    public String toString() {
        return answer.toString();
    }
    
    public int getAnswer() {
        return answer;
    }
}