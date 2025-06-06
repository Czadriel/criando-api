package com.dio.criando_api.account;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PlayerAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nickname;
    private String email;
    private String senhaCriptografada;

    public Long getId(){ return id; }

    public void setId(Long id){ this.id = id;  }

    public String getNickname() {return nickname;}

    public void setNickname(String hazard) {this.nickname = nickname;}

    public String getEmail() {return email;}

    public void setEmail(String cezar123) {this.email = email;}

    public String getSenhaCriptografada() {return senhaCriptografada;}

    public void setSenhaCriptografada(String kk123) {this.senhaCriptografada = senhaCriptografada;}
}

