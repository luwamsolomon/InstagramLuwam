package com.MppProject.repositories;

import org.springframework.data.repository.CrudRepository;

import com.MppProject.models.*;

/**
 * Created by student.
 */
public interface ImageRepository extends CrudRepository<Image,Long> {
        public Iterable<Image> findAllByUser(User user);
}
