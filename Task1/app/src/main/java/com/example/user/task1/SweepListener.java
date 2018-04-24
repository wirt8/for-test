package com.example.user.task1;

/**
 * Created by User on 22/04/2018.
 */
import java.util.List;
import java.util.Set;

interface SweepListener {

        List<ProcessHolder> getRunningApps();

        void onSweepStart();

        void onSweepFinish(Set<String> packages);

}

