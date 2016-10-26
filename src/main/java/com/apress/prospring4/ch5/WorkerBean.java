package com.apress.prospring4.ch5;

/**
 * Created by alex on 17.10.2016.
 */
public class WorkerBean {
    public void doSomeWork(int noOfTimes){
        for(int i = 0; i < noOfTimes; i++)
            work();
    }
    private void work(){
        System.out.print("");
    }
}
