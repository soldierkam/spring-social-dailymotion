/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springframework.social.dailymotion.api.impl;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;
import org.springframework.social.dailymotion.api.*;
import org.springframework.social.dailymotion.api.impl.json.DailymotionModule;
import org.springframework.social.oauth2.AbstractOAuth2ApiBinding;

/**
 * @author soldier
 */
public class DailymotionTemplate extends AbstractOAuth2ApiBinding implements Dailymotion {

    private ChannelOperations channelOperations;
    private CommentOperations commentOperations;
    private GroupOperations groupOperations;
    private PlaylistOperations playlistOperations;
    private UserOperations userOperations;
    private VideoOperations videoOperations;
    private ObjectMapper objectMapper;

    public DailymotionTemplate(String accessToken) {
        super(accessToken);
        initApis();
    }

    public DailymotionTemplate() {
        super();
        initApis();
    }

    private void initApis() {
        channelOperations = new ChannelTemplate(getRestTemplate(), objectMapper);
        commentOperations = new CommentTemplate(getRestTemplate(), objectMapper);
        groupOperations = new GroupTemplate(getRestTemplate(), objectMapper);
        playlistOperations = new PlaylistTemplate(getRestTemplate(), objectMapper);
        userOperations = new UserTemplate(getRestTemplate(), objectMapper);
        videoOperations = new VideoTemplate(getRestTemplate(), objectMapper);
    }

    @Override
    protected MappingJacksonHttpMessageConverter getJsonMessageConverter() {
        MappingJacksonHttpMessageConverter converter = super.getJsonMessageConverter();
        objectMapper = new ObjectMapper();
        //objectMapper.enable(DeserializationConfig.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        //objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        objectMapper.registerModule(new DailymotionModule());
        converter.setObjectMapper(objectMapper);
        return converter;
    }

    @Override
    public ChannelOperations channelOperations() {
        return channelOperations;
    }

    @Override
    public CommentOperations commentOperations() {
        return commentOperations;
    }

    @Override
    public GroupOperations groupOperations() {
        return groupOperations;
    }

    @Override
    public PlaylistOperations playlistOperations() {
        return playlistOperations;
    }

    @Override
    public UserOperations userOperations() {
        return userOperations;
    }

    @Override
    public VideoOperations videoOperations() {
        return videoOperations;
    }
}
