package com.movieapp.service;

import java.util.Arrays;
import java.util.List;

public class MovieServiceImpl implements IMovieService {

	@Override
	public List<String> getByLanguage(String language) {
		
		if(language.equals("english")) {
			
		return Arrays.asList("Spyder Man Return","Beauty and beast","jumanji","Exception");
		}
		
		else if(language.equals("hindi")) {
			
			return Arrays.asList("Jugjug jio","Runway36","Tiger Zinda hai","fashion");
		}
		else if(language.equals("telugu")) {
			
			return Arrays.asList("Pushpa","bahubali","100% love","Maaz");
		}
		else if(language.equalsIgnoreCase("tamil")) {
	
		return Arrays.asList("Jai bheem","vikram","Anjan","valimai");
		}	
		
		else  {
			
		return Arrays.asList("Salute","Haridyam","Malik","Major");
			}
		
	}

}
