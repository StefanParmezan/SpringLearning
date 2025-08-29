// org/StefanParmezan/JpaLearning/service/UserService.java
package org.StefanParmezan.JpaLearning.services;


import org.StefanParmezan.JpaLearning.models.User;
import org.StefanParmezan.JpaLearning.repositories.JpaLearningRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JpaService {

    private final JpaLearningRepository jpaLearningRepository;

    @Autowired
    public JpaService(JpaLearningRepository jpaLearningRepository) {
        this.jpaLearningRepository = jpaLearningRepository;
    }

    public void createUser(String username, String password) {
        User user = new User(username, password);
        jpaLearningRepository.save(user);
    }

    public List<User> getAllUsers() {
        return jpaLearningRepository.findAll();
    }

    public User findById(Long id) {
        return jpaLearningRepository.findById(id).orElse(null);
    }

    public User findByUsername(String username){
        return jpaLearningRepository.getByUsername("StefanParmezan");
    }
}