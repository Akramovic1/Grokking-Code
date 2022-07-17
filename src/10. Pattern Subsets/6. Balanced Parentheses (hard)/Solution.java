class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        Queue<Parenthesis> q = new LinkedList<>();
        q.add(new Parenthesis("",0,0));
        while(!q.isEmpty()){
            Parenthesis ps = q.poll();
            if(ps.leftCounter == n && ps.rightCounter == n)
                result.add(ps.str);
            else {
                if(ps.leftCounter < n)
                    q.add(new Parenthesis(ps.str + "(", ps.leftCounter + 1, ps.rightCounter));
                if(ps.leftCounter > ps.rightCounter)
                    q.add(new Parenthesis(ps.str + ")", ps.leftCounter, ps.rightCounter + 1));
            }
        }
        return result;
    }
    class Parenthesis{
        int leftCounter;
        int rightCounter;
        String str;
        public Parenthesis(String str, int leftCounter, int rightCounter){
            this.str = str;
            this.leftCounter = leftCounter;
            this.rightCounter = rightCounter;
        }
    }
}