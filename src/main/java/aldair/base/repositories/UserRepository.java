package aldair.base.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import aldair.base.entities.User;

public interface UserRepository extends JpaRepository<User, Long>, UserRepositoryCustom {}