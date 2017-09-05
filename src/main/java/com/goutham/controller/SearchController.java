package com.goutham.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.goutham.model.TransLation;
import com.goutham.model.SearchCriteria;
import com.goutham.services.SearchService;
/**
 * Implemented During Astute coding Challenge
 * Created by Goutham Kunduru on 09/02/2017.
 * 
 * @author Goutham Kunduru
 * @version 1.0
 */
@RestController
public class SearchController {
	
	@Autowired
    private SearchService labelSearchService;

    @PostMapping("/api/search")
    public ResponseEntity<?> getSearchResultViaAjax(@Valid @RequestBody SearchCriteria search, Errors errors){
        TransLation translation = new TransLation();
        if(errors.hasErrors()){
            return ResponseEntity.badRequest().body(translation);
        }
        String label = labelSearchService.findTranslation(search.getLabel());
        translation.setTranslation(label);
        if(label == null) {
            return null;
        }
        return ResponseEntity.ok(translation);
    }

}
