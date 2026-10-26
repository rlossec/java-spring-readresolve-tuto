package co.simplon.sticker.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record StickerEdit(
		
		@NotNull(message="Name must not be null")
		String name,
		@NotBlank(message = "Description must not be blank")
		String description,
		@Positive(message = "Price must be positive")
		double price
		) {	
	//
}
