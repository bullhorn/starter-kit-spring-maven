package com.client.core.scheduledtasks.model.helper.impl;

import com.bullhornsdk.data.model.entity.core.standard.*;
import com.client.core.scheduledtasks.model.helper.AbstractScheduledTaskHelper;
import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;

/**
 * Contains all the data needed to handle scheduled tasks automation. Once a  has been fetched using the BH api it
 * will be stored in this Traverser for subsequent automation work.
 * 
 * The allsToSaveBackToBH map will contain deep copies of relevant dtos that should be saved back to BH. The copies
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
public class TaskScheduledTaskHelper extends AbstractScheduledTaskHelper<Task> {

	private Placement placement;
	private JobOrder job;
	private JobSubmission jobSubmission;
	private Candidate candidate;
	private CorporateUser taskOwner;
	private ClientContact clientContact;

	public TaskScheduledTaskHelper(CustomSubscriptionEvent event) {
		super(event, Task.class);
	}

	public Task getTask() {
        return getEntity();
    }

	/**
	 * Gets the JoOrder for the task, if job == null then makes api call, otherwise returns job instance
	 * variable.
	 * 
	 * @return the JobOrder connected to the task
	 */
	public JobOrder getJob() {
		if (job == null) {
			setJob(findJobOrder(getTask().getJobOrder().getId()));
		}
		return job;
	}

	public void setJob(JobOrder job) {
		this.job = job;
	}



	public Placement getPlacement() {
		if (placement == null) {
			setPlacement(findPlacement(getTask().getPlacement().getId()));
		}
		return placement;
	}

	public void setPlacement(Placement placement) {
		this.placement = placement;
	}

	public JobSubmission getJobSubmission() {
		if (jobSubmission == null) {
			setJobSubmission(findJobSubmission(getTask().getJobSubmission().getId()));
		}
		return jobSubmission;
	}

	public void setJobSubmission(JobSubmission jobSubmission) {
		this.jobSubmission = jobSubmission;
	}

	public Candidate getCandidate() {
		if (candidate == null) {
			setCandidate(findCandidate(getTask().getCandidate().getId()));
		}
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	public CorporateUser getTaskOwner() {
		if (taskOwner == null) {
			setTaskOwner(findCorporateUser(getTask().getOwner().getId()));
		}
		return taskOwner;
	}

	public void setTaskOwner(CorporateUser taskOwner) {
		this.taskOwner = taskOwner;
	}

	public ClientContact getClientContact() {
		if (clientContact == null) {
			setClientContact(findClientContact(getTask().getClientContact().getId()));
		}
		return clientContact;
	}

	public void setClientContact(ClientContact clientContact) {
		this.clientContact = clientContact;
	}

    @Override
    public String toString() {
        return new StringBuilder("TaskScheduledTaskHelper {")
                .append("\n\t\"placement\": ")
                .append(placement)
                .append(",\n\t\"job\": ")
                .append(job)
                .append(",\n\t\"jobSubmission\": ")
                .append(jobSubmission)
                .append(",\n\t\"candidate\": ")
                .append(candidate)
                .append(",\n\t\"taskOwner\": ")
                .append(taskOwner)
                .append(",\n\t\"clientContact\": ")
                .append(clientContact)
                .append('}')
                .toString();
    }
}
