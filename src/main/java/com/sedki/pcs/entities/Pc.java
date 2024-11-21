package com.sedki.pcs.entities;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Pc {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPc;
    
    private String nomPc;
    
    private Double prixPc;
    
    private String specs;

    @ManyToOne
    private Marque marque;
    
   /* @OneToOne
    private Image image;*/
    
    @OneToMany (mappedBy = "pc")
    private List<Image> images;
    
    private String imagePath;

    // Default constructor
    public Pc() {
        super();
    }

    // Constructor with parameters
    public Pc(String nomPc, Double prixPc, String specs) {
        super();
        this.nomPc = nomPc;
        this.prixPc = prixPc;
        this.specs = specs;
    }

    // Getters and Setters
    public Long getIdPc() {
        return idPc;
    }

    public void setIdPc(Long idPc) {
        this.idPc = idPc;
    }

    public String getNomPc() {
        return nomPc;
    }

    public void setNomPc(String nomPc) {
        this.nomPc = nomPc;
    }

    public Double getPrixPc() {
        return prixPc;
    }

    public void setPrixPc(Double prixPc) {
        this.prixPc = prixPc;
    }

    public String getSpecs() {
        return specs;
    }

    public void setSpecs(String specs) {
        this.specs = specs;
    }

    public Marque getMarque() {
        return marque;
    }

    public void setMarque(Marque marque) {
        this.marque = marque;
    }
    
    

   

	public List<Image> getImages() {
		return images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}

	@Override
    public String toString() {
        return "Pc [idPc=" + idPc + ", nomPc=" + nomPc + ", prixPc=" + prixPc + ", specs=" + specs + "]";
    }

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
    
    
}
