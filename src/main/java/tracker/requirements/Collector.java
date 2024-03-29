package tracker.requirements;

import onespot.pivotal.api.PivotalTracker;
import onespot.pivotal.api.resources.Story;

import java.util.List;

/**
 * collects requirements from pivotal
 */
public class Collector {

    private int PROJECT_ID = 2352861;
    private String PIVOTAL_API_TOKEN = "e5961bd616a2a81f6bdefa2cb71558b7";
    public List<Story> collectRequirements()
    {
        PivotalTracker pivotalTracker = new PivotalTracker(PIVOTAL_API_TOKEN);

        List<Story> stories = pivotalTracker.projects().id(PROJECT_ID)
                .stories()
                .getAll();
        return stories;
    }
}
