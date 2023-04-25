package doc.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Annonce {
	public Annonce( String sujet, String entreprise, String contact, Date date,
			String categorie) {
		super();
		this.sujet = sujet;
		this.entreprise = entreprise;
		this.contact = contact;
		this.date = date;
		this.categorie = categorie;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String sujet;
	private String entreprise;
	private String contact; 
	//@Length(max = 255)
	private Date date;
	private String categorie;
}