package com.client.core.controller;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.not;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;

import com.client.WebBaseTest;
import com.client.core.base.tools.web.MediaTypes;

public class TestFormTriggerController extends WebBaseTest {

	private static final String ERROR_STRING = ",\"error\":";

	// ***********************************************************
	// Test Candidate Form Trigger
	// ***********************************************************

	/**
	 * Add
	 * 
	 * Verifies that get method is not allowed.
	 * 
	 * Verifies that request fails without userId and corpId.
	 * 
	 * Tests if the request returns 200 status, json content and did not error. An error field in the json return value means an
	 * exception was caught in the form trigger.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testAddCandidate() throws Exception {
		getMockMvc().perform(get("/formtrigger/candidate/add")).andExpect(status().isMethodNotAllowed());

		getMockMvc().perform(post("/formtrigger/candidate/add")).andExpect(status().isBadRequest());

		getMockMvc().perform(post("/formtrigger/candidate/add").param("ft.userId", "34").param("ft.corpId", "2774"))
				.andExpect(status().isOk()).andExpect(content().contentType(MediaTypes.JSON))
				.andExpect(content().string(not(containsString(ERROR_STRING))));

	}

	/**
	 * 
	 * Edit Candidate Verifies that get method is not allowed.
	 * 
	 * Verifies that request fails without userId and corpId.
	 * 
	 * Tests if the request returns 200 status, json content and did not error. An error field in the json return value means an
	 * exception was caught in the form trigger.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testEditCandidate() throws Exception {
		getMockMvc().perform(get("/formtrigger/clientcontactcandidate/edit")).andExpect(status().isMethodNotAllowed());

		getMockMvc().perform(post("/formtrigger/clientcontactcandidate/edit")).andExpect(status().isBadRequest());

		getMockMvc()
				.perform(
						post("/formtrigger/clientcontactcandidate/edit").param("ft.userId", "34").param("ft.corpId", "2774")
								.param("clientRestrictionBits", "1")).andExpect(status().isOk())
				.andExpect(content().contentType(MediaTypes.JSON)).andExpect(content().string(not(containsString(ERROR_STRING))));
	}

	// ***********************************************************
	// Test Client Contact Form Trigger
	// ***********************************************************

	/**
	 * Add Client Contact
	 * 
	 * Verifies that get method is not allowed.
	 * 
	 * Verifies that request fails without userId and corpId.
	 * 
	 * Tests if the request returns 200 status, json content and did not error. An error field in the json return value means an
	 * exception was caught in the form trigger.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testAddClientContact() throws Exception {
		getMockMvc().perform(get("/formtrigger/clientcontact/add")).andExpect(status().isMethodNotAllowed());

		getMockMvc().perform(post("/formtrigger/clientcontact/add")).andExpect(status().isBadRequest());

		getMockMvc().perform(post("/formtrigger/clientcontact/add").param("ft.userId", "34").param("ft.corpId", "2774"))
				.andExpect(status().isOk()).andExpect(content().contentType(MediaTypes.JSON))
				.andExpect(content().string(not(containsString(ERROR_STRING))));
	}

	/**
	 * 
	 * Edit Client Contact
	 * 
	 * Verifies that get method is not allowed.
	 * 
	 * Verifies that request fails without userId and corpId.
	 * 
	 * Tests if the request returns 200 status, json content and did not error. An error field in the json return value means an
	 * exception was caught in the form trigger.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testEditClientContact() throws Exception {
		getMockMvc().perform(get("/formtrigger/clientcontactcandidate/edit")).andExpect(status().isMethodNotAllowed());

		getMockMvc().perform(post("/formtrigger/clientcontactcandidate/edit")).andExpect(status().isBadRequest());

		getMockMvc()
				.perform(
						post("/formtrigger/clientcontactcandidate/edit").param("ft.userId", "34").param("ft.corpId", "2774")
								.param("candidateRestrictionBits", "1")).andExpect(status().isOk())
				.andExpect(content().contentType(MediaTypes.JSON)).andExpect(content().string(not(containsString(ERROR_STRING))));
	}

	// ***********************************************************
	// Test Client Corporation Form Trigger
	// ***********************************************************

	/**
	 * Add Client Corporation
	 * 
	 * Verifies that get method is not allowed.
	 * 
	 * Verifies that request fails without userId and corpId.
	 * 
	 * Tests if the request returns 200 status, json content and did not error. An error field in the json return value means an
	 * exception was caught in the form trigger.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testAddClientCorporation() throws Exception {
		getMockMvc().perform(get("/formtrigger/clientcorporation/add")).andExpect(status().isMethodNotAllowed());

		getMockMvc().perform(post("/formtrigger/clientcorporation/add")).andExpect(status().isBadRequest());

		getMockMvc().perform(post("/formtrigger/clientcorporation/add").param("ft.userId", "34").param("ft.corpId", "2774"))
				.andExpect(status().isOk()).andExpect(content().contentType(MediaTypes.JSON))
				.andExpect(content().string(not(containsString(ERROR_STRING))));
	}

	/**
	 * 
	 * Edit Client Corporation Verifies that get method is not allowed.
	 * 
	 * Verifies that request fails without userId and corpId.
	 * 
	 * Tests if the request returns 200 status, json content and did not error. An error field in the json return value means an
	 * exception was caught in the form trigger.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testEditClientCorporation() throws Exception {
		getMockMvc().perform(get("/formtrigger/clientcorporation/edit")).andExpect(status().isMethodNotAllowed());

		getMockMvc().perform(post("/formtrigger/clientcorporation/edit")).andExpect(status().isBadRequest());

		getMockMvc().perform(post("/formtrigger/clientcorporation/edit").param("ft.userId", "34").param("ft.corpId", "2774"))
				.andExpect(status().isOk()).andExpect(content().contentType(MediaTypes.JSON))
				.andExpect(content().string(not(containsString(ERROR_STRING))));
	}

	// ***********************************************************
	// Test Job Form Trigger
	// ***********************************************************

	/**
	 * Add Job
	 * 
	 * Verifies that get method is not allowed.
	 * 
	 * Verifies that request fails without userId and corpId.
	 * 
	 * Tests if the request returns 200 status, json content and did not error. An error field in the json return value means an
	 * exception was caught in the form trigger.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testAddJob() throws Exception {
		getMockMvc().perform(get("/formtrigger/job/add")).andExpect(status().isMethodNotAllowed());

		getMockMvc().perform(post("/formtrigger/job/add")).andExpect(status().isBadRequest());

		getMockMvc().perform(post("/formtrigger/job/add").param("ft.userId", "34").param("ft.corpId", "2774"))
				.andExpect(status().isOk()).andExpect(content().contentType(MediaTypes.JSON))
				.andExpect(content().string(not(containsString(ERROR_STRING))));
	}

	/**
	 * 
	 * Edit Job
	 * 
	 * Verifies that get method is not allowed.
	 * 
	 * Verifies that request fails without userId and corpId.
	 * 
	 * Tests if the request returns 200 status, json content and did not error. An error field in the json return value means an
	 * exception was caught in the form trigger.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testEditJob() throws Exception {
		getMockMvc().perform(get("/formtrigger/job/edit")).andExpect(status().isMethodNotAllowed());

		getMockMvc().perform(post("/formtrigger/job/edit")).andExpect(status().isBadRequest());

		getMockMvc().perform(post("/formtrigger/job/edit").param("ft.userId", "34").param("ft.corpId", "2774"))
				.andExpect(status().isOk()).andExpect(content().contentType(MediaTypes.JSON))
				.andExpect(content().string(not(containsString(ERROR_STRING))));
	}

	// ***********************************************************
	// Test Job Submission Form Trigger
	// ***********************************************************

	/**
	 * Add Job Submission
	 * 
	 * Verifies that get method is not allowed.
	 * 
	 * Verifies that request fails without userId and corpId.
	 * 
	 * Tests if the request returns 200 status, json content and did not error. An error field in the json return value means an
	 * exception was caught in the form trigger.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testAddJobSubmission() throws Exception {
		getMockMvc().perform(get("/formtrigger/jobsubmission/add")).andExpect(status().isMethodNotAllowed());

		getMockMvc().perform(post("/formtrigger/jobsubmission/add")).andExpect(status().isBadRequest());

		getMockMvc().perform(post("/formtrigger/jobsubmission/add").param("ft.userId", "34").param("ft.corpId", "2774"))
				.andExpect(status().isOk()).andExpect(content().contentType(MediaTypes.JSON))
				.andExpect(content().string(not(containsString(ERROR_STRING))));
	}

	/**
	 * 
	 * Edit Job Submission
	 * 
	 * Verifies that get method is not allowed.
	 * 
	 * Verifies that request fails without userId and corpId.
	 * 
	 * Tests if the request returns 200 status, json content and did not error. An error field in the json return value means an
	 * exception was caught in the form trigger.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testEditJobSubmission() throws Exception {
		getMockMvc().perform(get("/formtrigger/jobsubmission/edit")).andExpect(status().isMethodNotAllowed());

		getMockMvc().perform(post("/formtrigger/jobsubmission/edit")).andExpect(status().isBadRequest());

		getMockMvc().perform(post("/formtrigger/jobsubmission/edit").param("ft.userId", "34").param("ft.corpId", "2774"))
				.andExpect(status().isOk()).andExpect(content().contentType(MediaTypes.JSON))
				.andExpect(content().string(not(containsString(ERROR_STRING))));
	}

	// ***********************************************************
	// Test Note Form Trigger
	// ***********************************************************

	/**
	 * Add Note
	 * 
	 * Verifies that get method is not allowed.
	 * 
	 * Verifies that request fails without userId and corpId.
	 * 
	 * Tests if the request returns 200 status, json content and did not error. An error field in the json return value means an
	 * exception was caught in the form trigger.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testAddNote() throws Exception {
		getMockMvc().perform(get("/formtrigger/note/add")).andExpect(status().isMethodNotAllowed());

		getMockMvc().perform(post("/formtrigger/note/add")).andExpect(status().isBadRequest());

		getMockMvc().perform(post("/formtrigger/note/add").param("ft.userId", "34").param("ft.corpId", "2774"))
				.andExpect(status().isOk()).andExpect(content().contentType(MediaTypes.JSON))
				.andExpect(content().string(not(containsString(ERROR_STRING))));
	}

	// ***********************************************************
	// Test Placement Form Trigger
	// ***********************************************************

	/**
	 * Add Placement
	 * 
	 * Verifies that get method is not allowed.
	 * 
	 * Verifies that request fails without userId and corpId.
	 * 
	 * Tests if the request returns 200 status, json content and did not error. An error field in the json return value means an
	 * exception was caught in the form trigger.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testAddPlacement() throws Exception {
		getMockMvc().perform(get("/formtrigger/placement/add")).andExpect(status().isMethodNotAllowed());

		getMockMvc().perform(post("/formtrigger/placement/add")).andExpect(status().isBadRequest());

		getMockMvc().perform(post("/formtrigger/placement/add").param("ft.userId", "34").param("ft.corpId", "2774"))
				.andExpect(status().isOk()).andExpect(content().contentType(MediaTypes.JSON))
				.andExpect(content().string(not(containsString(ERROR_STRING))));
	}

	/**
	 * Edit Placement
	 * 
	 * Verifies that get method is not allowed.
	 * 
	 * Verifies that request fails without userId and corpId.
	 * 
	 * Tests if the request returns 200 status, json content and did not error. An error field in the json return value means an
	 * exception was caught in the form trigger.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testEditPlacement() throws Exception {
		getMockMvc().perform(get("/formtrigger/placement/edit")).andExpect(status().isMethodNotAllowed());

		getMockMvc().perform(post("/formtrigger/placement/edit")).andExpect(status().isBadRequest());

		getMockMvc().perform(post("/formtrigger/placement/edit").param("ft.userId", "34").param("ft.corpId", "2774"))
				.andExpect(status().isOk()).andExpect(content().contentType(MediaTypes.JSON))
				.andExpect(content().string(not(containsString(ERROR_STRING))));
	}

	// ***********************************************************
	// Test Placement Change Request Form Trigger
	// ***********************************************************

	/**
	 * Add/Edit
	 * 
	 * Verifies that get method is not allowed.
	 * 
	 * Verifies that request fails without userId and corpId.
	 * 
	 * Tests if the request returns 200 status, json content and did not error. An error field in the json return value means an
	 * exception was caught in the form trigger.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testAddEditPlacementChangeRequest() throws Exception {
		getMockMvc().perform(get("/formtrigger/placementchangerequest/add")).andExpect(status().isMethodNotAllowed());

		getMockMvc().perform(post("/formtrigger/placementchangerequest/add")).andExpect(status().isBadRequest());

		getMockMvc().perform(post("/formtrigger/placementchangerequest/add").param("ft.userId", "34").param("ft.corpId", "2774"))
				.andExpect(status().isOk()).andExpect(content().contentType(MediaTypes.JSON))
				.andExpect(content().string(not(containsString(ERROR_STRING))));
	}

}
