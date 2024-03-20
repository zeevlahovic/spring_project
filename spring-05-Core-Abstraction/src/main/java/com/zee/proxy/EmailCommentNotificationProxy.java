package com.zee.proxy;

import com.zee.model.Comment;

public class EmailCommentNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment:" + comment.getText());
    }
}
