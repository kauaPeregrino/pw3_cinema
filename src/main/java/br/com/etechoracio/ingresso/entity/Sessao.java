package br.com.etechoracio.ingresso.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Getter
@Setter
@Entity
@Table(name = "TBL_SESSAO")
public class Sessao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_FILME")
    private Long id;

    @Column(name = "DATE_DATA")
    private LocalDate data;

    @Column(name = "DATE_HORARIO")
    private LocalTime horario;

    @Column(name = "NR_PRECO")
    private Double preco;

    @Column(name = "TX_SALA")
    private String sala;

    @ManyToOne
    @JoinColumn(name = "filme_id_filme")
    private Filme filme;

}