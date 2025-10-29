package com.OSI.OrdemDeServico.modelo;

import lombok.Generated;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class ProjetoEmbalagemModelo {
    private Long id;
    private String nome;
    private String medidasExternas;
    private  String medidasInternas;

    private ClienteModelo clienteModelo;
}
