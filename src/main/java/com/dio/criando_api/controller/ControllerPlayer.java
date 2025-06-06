package com.dio.criando_api.controller;

import com.dio.criando_api.account.PlayerAccount;
import com.dio.criando_api.service.ServicePlayer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/player")

public class ControllerPlayer {

    private final ServicePlayer servicePlayer;

    public ControllerPlayer(ServicePlayer servicePlayer){
        this.servicePlayer = servicePlayer;
    }
    @GetMapping
    public List<PlayerAccount> listar(){
        return servicePlayer.listar();
    }
    @GetMapping("/{id}")
    public ResponseEntity<PlayerAccount> buscar(@PathVariable Long id){
        return servicePlayer.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping
    public PlayerAccount salvar(@RequestBody PlayerAccount playerAccount){
        return servicePlayer.salvar(playerAccount);
    }
    @PutMapping("/{id}")
    public ResponseEntity<PlayerAccount> atualizar(@PathVariable Long id, @RequestBody PlayerAccount playerAccount) {
        return servicePlayer.buscarPorId(id)
                .map(p -> {
                    playerAccount.setId(id);
                    return ResponseEntity.ok(servicePlayer.salvar(playerAccount));
                })
                .orElse(ResponseEntity.notFound().build());

        }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id){
        if (servicePlayer.buscarPorId(id).isPresent()){
            servicePlayer.deletar(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
