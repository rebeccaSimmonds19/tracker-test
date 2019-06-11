package tracker.requirements;

import org.kie.api.KieBase;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import java.util.ArrayList;
import java.util.List;

public class Filter {

    public KieBase loadRules() {
        KieServices kieServices = KieServices.Factory.get();
        KieContainer kieContainer = kieServices.getKieClasspathContainer();
        return kieContainer.getKieBase();
    }

    public List<String> executeDroolsRules(KieBase base, Transaction t)
    {
        KieSession ksession = base.newKieSession();
        ksession.insert(t);
        ksession.fireAllRules();
        System.out.println(t.getRuleName());
        List<String> rulesList = new ArrayList<>();
        rulesList.add(t.getRuleName());
        return rulesList;
    }
}
