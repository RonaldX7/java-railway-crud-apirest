package com.ronald.apirest.repositories;

import com.ronald.apirest.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {


}
