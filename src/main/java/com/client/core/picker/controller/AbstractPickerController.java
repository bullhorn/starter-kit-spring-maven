package com.client.core.picker.controller;

import com.bullhornsdk.data.model.response.list.ListWrapper;
import com.bullhornsdk.data.model.response.list.StandardListWrapper;
import com.client.core.base.tools.web.JsonConverter;
import com.client.core.picker.model.view.JsonIdName;
import com.client.core.picker.model.wrapper.standard.StandardPickerRequestWrapper;
import com.client.core.picker.service.PickerService;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

public abstract class AbstractPickerController<T extends JsonIdName> {
	public final static String JSONP = "application/javascript;charset=UTF-8";

    private final Logger log = Logger.getLogger(getClass());

	private final JsonConverter jsonConverter;
	private final PickerService<T> pickerService;

	protected AbstractPickerController(PickerService<T> pickerService, JsonConverter jsonConverter) {
		super();
		this.jsonConverter = jsonConverter;
		this.pickerService = pickerService;
	}

	@RequestMapping(value = { "" }, method = RequestMethod.GET, produces = { JSONP })
	@ResponseStatus(value = HttpStatus.OK)
	@ResponseBody
	public String getData(@ModelAttribute StandardPickerRequestWrapper wrapper) {
	    try {
            ListWrapper<T> result = pickerService.getData(wrapper);

            return assembleResponse(result, wrapper);
        } catch(RuntimeException e) {
            log.error("Error getting picker data", e);

            return assembleResponse(null, wrapper);
        }
	}

	@RequestMapping(value = { "/prepopulate" }, method = RequestMethod.GET, produces = { JSONP })
	@ResponseStatus(value = HttpStatus.OK)
	@ResponseBody
	public String getInitialValue(@ModelAttribute StandardPickerRequestWrapper wrapper) {
        try {
            ListWrapper<T> result = pickerService.getInitialValue(wrapper);

            return assembleResponse(result, wrapper);
        } catch(RuntimeException e) {
            log.error("Error getting picker data", e);

            return assembleResponse(null, wrapper);
        }
	}

	protected String assembleResponse(ListWrapper<T> result, StandardPickerRequestWrapper wrapper) {
	    String jsonResponse;

	    if(result == null) {
	        result = new StandardListWrapper();
            result.setStart(0);
            result.setCount(0);
            result.setTotal(0);

            jsonResponse = jsonConverter.convertEntityToJsonString(result);
        } else {
            jsonResponse = jsonConverter.convertEntityToJsonString(result);
        }

		jsonResponse = StringUtils.join(wrapper.getCallback(), "(", jsonResponse, ")");

		return jsonResponse;
	}

}
