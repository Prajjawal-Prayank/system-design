package browserhistory;

import java.util.Stack;

public class BrowserHistory {

    private Stack<String> history, forwardHistory;
    
    public BrowserHistory(String homepage) {
        // initialize the stacks
        this.history = new Stack<>();
        this.forwardHistory = new Stack<>();

        // visit the home page
        visit(homepage);
    }

    /**
     * - visits the current url
     * - clears forward history
     * @param url
     */
    public void visit(String url) {
        this.history.push(url);
        this.forwardHistory.clear();
    }

    /**
     * 
     * @return the last visited page
     */
    public String back() {
        // no previous is present
        if(this.forwardHistory.size()==1) {
            return this.getCurrentPage();
        }

        String url = this.history.pop();
        this.forwardHistory.push(url);
        return this.getCurrentPage();
    }

    /**
     * 
     * @return goes back to the page from where we came
     */
    public String forward() {
        // no forward is present
        if(this.forwardHistory.empty()) {
            return this.getCurrentPage();
        }

        String url = this.forwardHistory.pop();
        this.history.push(url);
        return url;
    }

    /**
     * 
     * @return the current page
     */
    public String getCurrentPage() {
        return this.history.peek();
    }

}
