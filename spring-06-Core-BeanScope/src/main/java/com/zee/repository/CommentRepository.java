package com.zee.repository;

import com.zee.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}

