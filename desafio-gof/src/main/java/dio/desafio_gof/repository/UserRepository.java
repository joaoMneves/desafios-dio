package dio.desafio_gof.repository;

import org.springframework.data.repository.CrudRepository;

import dio.desafio_gof.nodel.User;

/**
 * UserRepository
 */
public interface UserRepository extends CrudRepository<User, Long> {
}
