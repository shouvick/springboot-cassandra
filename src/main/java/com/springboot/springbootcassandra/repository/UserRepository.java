package com.springboot.springbootcassandra.repository;

import com.springboot.springbootcassandra.entity.User;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends CassandraRepository<User, Integer> {

}
