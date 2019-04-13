package com.MppProject.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.MppProject.models.*;


public interface UserRepository extends CrudRepository<User, Integer> {

    @Query(value = "SELECT id FROM userdata where name = :name", nativeQuery=true)
    public Iterable<Integer> findIdByName(@Param("name") String name);

    @Query(value = "SELECT id FROM userdata where email = :email", nativeQuery=true)
    public Integer findIdByLogin(@Param("email") String email);

    @Query(value = "SELECT id FROM userdata", nativeQuery=true)
    public Iterable<Integer> findId();


    public User findFirstById(int id);

    public User findByEmail(String email);

    public User findByName(String name);

    public int countByName(String name);

    public int countByEmail(String email);
}
