/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springframework.social.dailymotion.connect;

import org.springframework.social.dailymotion.api.Dailymotion;
import org.springframework.social.dailymotion.api.impl.DailymotionTemplate;
import org.springframework.social.oauth2.AbstractOAuth2ServiceProvider;

/**
 * @author soldier
 */
public class DailymotionServiceProvider extends AbstractOAuth2ServiceProvider<Dailymotion> {

    public DailymotionServiceProvider(String clientId, String clientSecret) {
        super(new DailymotionOAuth2Template(clientId, clientSecret));
    }

    @Override
    public Dailymotion getApi(String accessToken) {
        return new DailymotionTemplate(accessToken);
    }
}
