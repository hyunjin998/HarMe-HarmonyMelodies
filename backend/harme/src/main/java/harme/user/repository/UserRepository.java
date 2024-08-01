package harme.user.repository;

import harme.user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    @Query("Select u from users u WHERE u.nickName like :nickname")
    Optional<UserEntity> findByNickname(@Param("nickname") String nickname);
}
