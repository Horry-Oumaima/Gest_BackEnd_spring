package doc.web;

import java.util.Date;
import java.util.List;

import org.hibernate.validator.constraints.Length;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import doc.entities.Annonce;
import doc.entities.User;
import doc.service.AnnonceService;
import doc.service.IAnnonceService;
import lombok.Data;

@RestController
public class AnnonceController {
	@Autowired
	AnnonceService annonceService;
	
	@GetMapping("/annonces")
	public List<Annonce> getAll()
	{
		return annonceService.getAllAnnonces();
	}
	@PostMapping("/annonces")
	public Annonce register(@RequestBody AnnonceForm annonceForm)
	{
		
		//System.err.println(userForm);
		return annonceService.saveAnnonce(new Annonce(null,
				annonceForm.getSujet(),
				annonceForm.getEntreprise(),
				annonceForm.getContact(),
				annonceForm.getDate(),
				annonceForm.getCategorie()));
	}

}

@Data
class AnnonceForm{
	private String sujet;
	private String entreprise;
	private String contact; 
	private Date date;
	private String categorie;
}