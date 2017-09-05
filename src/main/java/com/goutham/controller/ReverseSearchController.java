package com.goutham.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.goutham.model.TransLation;
import com.goutham.model.ReverseSearchCriteria;
import com.goutham.services.SearchService;
/**
 * Implemented During Astute coding Challenge
 * Created by Goutham Kunduru on 09/02/2017.
 * 
 * @author Goutham Kunduru
 * @version 1.0
 */
@RestController
public class ReverseSearchController {
	
	@Autowired
	private SearchService reverseLabelSearchService;

    @PostMapping("/api/searchReverse")
    public ResponseEntity<?> getReverseSearchResultViaAjax(@Valid @RequestBody ReverseSearchCriteria searchReverse, Errors errors){
        TransLation translation = new TransLation();
        if(errors.hasErrors()){
            return ResponseEntity.badRequest().body(translation);
        }
        String label = reverseLabelSearchService.findReverseTranslation(searchReverse.getLabel());
        translation.setTranslation(label);
        if(label == null) {
            return null;
        }
        return ResponseEntity.ok(translation);
    }

}
