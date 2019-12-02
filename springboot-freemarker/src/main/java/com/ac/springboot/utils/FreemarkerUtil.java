package com.ac.springboot.utils;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import java.io.IOException;
import java.util.Map;

/**
 * @Description: Freemarker 工具类
 * @author: zhangyadong
 * @Date: 2019/11/26 0026 下午 9:10
 * @version: V1.0
 */
public class FreemarkerUtil {

    public static String parseTpl(String viewName, Map<String, Object> params) {
        Configuration cfg = SpringContextHolder.getBean(Configuration.class);
        String html = null;
        Template t = null;
        try {
            t = cfg.getTemplate(viewName + ".ftl");
            html = FreeMarkerTemplateUtils.processTemplateIntoString(t, params);
        } catch (IOException | TemplateException e) {
            e.printStackTrace();
        }
        return html;
    }
}
