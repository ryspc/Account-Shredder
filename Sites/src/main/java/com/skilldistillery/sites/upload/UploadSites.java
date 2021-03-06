package com.skilldistillery.sites.upload;

import java.util.List;

public class UploadSites {

	private String name;
	private String url;
	private String difficulty;
	private String notes = "";
	private String notes_fr = "";
	private String notes_ru = "";
	private String notes_tr = "";
	private String notes_it = "";
	private String notes_pt_br = "";
	private String notes_cat = "";
	private String notes_es = "";
	private String notes_pl = "";
	private String email;
	private String email_subject = "";
	private String email_body = "";
	private List<String> domains;

	public UploadSites() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getNotes_fr() {
		return notes_fr;
	}

	public void setNotes_fr(String notes_fr) {
		this.notes_fr = notes_fr;
	}

	public String getNotes_ru() {
		return notes_ru;
	}

	public void setNotes_ru(String notes_ru) {
		this.notes_ru = notes_ru;
	}

	public String getNotes_tr() {
		return notes_tr;
	}

	public void setNotes_tr(String notes_tr) {
		this.notes_tr = notes_tr;
	}

	public String getNotes_it() {
		return notes_it;
	}

	public void setNotes_it(String notes_it) {
		this.notes_it = notes_it;
	}

	public String getNotes_pt_br() {
		return notes_pt_br;
	}

	public void setNotes_pt_br(String notes_pt_br) {
		this.notes_pt_br = notes_pt_br;
	}

	public String getNotes_cat() {
		return notes_cat;
	}

	public void setNotes_cat(String notes_cat) {
		this.notes_cat = notes_cat;
	}

	public String getNotes_es() {
		return notes_es;
	}

	public void setNotes_es(String notes_es) {
		this.notes_es = notes_es;
	}

	public String getNotes_pl() {
		return notes_pl;
	}

	public void setNotes_pl(String notes_pl) {
		this.notes_pl = notes_pl;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail_subject() {
		return email_subject;
	}

	public void setEmail_subject(String email_subject) {
		this.email_subject = email_subject;
	}

	public String getEmail_body() {
		return email_body;
	}

	public void setEmail_body(String email_body) {
		this.email_body = email_body;
	}

	public List<String> getDomains() {
		return domains;
	}

	public void setDomains(List<String> domains) {
		this.domains = domains;
	}

	@Override
	public String toString() {
		return "UploadSites [name=" + name + ", url=" + url + ", difficulty=" + difficulty + ", notes=" + notes
				+ ", notes_fr=" + notes_fr + ", notes_ru=" + notes_ru + ", notes_tr=" + notes_tr + ", notes_it="
				+ notes_it + ", notes_pt_br=" + notes_pt_br + ", notes_cat=" + notes_cat + ", notes_es=" + notes_es
				+ ", notes_pl=" + notes_pl + ", email=" + email + ", email_subject=" + email_subject + ", email_body="
				+ email_body + ", domains=" + domains + "]";
	}

}
