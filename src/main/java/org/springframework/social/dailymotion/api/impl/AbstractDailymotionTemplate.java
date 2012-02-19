package org.springframework.social.dailymotion.api.impl;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.web.client.RestTemplate;

/**
 * User: soldier
 * Date: 19.02.12
 * Time: 22:23
 */
class AbstractDailymotionTemplate {
    protected final RestTemplate restTemplate;
    protected final ObjectMapper objectMapper;

    protected AbstractDailymotionTemplate(RestTemplate restTemplate, ObjectMapper objectMapper) {
        this.restTemplate = restTemplate;
        this.objectMapper = objectMapper;
    }
}
