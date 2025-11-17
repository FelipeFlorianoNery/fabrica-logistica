package com.felipenery.logistica.backend.domain.entity;

import jakarta.persistence.*;

import java.time.OffsetDateTime;

@Entity
@Table(name="pedidos")

public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Autoincrementar o id
    private Long id;

    @Column(nullable = false) // Coluna não pode ser nula
    private String numeroNf;

    @Column(nullable = false, unique = true)
    private String numeroPedido;

    @Column(nullable = false)
    private String status;

    @Column(nullable = false)
    private OffsetDateTime dataNota;

    private OffsetDateTime dataColeta;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroNf() {
        return numeroNf;
    }

    public void setNumeroNf(String numeroNf) {
        this.numeroNf = numeroNf;
    }

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public OffsetDateTime getDataNota() {
        return dataNota;
    }

    public void setDataNota(OffsetDateTime dataNota) {
        this.dataNota = dataNota;
    }

    public OffsetDateTime getDataColeta() {
        return dataColeta;
    }

    public void setDataColeta(OffsetDateTime dataColeta) {
        this.dataColeta = dataColeta;
    }
}
