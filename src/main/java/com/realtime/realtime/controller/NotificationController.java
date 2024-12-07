package com.realtime.realtime.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class NotificationController {

    @MessageMapping("/sendMessage")
    @SendTo("/topic/notifications")
    public String sendMessage(String message)
    {
        System.out.print("Message : " +message);
        return message;
    }
    @MessageMapping("/sendScore")
    @SendTo("/topic/scores")
    public String sendScore(String score)
    {
        System.out.print("Score : " +score);
        return score;
    }
}
