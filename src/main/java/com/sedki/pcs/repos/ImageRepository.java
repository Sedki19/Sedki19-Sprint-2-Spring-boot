package com.sedki.pcs.repos;
import org.springframework.data.jpa.repository.JpaRepository;
import com.sedki.pcs.entities.Image;

public interface ImageRepository extends JpaRepository<Image , Long> {
}
