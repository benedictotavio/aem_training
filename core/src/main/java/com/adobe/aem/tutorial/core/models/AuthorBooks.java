package com.adobe.aem.tutorial.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class)
public class AuthorBooks {

    @ValueMapValue
    private String[] books;

    public String[] getBooks() {
        return books != null ? books : new String[0];
    }
}
