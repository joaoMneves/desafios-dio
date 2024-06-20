package dio.desafio_gof.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dio.desafio_gof.nodel.User;
import dio.desafio_gof.repository.UserRepository;

/**
 * UserServiceImpl
 */
@Service
public class UserServiceImpl {

  @Autowired
  private UserRepository userRepo;

  public Iterable<User> getAllUsers() {
    return userRepo.findAll();
  }

  public User findById(Long id) {
    Optional<User> u = userRepo.findById(id);
    return u.get();
  }

  public User addUser(User user) {
    userRepo.save(user);
    return user;
  }

  public void remove(Long id) {
    userRepo.deleteById(id);
  }

  public User changeUserName(Long id, String new_name) {
    Optional<User> u = userRepo.findById(id);

    if (u.isPresent()) {
      u.get().setUsername(new_name);
      userRepo.save(u.get());
    }
    return u.get();
  }
}
