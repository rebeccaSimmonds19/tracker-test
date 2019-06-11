package tracker.requirements;

import onespot.pivotal.api.resources.Story;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * creates the report in report.txt
 */
public class Report
{

    public void createReport(List<Story> stories, List<String> rules)
    {
        for (String rule: rules) {
            for (Story story:stories) {
                if(story.getLabels().get(0).name.equals(rule)) {
                    BufferedWriter writer = null;
                    try {
                        File report = new File("report.txt");
                        System.out.println(report.exists());

                        writer = new BufferedWriter(new FileWriter(report));
                        writer.write("jira ticket = " + story.getUrl() + "  rule =" + rule);
                        writer.flush();
                        writer.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }


            }


        }
    }
}

