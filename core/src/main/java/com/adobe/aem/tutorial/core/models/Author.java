package com.adobe.aem.tutorial.core.models;

import javax.annotation.PostConstruct;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Required;
import org.apache.sling.models.annotations.Via;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.apache.sling.models.annotations.injectorspecific.RequestAttribute;
import org.apache.sling.models.annotations.injectorspecific.ResourcePath;
import org.apache.sling.models.annotations.injectorspecific.ScriptVariable;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.day.cq.search.QueryBuilder;
import com.day.cq.wcm.api.Page;
import org.apache.sling.api.resource.Resource;

@Model(adaptables = SlingHttpServletRequest.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Author {

    private final Logger logger = LoggerFactory.getLogger(Author.class);

    @OSGiService
    QueryBuilder queryBuilder;

    @ScriptVariable
    private Page currentPage;

    @ValueMapValue
    @Required
    private String fname;

    @ValueMapValue
    @Default(values = "blank")
    private String lname;

    @ValueMapValue(name = "jcr:primaryType")
    private String type;

    @RequestAttribute(name = "reqAttribute")
    private String reqAttribute;

    @ResourcePath(path = "/content/practice/us/en/pratice-aem-page")
    @Via("resource")
    Resource resourcePage;

    @PostConstruct
    protected void init() {
        logger.debug("Inside Init {}, {}, {}, {}", fname, lname, currentPage.getTitle(), resourcePage.getPath());
    }

    public String getFirstName() {
        return fname;
    }

    public String getLastName() {
        return lname;
    }

    public String getType() {
        return type;
    }

    public String getPageTitle() {
        return currentPage.getTitle();
    }

    public String getRequestAttribute() {
        return reqAttribute;
    }

    public String getHomePageName() {
        return resourcePage.getName();
    }
}