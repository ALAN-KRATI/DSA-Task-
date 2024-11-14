class BrowserHistory {
    Stack<String> bSt = new Stack<>();
    Stack<String> fSt = new Stack<>();

    public BrowserHistory(String homepage) {
        bSt.push(homepage);
    }
    
    public void visit(String url) {
        while(!fSt.isEmpty()) fSt.pop();
        bSt.push(url);
    }
    
    public String back(int steps) {
        while(bSt.size() > 1 && steps-- > 0){
            fSt.push(bSt.peek());
            bSt.pop();
        }

        return bSt.peek();
    }
    
    public String forward(int steps) {
        while(!fSt.isEmpty() && steps-- > 0){
            bSt.push(fSt.peek());
            fSt.pop();
        }
        return bSt.peek();
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */