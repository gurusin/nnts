package com.cts.lrh.incident.model.util;

/**
 * Created by sudarshana on 5/30/2016.
 */
public enum YesNoValue
{
    Yes("Yes"),No("No");

    private String text;

    YesNoValue(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
