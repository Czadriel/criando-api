package com.dio.criando_api.service;

import com.dio.criando_api.account.PlayerAccount;
import com.dio.criando_api.repository.RepositoryPlayer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ServicePlayer {

    private final RepositoryPlayer repositoryPlayer;

    public ServicePlayer(RepositoryPlayer repositoryPlayer){
        this.repositoryPlayer = repositoryPlayer;
    }
    public List<PlayerAccount> listar(){
        return repositoryPlayer.findAll();
    }
    public Optional<PlayerAccount> buscarPorId(Long id){
        return repositoryPlayer.findById(id);
    }

    public PlayerAccount salvar(PlayerAccount playerAccount){
        return repositoryPlayer.save(playerAccount);
    }
    public void deletar(Long id){
        repositoryPlayer.deleteById(id);
    }

}
