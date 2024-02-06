package br.com.cursoapirestfull.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cursoapirestfull.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
