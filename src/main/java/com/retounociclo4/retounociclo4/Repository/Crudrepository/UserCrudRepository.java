package com.retounociclo4.retounociclo4.Repository.Crudrepository;

import java.util.Optional;
import com.retounociclo4.retounociclo4.Model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserCrudRepository extends CrudRepository<User, Integer>{
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email,String password);
}
