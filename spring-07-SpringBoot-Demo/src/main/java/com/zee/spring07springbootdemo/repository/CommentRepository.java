package com.zee.spring07springbootdemo.repository;


import com.zee.spring07springbootdemo.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}

