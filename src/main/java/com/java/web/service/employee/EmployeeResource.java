package com.java.web.service.employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Root resource (exposed at "resource" path)
 */
@Path("resource")
public class EmployeeResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public EmployeeModel getEmployee() {
    	EmployeeModel employeeModel = new EmployeeModel("241","Krishna",new ArrayList<Integer>());
    	employeeModel.addValue(1);
    	employeeModel.addValue(2);
    	employeeModel.addValue(3);
        return employeeModel;
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public EmployeeModel addEmployee(EmployeeModel employeeModel){
    	Map<String,EmployeeModel> map = new HashMap<String,EmployeeModel>();
    	map.put(employeeModel.getId(), employeeModel);
    	System.out.println(employeeModel);
    	return employeeModel;
    }
}
