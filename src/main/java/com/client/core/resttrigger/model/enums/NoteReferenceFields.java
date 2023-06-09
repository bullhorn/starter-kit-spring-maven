package com.client.core.resttrigger.model.enums;

import com.bullhornsdk.data.model.entity.core.standard.*;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

public enum NoteReferenceFields {

    CANDIDATES("candidates", Candidate::new, Note::setCandidates),
    CLIENT_CONTACTS("clientContacts", ClientContact::new, Note::setClientContacts),
    JOB_ORDERS("jobOrders", JobOrder::new, Note::setJobOrders),
    PLACEMENTS("placements", Placement::new, Note::setPlacements),
    LEADS("leads", Lead::new, Note::setLeads),
    OPPORTUNITIES("opportunities", Opportunity::new, Note::setOpportunities);

    private String fieldName;
    private Supplier constructor;
    private BiConsumer<Note, OneToMany> setReference;

    NoteReferenceFields(String fieldName, Supplier constructor, BiConsumer<Note, OneToMany> setReference) {
        this.fieldName = fieldName;
        this.constructor = constructor;
        this.setReference = setReference;
    }

    public String getFieldName() {
        return fieldName;
    }

    public Supplier getConstructor() {
        return constructor;
    }

    public BiConsumer<Note, OneToMany> getSetReference() {
        return setReference;
    }
}
