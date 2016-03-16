package com.client.core.controller;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.header;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.io.File;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.response.file.FileMeta;
import com.bullhornsdk.data.model.response.file.FileWrapper;
import com.client.WebBaseTest;

public class TestFileHandlingController extends WebBaseTest {

    @Autowired
    private BullhornData bullhornData;

    @Test
    public void testGetFile() throws Exception {

        Integer fileId = getFileId();
        FileWrapper fileWrapper = bullhornData.getFile(Candidate.class, this.getTestEntities().getCandidateId(), fileId);
        assertFileWrapper(fileWrapper);
        String fileName = fileWrapper.getName();
        getMockMvc()
                .perform(
                        get("/files/getFile").param("entityName", "Candidate")
                                .param("entityId", this.getTestEntities().getCandidateId().toString())
                                .param("fileId", fileId.toString())).andExpect(status().isOk())
                .andExpect(header().string("Content-Disposition", containsString("attachment; filename=\"" + fileName + "\"")))
                .andExpect(content().bytes(fileWrapper.getFileContentAsByteArray()));

    }

    private Integer getFileId() {
        List<FileMeta> entityMetaFiles = bullhornData.getFileMetaData(Candidate.class, getTestEntities().getCandidateId());
        assertEntityMetaFiles(entityMetaFiles);

        FileMeta fileMeta = entityMetaFiles.get(0);
        return fileMeta.getId();
    }

    private void assertEntityMetaFiles(List<FileMeta> entityMetaFiles) {
        assertNotNull("entityMetaFiles is null", entityMetaFiles);
        assertTrue("entityMetaFiles.getFileMetas is empty", entityMetaFiles.size() > 0);
    }

    private void assertFileWrapper(FileWrapper fileWrapper) {
        assertNotNull("fileWrapper is null", fileWrapper);
        File file = fileWrapper.getFile();
        assertNotNull("file is null", file);
        byte[] fileContentAsByteArray = fileWrapper.getFileContentAsByteArray();
        assertNotNull("fileContentAsByteArray is null", fileContentAsByteArray);
    }

}
