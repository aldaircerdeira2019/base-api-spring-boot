package aldair.base.repositories.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import aldair.base.entities.User;
import aldair.base.repositories.UserRepositoryCustom;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class UserRepositoryImpl implements UserRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getAll() {
        StringBuilder string = new StringBuilder();

        string.append("FROM User");

        return entityManager
                .createQuery(string.toString(), User.class)
                .getResultList().stream().toList();
    }

}
