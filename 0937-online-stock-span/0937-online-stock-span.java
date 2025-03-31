class StockSpanner {
    private Stack<Pair> stack;
    private static class Pair {
        int price;
        int span;

        public Pair(int price, int span) {
            this.price = price;
            this.span = span;
        }
    }
    public StockSpanner() {
        stack = new Stack<>();
    }
    
    public int next(int price) {
        int span = 1;

        while (!stack.isEmpty() && stack.peek().price <= price) {
            span += stack.pop().span;
        }

        stack.push(new Pair(price, span));
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */