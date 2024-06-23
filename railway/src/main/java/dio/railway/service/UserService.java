package dio.railway.service;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import dio.railway.domain.model.User;
import dio.railway.domain.repository.UserRepository;

/**
 * UserService
 */

@Service
public class UserService {

  private final UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public User findById(Long id) {
    return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
  }

  public User create(User userToCreate) {
    if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
      throw new IllegalArgumentException("This Account number already exists.");
    }
    return userRepository.save(userToCreate);
  }
}
