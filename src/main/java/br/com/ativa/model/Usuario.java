package br.com.ativa.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Usuario {
    private int id;
    private String Nome;
}
