package com.MppProject.repositories;

import org.springframework.data.repository.CrudRepository;

import com.MppProject.models.*;

/**
 * Created by student.
 */
public interface CommentRepository extends CrudRepository<Comment, Integer> {

    public Iterable<Comment> findAllByImage(Image image);
}
