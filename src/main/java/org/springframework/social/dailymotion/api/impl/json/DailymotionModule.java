package org.springframework.social.dailymotion.api.impl.json;

import org.codehaus.jackson.Version;
import org.codehaus.jackson.map.module.SimpleModule;

/**
 * User: soldier
 * Date: 19.02.12
 * Time: 22:33
 */
public class DailymotionModule extends SimpleModule {

    public DailymotionModule() {
        super("Dailymotion", new Version(1, 0, 0, ""));
    }
}
