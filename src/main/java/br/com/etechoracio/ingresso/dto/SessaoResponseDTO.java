package br.com.etechoracio.ingresso.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public record SessaoResponseDTO (

    LocalDate data,
    LocalTime horario,
    Double preco,
    String sala,
    Long id

) {}

