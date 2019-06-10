package tracker.requirements;

import org.kie.api.KieBase;

public class Main
{
    public static void main(String[] args)
    {
        Collector c = new Collector();
        c.connect();

        Transaction t = new Transaction();
        t.setScore(90);

        Filter f = new Filter();
        KieBase kb = f.loadRules();

        System.out.println("credit is approved "+ f.executeDroolsRules(kb,t).getApproved());

    }
}

