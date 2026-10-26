package co.simplon.sticker.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.sticker.dtos.StickerEdit;
import co.simplon.sticker.dtos.StickerView;
import co.simplon.sticker.services.StickerService;
import jakarta.validation.Valid;

@CrossOrigin("*")
@RestController
@RequestMapping("/stickers")
public class StickerController {
	
	// Inject an instance of StickerService:
	// - Declare a field (final : good practice)
	// - A constructor with a type 'StickerService' as argument
	private final StickerService service;
	
	public StickerController(StickerService service) {
		this.service = service;
	}
	
	@GetMapping("/{id}") // path variable
	public StickerView get(@PathVariable Long id) {
		return service.get(id);
	}
	
	@PostMapping
	@ResponseStatus(code=HttpStatus.CREATED)
	public StickerView post(@RequestBody @Valid StickerEdit inputs) {
		return service.post(inputs);
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(code=HttpStatus.NO_CONTENT)
	public void put(@PathVariable Long id,
			@RequestBody StickerEdit inputs) {
		//
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(code=HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
	
}
