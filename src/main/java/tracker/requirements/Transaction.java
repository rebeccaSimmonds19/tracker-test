package tracker.requirements;

public class Transaction {
    private int score;
    private boolean approve;
    private String ruleName;

    public Transaction()
    {

    }

    public String getRuleName() {
        return ruleName;
    }
    public void setRuleName(String ruleName)
    {
        this.ruleName = ruleName;
    }
    public void setScore(int score)
    {
        this.score = score;
    }

    public int getScore()
    {
        return score;
    }

    public boolean getApproved() {
        return approve;
    }

    public void setApproved(boolean approve)
    {
        this.approve = approve;
    }
}
