package coats.repository;

import org.springframework.data.repository.CrudRepository;

import coats.model.User;

public interface UserRepository extends CrudRepository<User, Long>{

}
