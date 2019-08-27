package job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;
import service.SimJobService;

/**
 * Created by lizhen on 2018/9/25.
 */
public class SimJob extends QuartzJobBean {


    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        SimJobService anotherJob = (SimJobService) jobExecutionContext.getMergedJobDataMap().get("simJobService");
        System.out.println("SimJob begin to work");
        anotherJob.main(null);
        System.out.println("SimJob end to work");
    }
}
