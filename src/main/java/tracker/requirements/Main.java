package tracker.requirements;

import onespot.pivotal.api.resources.Story;
import org.kie.api.KieBase;

import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        Collector c = new Collector();

        Transaction t = new Transaction();
        t.setScore(90);

        Filter f = new Filter();
        KieBase kb = f.loadRules();
        List<String> rules = f.executeDroolsRules(kb,t);

        List<Story> stories = c.collectRequirements();

        Report report = new Report();
        report.createReport(stories,rules);

    }
}

