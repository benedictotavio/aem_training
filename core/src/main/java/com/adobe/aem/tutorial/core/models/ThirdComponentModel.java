package com.adobe.aem.tutorial.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import java.util.List;

@Model(adaptables = Resource.class)
public class ThirdComponentModel {

    @ValueMapValue
    private String title;

    @ValueMapValue
    private String text;

    @ChildResource
    List<ThirdComponentListModel> list;

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public List<ThirdComponentListModel> getList() {
        return list;
    }

}
