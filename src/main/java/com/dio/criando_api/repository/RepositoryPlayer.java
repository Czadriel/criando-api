package com.dio.criando_api.repository;


import com.dio.criando_api.account.PlayerAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

public interface RepositoryPlayer extends JpaRepository<PlayerAccount, Long> {

}
