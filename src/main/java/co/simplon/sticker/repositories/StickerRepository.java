package co.simplon.sticker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.sticker.entities.Sticker;

@Repository
public interface StickerRepository extends JpaRepository<Sticker, Long>{

}
