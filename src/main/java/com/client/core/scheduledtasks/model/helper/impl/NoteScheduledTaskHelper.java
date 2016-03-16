package com.client.core.scheduledtasks.model.helper.impl;

import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.bullhornsdk.data.model.entity.core.standard.Note;
import com.client.core.soap.model.SubscriptionEvent;
import com.client.core.scheduledtasks.model.helper.AbstractScheduledTaskHelper;

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
 * @param <T>
 */
public class NoteScheduledTaskHelper extends AbstractScheduledTaskHelper {

	private Note note;
	private JobOrder job;
	private CorporateUser commentingUser;

	public NoteScheduledTaskHelper(SubscriptionEvent event) {
		super(event);

	}

	public Note getNote() {
		if (note == null) {
			setNote(findNote(getEvent().getEntityID()));
		}
		return note;
	}

	public void setNote(Note note) {
		this.note = note;
	}

	/**
	 * Gets the JoOrder for the note, if job == null then makes api call, otherwise returns job instance
	 * variable.
	 * 
	 * @return the JobOrder connected to the placement
	 */
	public JobOrder getJob() {
		if (job == null) {
			setJob(findJobOrder(getNote().getJobOrder().getId()));
		}
		return job;
	}

	public void setJob(JobOrder job) {
		this.job = job;
	}

	/**
	 * Gets the CorporateUser that added the note, if commentingUser == null then makes api call, otherwise returns
	 * commentingUser instance variable.
	 * 
	 * @return the CorporateUser that added the note
	 */
	public CorporateUser getCommentingUser() {
		if (commentingUser == null) {
			setCommentingUser(findCorporateUser(getNote().getCommentingPerson().getId()));
		}
		return commentingUser;
	}

	public void setCommentingUser(CorporateUser commentingUser) {
		this.commentingUser = commentingUser;
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		String NEW_LINE = System.getProperty("line.separator");
		result.append(this.getClass().getName() + " Object {" + NEW_LINE);
		result.append(" note: " + note + NEW_LINE);
		result.append(" job: " + job + NEW_LINE);
		result.append(" commentingUser: " + commentingUser + NEW_LINE);
		result.append("}");
		return result.toString();

	}

}
