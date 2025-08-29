// org/StefanParmezan/JpaLearning/repository/UserRepository.java
package org.StefanParmezan.JpaLearning.repositories;

import org.StefanParmezan.JpaLearning.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaLearningRepository extends JpaRepository<User, Long> {
    public User getByUsername(String Username);
}