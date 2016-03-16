package com.client.core.soap.tools.id.standard;

import com.bullhorn.entity.note.NoteDto;
import com.client.core.soap.tools.id.EntityIdHelper;

public class NoteEntityIdHelper implements EntityIdHelper<NoteDto, Integer> {

    @Override
    public Integer getEntityId(NoteDto entity) {
        return entity.getNoteID();
    }

    private NoteEntityIdHelper() {
        super();
    }

    public static NoteEntityIdHelper instanceOf() {
        return new NoteEntityIdHelper();
    }

}
