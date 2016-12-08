package com.client.core.scheduledtasks.model.helper.impl;

import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.bullhornsdk.data.model.entity.core.standard.Note;
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
public class NoteScheduledTaskHelper extends AbstractScheduledTaskHelper<Note> {

	private JobOrder job;
	private CorporateUser commentingUser;

	public NoteScheduledTaskHelper(CustomSubscriptionEvent event) {
		super(event, Note.class);
	}

	public Note getNote() {
        return getEntity();
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
        return new StringBuilder("NoteScheduledTaskHelper {")
                .append("\n\t\"job\": ")
                .append(job)
                .append(",\n\t\"commentingUser\": ")
                .append(commentingUser)
                .append('}')
                .toString();
    }
}
