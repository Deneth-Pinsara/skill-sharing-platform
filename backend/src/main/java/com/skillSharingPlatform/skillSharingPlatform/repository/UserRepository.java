package com.skillSharingPlatform.skillSharingPlatform.repository;

import com.skillSharingPlatform.skillSharingPlatform.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);

    Optional<User> findByProviderAndProviderId(String provider, String providerId);

    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
}