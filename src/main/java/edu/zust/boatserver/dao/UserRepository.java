package edu.zust.boatserver.dao;

import edu.zust.boatserver.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * ${DESCRIPTION}
 * Created by HASEE on 2019/8/24
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findUserByUsernameAndPassword(String username, String password);
}
