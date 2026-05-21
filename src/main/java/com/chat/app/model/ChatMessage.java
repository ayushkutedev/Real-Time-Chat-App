package com.chat.app.model;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
public class ChatMessage {
    private long id;
    private String content;
    private String sender;

}
