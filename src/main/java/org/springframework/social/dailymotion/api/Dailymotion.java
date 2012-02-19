/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springframework.social.dailymotion.api;

/**
 * @author soldier
 */
public interface Dailymotion {

    ChannelOperations channelOperations();

    CommentOperations commentOperations();

    GroupOperations groupOperations();

    PlaylistOperations playlistOperations();

    UserOperations userOperations();

    VideoOperations videoOperations();
}
