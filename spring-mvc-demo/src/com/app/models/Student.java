package com.app.models;

import java.util.LinkedHashMap;

public class Student {

	private String firstName = "Banna";
	private String lastName = "Tadepalli";
	private String country = "India";
	private String favouriteLanguage = "Java";
	private String[] operatingSystems;
	
	private LinkedHashMap<String, String> countryOptions;
	private LinkedHashMap<String, String> languageOptions;
	

	public Student() {

		// populate country options: used ISO country code
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
		countryOptions.put("IN", "India");
		countryOptions.put("US", "United States of America");
		
		// populate favouriteLanguage options
		languageOptions = new LinkedHashMap<>();
		languageOptions.put("Java", "Java");
		languageOptions.put("C#", "C#");
		languageOptions.put("Ruby", "Ruby");
		languageOptions.put("Python", "Python");
		languageOptions.put("C++", "C++");
		languageOptions.put("Golang", "Golang");
		

	}
	

	public String[] getOperatingSystems() {
		return operatingSystems;
	}




	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}




	public LinkedHashMap<String, String> getLanguageOptions() {
		return languageOptions;
	}


	public void setLanguageOptions(LinkedHashMap<String, String> languageOptions) {
		this.languageOptions = languageOptions;
	}


	public String getFavouriteLanguage() {
		return favouriteLanguage;
	}



	public void setFavouriteLanguage(String favouriteLanguage) {
		this.favouriteLanguage = favouriteLanguage;
	}



	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
