package dio.desafio_gof.service;

import dio.desafio_gof.nodel.User;

/**
 * UserSercice
 */
public interface UserSercice {

  Iterable<User> getAllUsers();

  User findById(Long id);

  User addUser(User user);

  User remove(Long id);

  void changeUserName(Long Id, String new_name);
}
