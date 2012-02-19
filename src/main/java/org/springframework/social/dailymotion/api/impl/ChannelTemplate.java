package org.springframework.social.dailymotion.api.impl;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.social.dailymotion.api.ChannelOperations;
import org.springframework.web.client.RestTemplate;

/**
 * User: soldier
 * Date: 19.02.12
 * Time: 22:20
 */
class ChannelTemplate extends AbstractDailymotionTemplate implements ChannelOperations {
    ChannelTemplate(RestTemplate restTemplate, ObjectMapper objectMapper) {
        super(restTemplate, objectMapper);
    }
}
