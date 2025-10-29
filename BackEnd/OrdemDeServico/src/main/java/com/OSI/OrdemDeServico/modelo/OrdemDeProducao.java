package com.OSI.OrdemDeServico.modelo;

import java.time.LocalDate;

public class OrdemDeProducao {
    private Long id;
    private LocalDate dataGeracao;
    private String status;

    private OrdemDeCompraModelo ordemDeCompra;
}
