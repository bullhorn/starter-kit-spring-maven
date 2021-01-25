package com.client.core.soap.tools.id;

import com.bullhorn.entity.appointment.AppointmentDto;
import com.bullhorn.entity.candidate.CandidateDto;
import com.bullhorn.entity.candidate.CandidateEducationDto;
import com.bullhorn.entity.candidate.CandidateReferenceDto;
import com.bullhorn.entity.candidate.CandidateWorkHistoryDto;
import com.bullhorn.entity.candidate.SendoutDto;
import com.bullhorn.entity.client.ClientContactDto;
import com.bullhorn.entity.client.ClientCorporationDto;
import com.bullhorn.entity.job.JobOrderDto;
import com.bullhorn.entity.job.JobSubmissionDto;
import com.bullhorn.entity.job.PlacementChangeRequestDto;
import com.bullhorn.entity.job.PlacementCommissionDto;
import com.bullhorn.entity.job.PlacementDto;
import com.bullhorn.entity.note.NoteDto;
import com.bullhorn.entity.task.TaskDto;
import com.bullhorn.entity.user.CorporateUserDto;
import com.bullhorn.entity.user.UserTypeDto;
import com.bullhorn.entity.userwork.UserWorkDto;
import com.client.core.soap.tools.id.standard.AppointmentEntityIdHelper;
import com.client.core.soap.tools.id.standard.CandidateEducationEntityIdHelper;
import com.client.core.soap.tools.id.standard.CandidateEntityIdHelper;
import com.client.core.soap.tools.id.standard.CandidateReferenceEntityIdHelper;
import com.client.core.soap.tools.id.standard.CandidateWorkHistoryEntityIdHelper;
import com.client.core.soap.tools.id.standard.ClientContactEntityIdHelper;
import com.client.core.soap.tools.id.standard.ClientCorporationEntityIdHelper;
import com.client.core.soap.tools.id.standard.CorporateUserEntityIdHelper;
import com.client.core.soap.tools.id.standard.JobOrderEntityIdHelper;
import com.client.core.soap.tools.id.standard.JobSubmissionEntityIdHelper;
import com.client.core.soap.tools.id.standard.NoteEntityIdHelper;
import com.client.core.soap.tools.id.standard.PlacementChangeRequestEntityIdHelper;
import com.client.core.soap.tools.id.standard.PlacementCommissionEntityIdHelper;
import com.client.core.soap.tools.id.standard.PlacementEntityIdHelper;
import com.client.core.soap.tools.id.standard.SendoutEntityIdHelper;
import com.client.core.soap.tools.id.standard.TaskEntityIdHelper;
import com.client.core.soap.tools.id.standard.UserTypeEntityIdHelper;
import com.client.core.soap.tools.id.standard.UserWorkEntityIdHelper;

public class EntityIdHelperFactory {

    /**
     * Returns the EntityIdHelper for the passed in type, the EntityIdHelper is user to get the unique id of the passed in type.
     * 
     * @param type
     * @return
     */
    public static <E extends EntityIdHelper<?, Integer>> E getEntityIdHelper(Class<?> type) {
        if (type.equals(AppointmentDto.class)) {
            return (E) AppointmentEntityIdHelper.instanceOf();
        }
        if (type.equals(CandidateDto.class)) {
            return (E) CandidateEntityIdHelper.instanceOf();
        }
        if (type.equals(CandidateEducationDto.class)) {
            return (E) CandidateEducationEntityIdHelper.instanceOf();
        }
        if (type.equals(CandidateReferenceDto.class)) {
            return (E) CandidateReferenceEntityIdHelper.instanceOf();
        }
        if (type.equals(CandidateWorkHistoryDto.class)) {
            return (E) CandidateWorkHistoryEntityIdHelper.instanceOf();
        }
        if (type.equals(ClientContactDto.class)) {
            return (E) ClientContactEntityIdHelper.instanceOf();
        }
        if (type.equals(ClientCorporationDto.class)) {
            return (E) ClientCorporationEntityIdHelper.instanceOf();
        }
        if (type.equals(CorporateUserDto.class)) {
            return (E) CorporateUserEntityIdHelper.instanceOf();
        }
        if (type.equals(JobOrderDto.class)) {
            return (E) JobOrderEntityIdHelper.instanceOf();
        }
        if (type.equals(JobSubmissionDto.class)) {
            return (E) JobSubmissionEntityIdHelper.instanceOf();
        }
        if (type.equals(NoteDto.class)) {
            return (E) NoteEntityIdHelper.instanceOf();
        }
        if (type.equals(PlacementChangeRequestDto.class)) {
            return (E) PlacementChangeRequestEntityIdHelper.instanceOf();
        }
        if (type.equals(PlacementCommissionDto.class)) {
            return (E) PlacementCommissionEntityIdHelper.instanceOf();
        }
        if (type.equals(PlacementDto.class)) {
            return (E) PlacementEntityIdHelper.instanceOf();
        }
        if (type.equals(SendoutDto.class)) {
            return (E) SendoutEntityIdHelper.instanceOf();
        }
        if (type.equals(TaskDto.class)) {
            return (E) TaskEntityIdHelper.instanceOf();
        }
        if (type.equals(UserTypeDto.class)) {
            return (E) UserTypeEntityIdHelper.instanceOf();
        }
        if (type.equals(UserWorkDto.class)) {
            return (E) UserWorkEntityIdHelper.instanceOf();
        }

        throw new IllegalArgumentException("EntityIdHelper not implemented for class: " + type
                + ". Please implement this class and add it to getEntityIdHelper in EntityIdHelperFactory.");
    }

}
