package org.springframework.social.dailymotion.api.impl;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.social.dailymotion.api.PlaylistOperations;
import org.springframework.web.client.RestTemplate;

/**
 * User: soldier
 * Date: 19.02.12
 * Time: 22:21
 */
class PlaylistTemplate extends AbstractDailymotionTemplate implements PlaylistOperations {
    PlaylistTemplate(RestTemplate restTemplate, ObjectMapper objectMapper) {
        super(restTemplate, objectMapper);
    }
}
