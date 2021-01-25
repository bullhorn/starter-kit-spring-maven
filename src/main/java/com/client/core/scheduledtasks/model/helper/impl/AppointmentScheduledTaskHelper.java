package com.client.core.scheduledtasks.model.helper.impl;

import com.bullhornsdk.data.model.entity.core.standard.*;
import com.client.core.base.model.relatedentity.AppointmentRelatedEntity;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.scheduledtasks.model.helper.AbstractScheduledTaskHelper;
import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;

import java.util.Map;
import java.util.Optional;
import java.util.Set;


public class AppointmentScheduledTaskHelper extends AbstractScheduledTaskHelper<Appointment> {

	private Candidate candidate;
	private JobOrder jobOrder;
	private Opportunity opportunity;
	private Lead lead;
	private ClientContact clientContact;
	private CorporateUser appointmentOwner;
	private Placement placement;

	public AppointmentScheduledTaskHelper(CustomSubscriptionEvent event, Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(event, Appointment.class, AppointmentRelatedEntity.APPOINTMENT,  relatedEntityFields);
	}

	public Appointment getAppointment() {
        return getEntity();
    }

	public CorporateUser getAppointmentOwner() {
		if (appointmentOwner == null) {
			this.appointmentOwner = findCorporateUser(getAppointment().getOwner().getId(), AppointmentRelatedEntity.APPOINTMENT_OWNER);
		}

		return appointmentOwner;
	}

	public Optional<Candidate> getCandidate() {
		if (candidate == null && isPopulated(getAppointment().getCandidateReference())) {
			this.candidate = findCandidate(getAppointment().getCandidateReference().getId(), AppointmentRelatedEntity.CANDIDATE);
		}

		return Optional.ofNullable(candidate);
	}

	public Optional<JobOrder> getJobOrder() {
		if (jobOrder == null && isPopulated(getAppointment().getJobOrder())) {
			this.jobOrder = findJobOrder(getAppointment().getJobOrder().getId(), AppointmentRelatedEntity.JOB_ORDER);
		}

		return Optional.ofNullable(jobOrder);
	}

	public Optional<ClientContact> getClientContact() {
		if (clientContact == null && isPopulated(getAppointment().getClientContactReference())) {
			this.clientContact = findClientContact(getAppointment().getClientContactReference().getId(), AppointmentRelatedEntity.CLIENT_CONTACT);
		}

		return Optional.ofNullable(clientContact);
	}

	public Optional<Opportunity> getOpportunity() {
		if (opportunity == null && isPopulated(getAppointment().getOpportunity())) {
			this.opportunity = findOpportunity(getAppointment().getOpportunity().getId(), AppointmentRelatedEntity.OPPORTUNITY);
		}

		return Optional.ofNullable(opportunity);
	}

	public Optional<Lead> getLead() {
		if (lead == null && isPopulated(getAppointment().getLead())) {
			this.lead = findLead(getAppointment().getLead().getId(), AppointmentRelatedEntity.LEAD);
		}

		return Optional.ofNullable(lead);
	}

	public Optional<Placement> getPlacement() {
		if (placement == null && isPopulated(getAppointment().getPlacement())) {
			this.placement = findPlacement(getAppointment().getPlacement().getId(), AppointmentRelatedEntity.PLACEMENT);
		}

		return Optional.ofNullable(placement);
	}

}
