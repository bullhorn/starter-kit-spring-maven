package com.client.core.scheduledtasks.model.helper.impl;

import com.bullhornsdk.data.model.entity.core.standard.*;
import com.client.core.scheduledtasks.model.helper.AbstractScheduledTaskHelper;
import com.client.core.scheduledtasks.model.helper.StandardEvent;

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
public class TaskScheduledTaskHelper extends AbstractScheduledTaskHelper {

	private Task task;
	private Placement placement;
	private JobOrder job;
	private JobSubmission jobSubmission;
	private Candidate candidate;
	private CorporateUser taskOwner;
	private ClientContact clientContact;

	public TaskScheduledTaskHelper(StandardEvent event) {
		super(event);

	}

	public Task getTask() {
		if (task == null) {
			setTask(findTask(getEvent().getEntityId()));
		}
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
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
		StringBuilder result = new StringBuilder();
		String NEW_LINE = System.getProperty("line.separator");
		result.append(this.getClass().getName() + " Object {" + NEW_LINE);
		result.append(" task: " + task + NEW_LINE);
		result.append(" placement: " + placement + NEW_LINE);
		result.append(" job: " + job + NEW_LINE);
		result.append(" jobSubmission: " + jobSubmission + NEW_LINE);
		result.append(" candidate: " + candidate + NEW_LINE);
		result.append(" taskOwner: " + taskOwner + NEW_LINE);
		result.append(" clientContact: " + clientContact + NEW_LINE);
		result.append("}");
		return result.toString();

	}

}
