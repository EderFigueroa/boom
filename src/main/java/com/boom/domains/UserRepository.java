package com.boom.domains;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.boom.models.User;

public interface UserRepository extends CrudRepository<User, Long> {
  List<User> findByUsername(String name);
 
}


