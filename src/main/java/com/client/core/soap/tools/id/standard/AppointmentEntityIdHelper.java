package com.client.core.soap.tools.id.standard;

import com.bullhorn.entity.appointment.AppointmentDto;
import com.client.core.soap.tools.id.EntityIdHelper;

public class AppointmentEntityIdHelper implements EntityIdHelper<AppointmentDto, Integer> {

    @Override
    public Integer getEntityId(AppointmentDto entity) {
        return entity.getAppointmentID();
    }

    private AppointmentEntityIdHelper() {
        super();
    }

    public static AppointmentEntityIdHelper instanceOf() {
        return new AppointmentEntityIdHelper();
    }

}
