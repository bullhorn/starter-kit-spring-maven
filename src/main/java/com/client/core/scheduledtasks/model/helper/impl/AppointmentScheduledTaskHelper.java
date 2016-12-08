package com.client.core.scheduledtasks.model.helper.impl;

import com.bullhornsdk.data.model.entity.core.standard.Appointment;
import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.standard.ClientContact;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.bullhornsdk.data.model.entity.core.standard.Placement;
import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;
import com.client.core.scheduledtasks.model.helper.AbstractScheduledTaskHelper;

/**
 * Contains all the data needed to handle scheduled tasks automation. Once a Dto has been fetched using the BH api it
 * will be stored in this Traverser for subsequent automation work.
 * 
 * The allDtosToSaveBackToBH map will contain deep copies of relevant dtos that should be saved back to BH. The copies
 * will be updated according to task logic, while the original dtos will NOT be updated so that subsequent logic will
 * still be made on original values.
 * 
 * Once all automation work has been done the dtos that need saving will be saved only once. In this way keeping the api
 * calls to a minimum by saving each dto only once, even though multiple tasks might have updated different fields on
 * the same dto.
 * 
 * @author magnus.palm
 *
 */
public class AppointmentScheduledTaskHelper extends AbstractScheduledTaskHelper<Appointment> {

	private Candidate candidate;
	private JobOrder job;
	private ClientContact clientContact;
	private CorporateUser appointmentOwner;
	private Placement placement;

	public AppointmentScheduledTaskHelper(CustomSubscriptionEvent event) {
		super(event, Appointment.class);
	}

	/**
	 * Gets the Candidate for the event, if candidate == null then makes api call, otherwise returns candidate
	 * instance variable.
	 * 
	 * @return the Candidate connected to the event
	 */
	public Appointment getAppointment() {
        return getEntity();
    }

	public Candidate getCandidate() {
		if (candidate == null) {
			setCandidate(findCandidate(getAppointment().getCandidateReference().getId()));
		}
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	public JobOrder getJob() {
		if (job == null) {
			setJob(findJobOrder(getAppointment().getJobOrder().getId()));
		}
		return job;
	}

	public void setJob(JobOrder job) {
		this.job = job;
	}

	public ClientContact getClientContact() {
		if (clientContact == null) {
			setClientContact(findClientContact(getAppointment().getClientContactReference().getId()));
		}
		return clientContact;
	}

	public void setClientContact(ClientContact clientContact) {
		this.clientContact = clientContact;
	}

	public CorporateUser getAppointmentOwner() {
		if (appointmentOwner == null) {
			setAppointmentOwner(findCorporateUser(getAppointment().getOwner().getId()));
		}
		return appointmentOwner;
	}

	public void setAppointmentOwner(CorporateUser appointmentOwner) {
		this.appointmentOwner = appointmentOwner;
	}

	public Placement getPlacement() {
		if (placement == null) {
			setPlacement(findPlacement(getAppointment().getPlacement().getId()));
		}
		return placement;
	}

	public void setPlacement(Placement placement) {
		this.placement = placement;
	}

    @Override
    public String toString() {
        return new StringBuilder("AppointmentScheduledTaskHelper {")
                .append("\n\t\"candidate\": ")
                .append(candidate)
                .append(",\n\t\"job\": ")
                .append(job)
                .append(",\n\t\"clientContact\": ")
                .append(clientContact)
                .append(",\n\t\"appointmentOwner\": ")
                .append(appointmentOwner)
                .append(",\n\t\"placement\": ")
                .append(placement)
                .append('}')
                .toString();
    }
}
