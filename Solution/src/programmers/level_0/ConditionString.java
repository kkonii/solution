package programmers.level_0;

public class ConditionString {
	public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        
        if(ineq.equals(">")&&eq.equals("=")){
            if (n >= m) answer = 1;
        }
        if(ineq.equals("<")&&eq.equals("=")){
            if (n <= m) answer = 1;
        }
        if(ineq.equals(">")&&eq.equals("!")){
            if (n > m) answer = 1;
        }
        if(ineq.equals("<")&&eq.equals("!")){
            if (n < m) answer = 1;
        }
        
        return answer;
    }
}
