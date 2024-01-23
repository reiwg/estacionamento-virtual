package Estacionamento.estacionamentovirtual.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Estacionamento.estacionamentovirtual.entity.Parking;

public interface ParkingRepository extends JpaRepository<Parking,Long> {
    
}
