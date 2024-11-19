package com.codewithjonathan.SpringSecEx.repo;

import com.codewithjonathan.SpringSecEx.model.Student;
import com.codewithjonathan.SpringSecEx.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users, Integer> {
    Users findByUsername(String username);
}


// plaintext
// before stored into database, we want to go from plain text -> ciphertext
// instead use a hash???