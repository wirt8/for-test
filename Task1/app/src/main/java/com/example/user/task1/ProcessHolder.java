package com.example.user.task1;

/**
 * Created by User on 22/04/2018.
 */
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;

public class ProcessHolder {

    public final int pid;
    public final String packageName;
    public final Drawable icon;
    public final CharSequence label;

    public ProcessHolder(final int pid, final PackageManager manager, final ResolveInfo info) {
        this.pid = pid;
        packageName = info.activityInfo.packageName;
        icon = info.loadIcon(manager);
        label = info.loadLabel(manager);
    }

}
