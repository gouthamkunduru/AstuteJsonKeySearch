package com.goutham.model;

import org.hibernate.validator.constraints.NotBlank;
/**
 * Implemented During Astute coding Challenge
 * Created by Goutham Kunduru on 09/02/2017.
 * 
 * @author Goutham Kunduru
 * @version 1.0
 */
public class ReverseSearchCriteria {

    @NotBlank(message = "Please Enter label to search!")
    private String label;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

}