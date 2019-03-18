package com.client.core.resttrigger.model.enums;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.standard.ClientContact;
import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.bullhornsdk.data.model.entity.core.standard.Lead;
import com.bullhornsdk.data.model.entity.core.standard.Note;
import com.bullhornsdk.data.model.entity.core.standard.Opportunity;
import com.bullhornsdk.data.model.entity.core.standard.Placement;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;

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
