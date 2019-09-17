package edu.zust.boatserver.dao;

import edu.zust.boatserver.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by HASEE on 2019/8/24
 */
public interface UserRepository extends JpaRepository<User, Integer> {
    @Query("select count(u) from #{#entityName} u where u.name = :username or u.phone = :username")
    int countByUsername(@Param("username") String username);

    @Query("select u from #{#entityName} u where (u.name = :username or u.phone = :username) and u.password = :password")
    User findByUsername(@Param("username") String username, @Param("password") String password);

    @Query("select u from #{#entityName} u where u.name = :username or u.phone = :username")
    User findByUsername(@Param("username") String username);

    int countByPhone(String phone);
    int countByName(String name);

    @Modifying
    @Query("update #{#entityName} u set u.password = :password where u.id = :id")
    int updatePassword(@Param("id") Integer id,@Param("password") String password);

    @Modifying
    @Query("update #{#entityName} u set u.phone = :phone where u.id = :id")
    int updatePhone(@Param("id") Integer id,@Param("phone") String phone);

    int countByEmail(String email);

    @Modifying
    @Query("update #{#entityName} u set u.email = :email where u.id = :id")
    int updateEmail(@Param("id") Integer id,@Param("email") String email);

}
