package edu.zust.boatserver.dao;

import edu.zust.boatserver.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * ${DESCRIPTION}
 * Created by HASEE on 2019/8/24
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findUserByNameAndPassword(String username, String password);
}
