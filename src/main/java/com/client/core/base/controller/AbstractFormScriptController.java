package com.client.core.base.controller;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;

import com.client.core.AppContext;
import com.client.core.base.tools.web.JsonConverter;

/**
 * Created by john.sullivan on 13/3/2017.
 */
@RequestMapping("/formscript/*")
public class AbstractFormScriptController {

    private final JsonConverter jsonConverter;

    public AbstractFormScriptController() {
        this.jsonConverter = AppContext.getApplicationContext().getBean(JsonConverter.class);
    }

    protected <T> String convert(T entity) {
        return jsonConverter.convertEntityToJsonString(entity);
    }

    protected String response(String callback, JSONObject response) {
        return new StringBuilder(callback).append("(").append(response.toString()).append(")").toString();
    }

    protected String response(String callback, String response) {
        return new StringBuilder(callback).append("(").append(response).append(")").toString();
    }

}
