package com.cts.lrh.incident.model.dto;

import com.cts.lrh.incident.model.Referral;

/**
 * DTO Class to Capture the data from front end
 * Should be used only when saving and getting back
 * Purpose is to get the Ids's of the referenced data objects
 */
public class ReferralFullDTO {

    private Referral referral;
    private long selectedCentreKey;

    public Referral getReferral() {
        return referral;
    }

    public void setReferral(Referral referral) {
        this.referral = referral;
    }

    public long getSelectedCentreKey() {
        return selectedCentreKey;
    }

    public void setSelectedCentreKey(long selectedCentreKey) {
        this.selectedCentreKey = selectedCentreKey;
    }
}
