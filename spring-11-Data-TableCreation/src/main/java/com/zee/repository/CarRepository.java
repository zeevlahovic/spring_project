package com.zee.repository;

import com.zee.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


//@Repository
public interface CarRepository extends JpaRepository <Car,Long> {
}
