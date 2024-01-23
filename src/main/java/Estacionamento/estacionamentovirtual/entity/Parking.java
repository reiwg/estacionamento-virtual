package Estacionamento.estacionamentovirtual.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;


@Entity
@Getter
@Setter
@NoArgsConstructor
public class Parking {

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Busy")
    private boolean Busy;

    @Column(name = "Entry")
    private LocalDateTime entry;

    @Column(name = "Exit")
    private LocalDateTime exit;

    
}