package com.caio.smartaccessapi.service;

import com.caio.smartaccessapi.entity.User;
import com.caio.smartaccessapi.exception.BusinessException;
import com.caio.smartaccessapi.exception.ResourceNotFoundException;
import com.caio.smartaccessapi.repository.AccessRepository;
import com.caio.smartaccessapi.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository repository;
    private final AccessRepository accessRepository;

    public UserService(UserRepository repository, AccessRepository accessRepository) {
        this.repository = repository;
        this.accessRepository = accessRepository;
    }
    public User save(User user){
        return repository.save(user);
    }

    public List<User> findAll(){
        return repository.findAll();
    }

    public void delete(Long id){
        if(!repository.existsById(id)){
            throw new ResourceNotFoundException("Usuário não encontrado");
        }
        if (accessRepository.existsByUserId(id)) {
            throw new BusinessException("Usuário possui acessos e não pode ser deletado");
        }
        repository.deleteById(id);
    }
}
