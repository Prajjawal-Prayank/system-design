package browserhistory;

import java.util.Stack;

public class BrowserHistory {

    // history stores all the URLs till curent URL
    // forwardHistory stores all the URLs we have 
    //  come back from
    private final Stack<String> history, forwardHistory;
    
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
     * if history is present and it is not homepage
     *      then update forwardHistory
     * @return the last visited page
     */
    public String back() {
        if(this.history.size()>1) {
            String url = this.history.pop();
            this.forwardHistory.push(url);
        }
        
        return this.getCurrentPage();
    }

    /**
     * if forward is present,
     *      retrieve the forward page
     *      update history stack
     *      * this updates current page
     * else
     *      use current page directly
     * @return goes back to the page from where we came
     */
    public String forward() {
        if(!this.forwardHistory.empty()) {
            String url = this.forwardHistory.pop();
            this.history.push(url);
        }

        return this.getCurrentPage();
    }

    /**
     * 
     * @return the current page
     */
    public String getCurrentPage() {
        return this.history.peek();
    }

}
