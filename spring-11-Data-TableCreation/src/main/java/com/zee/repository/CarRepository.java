package com.zee.repository;

import com.zee.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository <Car,Long> {
}
