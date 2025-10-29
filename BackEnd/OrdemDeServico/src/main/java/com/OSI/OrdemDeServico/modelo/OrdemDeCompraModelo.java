package com.OSI.OrdemDeServico.modelo;

import java.time.LocalDate;

public class OrdemDeCompraModelo {
    private Long id;
    private String numero;
    private LocalDate data;
    private boolean aprovado;

    private ClienteModelo clienteModelo;
    private ProjetoEmbalagemModelo projetoEmbalagem;
}
