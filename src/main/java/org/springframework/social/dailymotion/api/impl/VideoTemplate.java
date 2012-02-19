package org.springframework.social.dailymotion.api.impl;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.social.dailymotion.api.VideoOperations;
import org.springframework.web.client.RestTemplate;

/**
 * User: soldier
 * Date: 19.02.12
 * Time: 22:21
 */
class VideoTemplate extends AbstractDailymotionTemplate implements VideoOperations {
    VideoTemplate(RestTemplate restTemplate, ObjectMapper objectMapper) {
        super(restTemplate, objectMapper);
    }
}
