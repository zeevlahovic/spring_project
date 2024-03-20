package com.zee.proxy;

import com.zee.model.Comment;

;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
