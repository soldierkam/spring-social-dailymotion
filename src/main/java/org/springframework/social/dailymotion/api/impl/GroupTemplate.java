package org.springframework.social.dailymotion.api.impl;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.social.dailymotion.api.GroupOperations;
import org.springframework.web.client.RestTemplate;

/**
 * User: soldier
 * Date: 19.02.12
 * Time: 22:20
 */
class GroupTemplate extends AbstractDailymotionTemplate implements GroupOperations {
    GroupTemplate(RestTemplate restTemplate, ObjectMapper objectMapper) {
        super(restTemplate, objectMapper);
    }
}
