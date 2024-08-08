package com.adobe.aem.tutorial.core.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.sling.api.resource.Resource;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import io.wcm.testing.mock.aem.junit5.AemContext;
import io.wcm.testing.mock.aem.junit5.AemContextExtension;

@ExtendWith(AemContextExtension.class)
class EmployeeDetailsModelTest {

    private AemContext context = new AemContext();

    private final EmployeeDetailsModel employee = new EmployeeDetailsModel();
    private Resource resource;

    @BeforeEach
    public void setup() {
        context.addModelsForClasses(EmployeeDetailsModel.class);
        context.load().json("/components/employeedetails/EmployeeDetailsModel.json", "/content");
        resource = context.resourceResolver().getResource("/content/employees/employee1");
    }

    // @Test
    // void testGetEmployeeName() {
    //     String name = employee.getName();
    //     assertEquals(resource.getValueMap().get("name"), name);
    // }

}
