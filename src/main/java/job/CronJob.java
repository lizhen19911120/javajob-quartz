package job;

import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * Created by lizhen on 2018/9/25.
 */
public class CronJob extends QuartzJobBean {

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        JobDataMap jobDataMap = jobExecutionContext.getMergedJobDataMap();
        System.out.println("myParam: "+jobDataMap.getInt("myParam"));
        System.out.println("myParam1: "+jobDataMap.getInt("myParam1"));
        System.out.println("CronJob is running");
    }
}
