package com.world.alfs.domain.special.repository;

import com.world.alfs.domain.special.Special;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface SpecialRepository extends JpaRepository<Special, Long> {

        List<Special> findByStart(LocalDateTime time);

        List<Special> findByEnd(LocalDateTime time);

        Optional<Special> findById(Long productId);
}
