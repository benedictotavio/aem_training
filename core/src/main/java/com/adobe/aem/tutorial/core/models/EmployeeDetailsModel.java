package com.adobe.aem.tutorial.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class)
public class EmployeeDetailsModel {
    @ValueMapValue
    private String name;

    @ValueMapValue
    private String age;

    @ValueMapValue
    private String phonenumber;

    @ValueMapValue
    private String company;

    @ValueMapValue
    private String designation;

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public String getCompany() {
        return company;
    }

    public String getDesignation() {
        return designation;
    }

    
}
