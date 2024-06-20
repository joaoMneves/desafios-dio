package dio.desafio_gof.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.desafio_gof.nodel.User;
import dio.desafio_gof.service.impl.UserServiceImpl;

/**
 * UserController
 */
@RestController
@RequestMapping("users")
public class UserController {
  @Autowired
  private UserServiceImpl userService;

  @GetMapping
  public ResponseEntity<Iterable<User>> getUsers() {
    return ResponseEntity.ok(userService.getAllUsers());
  }

  @GetMapping("/{id}")
  public ResponseEntity<User> getById(@PathVariable Long id) {
    return ResponseEntity.ok(userService.findById(id));
  }

  @PostMapping
  public ResponseEntity<User> addUser(@RequestBody User user) {
    return ResponseEntity.ok(userService.addUser(user));
  }

  @PutMapping("/{id}")
  public ResponseEntity<User> changeNeme(@PathVariable Long id, @RequestBody String name) {
    return ResponseEntity.ok(userService.changeUserName(id, name));
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
    userService.remove(id);
    return ResponseEntity.ok().build();
  }
}
