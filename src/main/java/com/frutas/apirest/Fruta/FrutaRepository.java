package com.frutas.apirest.Fruta;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FrutaRepository extends JpaRepository<fruta, Long> {
     public abstract List<fruta> findByTipo(String tipo);
}
