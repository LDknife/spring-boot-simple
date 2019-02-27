package com.ld.activity.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.activiti.editor.constants.ModelDataJsonConstants;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.repository.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author:ld
 * @create:2018-12-07 15:52
 * @description:
 */
@Controller
public class ActivitiController {

    @Autowired
    private RepositoryService repositoryService;

    @Autowired
    private ObjectMapper objectMapper;

    @RequestMapping("/create")
    public void createNewModel(HttpServletResponse response) throws IOException {

        /**
         * 保存model信息到Model表中
         */
        //创建一个model
        Model model = repositoryService.newModel();

        String key = "process";
        String name = "process";
        String description = "";

        ObjectNode modelNode = objectMapper.createObjectNode();
        modelNode.put(ModelDataJsonConstants.MODEL_NAME, name);
        modelNode.put(ModelDataJsonConstants.MODEL_DESCRIPTION, description);

        model.setKey(key);
        model.setName(name);
        model.setMetaInfo(modelNode.toString());

        //保存model到ACT_RE_MODEL
        repositoryService.saveModel(model);

        String id = model.getId();
        /**
         * 创建一个空模板,保存到资源表中
         */
        ObjectNode editorNode = objectMapper.createObjectNode();
        editorNode.put("id", "canvas");
        editorNode.put("resourceId", "canvas");
        ObjectNode stencilSetNode = objectMapper.createObjectNode();
        stencilSetNode.put("namespace",
                "http://b3mn.org/stencilset/bpmn2.0#");
        editorNode.put("stencilset", stencilSetNode);
        repositoryService.addModelEditorSource(id,editorNode.toString().getBytes("utf-8"));
        response.sendRedirect("/modeler.html?modelId="+id);
    }

}
