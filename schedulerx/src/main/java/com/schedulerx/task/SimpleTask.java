package com.schedulerx.task;

import com.alibaba.edas.schedulerx.ProcessResult;
import com.alibaba.edas.schedulerx.ScxSimpleJobContext;
import com.alibaba.edas.schedulerx.ScxSimpleJobProcessor;

public class SimpleTask implements ScxSimpleJobProcessor {
    @Override
    public ProcessResult process(ScxSimpleJobContext scxSimpleJobContext) {
        System.out.println("-----------Hello world---------------");
        ProcessResult processResult = new ProcessResult(true);
        return processResult;
    }
}
