package tracker.requirements;

import org.kie.api.KieBase;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.StatelessKieSession;
import org.kie.internal.runtime.StatelessKnowledgeSession;

import java.util.ArrayList;
import java.util.List;


public class Filter {

    public KieBase loadRules() {
        KieServices kieServices = KieServices.Factory.get();
        KieContainer kieContainer = kieServices.getKieClasspathContainer();
        return kieContainer.getKieBase();
    }

    public Transaction executeDroolsRules(KieBase base, Transaction t)
    {
        KieSession ksession = base.newKieSession();
        ksession.insert(t);
        int rulesFired = ksession.fireAllRules();
        System.out.println(rulesFired);
        return t;
    }
}
