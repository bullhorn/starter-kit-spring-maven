import TemplatesConfig from 'modules/templatesconfig.min';
import swig from 'swig';

const TEMPLATE_MAP = (() => {
    let loaderMap = {};
    let configMap = TemplatesConfig.get();

    for(let key in configMap) {
        loaderMap['/'+key] = configMap[key];
    }

    swig.setDefaults({
        varControls: ['<%=', '%>'],
        loader: swig.loaders.memory(loaderMap)
    });

    let templates = {};

    for(let key in configMap) {
        templates[key] = swig.compile(configMap[key]);
    }

    return templates;
})();

export default class Templates {

    static getTemplate(template) {
        return TEMPLATE_MAP[template];
    }

}