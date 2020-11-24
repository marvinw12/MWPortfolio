package com.mbw.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Project {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String title;
    
	private String description;

	private String image;
	
	private String liveLink;

	private String gitLink;

	public Project() {
	}

	public Project(String title, String description, String image, String liveLink, String gitLink) {
		this.title = title;
		this.description = description;
		this.image = image;
		this.liveLink = liveLink;
		this.gitLink = gitLink;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLiveLink() {
		return liveLink;
	}
	public void setLiveLink(String liveLink) {
		this.liveLink = liveLink;
	}
	public String getGitLink() {
		return gitLink;
	}
	public void setGitLink(String gitLink) {
		this.gitLink = gitLink;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	




	
    



}

