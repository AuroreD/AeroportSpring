package AeroportSpring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import AeroportSpring.model.Login;

public interface LoginRepository extends JpaRepository<Login, Long> {

}