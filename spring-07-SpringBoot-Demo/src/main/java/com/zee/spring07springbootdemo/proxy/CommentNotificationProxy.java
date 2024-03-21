package com.zee.spring07springbootdemo.proxy;


import com.zee.spring07springbootdemo.model.Comment;

;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
