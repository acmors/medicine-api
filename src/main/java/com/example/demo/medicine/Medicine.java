package com.example.demo.medicine;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "Medicines")
@Table(name = "medicine")
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Medicine {
	
	public Medicine(MedicineData data) {
		this.name = data.name();
		this.via = data.via();
		this.lote = data.lote();
		this.quantity = data.quantity();
		this.expiration = data.expiration();
		this.laboratory = data.laboratory();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	@Enumerated(EnumType.STRING)
	private Via via;
	private String lote;
	private String quantity;
	private String expiration;
	
	@Enumerated(EnumType.STRING)
	private Laboratory laboratory;
}
