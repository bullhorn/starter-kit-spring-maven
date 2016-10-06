define(['swig', 'text!${applicationRoot}/templates/example.html'], function(swig, example) {
    var configMap = {
        example: example
    };

    var loaderMap = {};

    $.each(configMap, function(name, html) {
        loaderMap['/'+name] = html;
    });

    swig.setDefaults({
        varControls: ['<%=', '%>'],
        loader: swig.loaders.memory(loaderMap)
    });

    var templates = {};

    $.each(configMap, function(name, html) {
        templates[name] = swig.compile(html);
    });

    return templates;
});