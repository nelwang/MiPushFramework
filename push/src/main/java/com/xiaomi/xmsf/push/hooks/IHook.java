package com.xiaomi.xmsf.push.hooks;

import de.robv.android.xposed.XC_MethodHook;

import java.util.List;

/**
 * Created by zts1993 on 2018/4/16.
 */

public interface IHook {
    List<XC_MethodHook.Unhook> fetchHook() throws Exception;
}
