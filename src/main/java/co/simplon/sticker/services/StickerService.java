package co.simplon.sticker.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.simplon.sticker.dtos.StickerEdit;
import co.simplon.sticker.dtos.StickerView;
import co.simplon.sticker.entities.Sticker;
import co.simplon.sticker.repositories.StickerRepository;


@Service
@Transactional(readOnly = true)
public class StickerService {

	private final StickerRepository repository;
	
	public StickerService (StickerRepository repository) {
		this.repository = repository;
	}
	
	public StickerView get(Long id) {
		StickerView sticker = repository.findProjectedById(id).orElseThrow();
		return sticker;
	}
	
	// inputs were validated
	@Transactional(readOnly = false)
	public StickerView post(StickerEdit inputs) {
		Sticker sticker = new Sticker();
		sticker.setName(inputs.name());
		sticker.setDescription(inputs.description());
		sticker.setPrice(inputs.price());
		repository.save(sticker);
		return new StickerView(sticker.getName());
	}
	
	@Transactional
	public void delete(Long id) {
		repository.deleteById(id);
	}
}
