/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springframework.social.dailymotion.connect;

import org.springframework.http.MediaType;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.social.oauth2.AccessGrant;
import org.springframework.social.oauth2.OAuth2Template;
import org.springframework.social.support.ClientHttpRequestFactorySelector;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

/**
 * @author soldier
 */
public class DailymotionOAuth2Template extends OAuth2Template {

    public DailymotionOAuth2Template(String clientId, String clientSecret) {
        super(clientId, clientSecret,
                "https://api.dailymotion.com/oauth/authorize",
                "https://api.dailymotion.com/oauth/token");
    }

    @Override
    protected RestTemplate createRestTemplate() {
        RestTemplate restTemplate = new RestTemplate(ClientHttpRequestFactorySelector.getRequestFactory());
        FormHttpMessageConverter messageConverter = new FormHttpMessageConverter() {

            @Override
            public boolean canRead(Class<?> clazz, MediaType mediaType) {
                // always read as x-www-url-formencoded even though Facebook sets contentType to text/plain				
                return true;
            }
        };
        restTemplate.setMessageConverters(Collections.<HttpMessageConverter<?>>singletonList(messageConverter));
        return restTemplate;
    }

    @Override
    protected AccessGrant postForAccessGrant(String accessTokenUrl, MultiValueMap<String, String> parameters) {
        MultiValueMap<String, String> response = getRestTemplate().postForObject(accessTokenUrl, parameters, MultiValueMap.class);
        String expires = response.getFirst("expires");
        return new AccessGrant(response.getFirst("access_token"), null, null, expires != null ? Integer.valueOf(expires) : null);
    }
}
