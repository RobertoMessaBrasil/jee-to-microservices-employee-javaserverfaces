package robertomessabrasil.jeetoms.employee;

import java.io.IOException;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.apache.hc.client5.http.fluent.Request;
import org.apache.hc.client5.http.fluent.Response;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@ManagedBean(name = "employeeData", eager = true)
public class EmployeeData {

	public List<Employee> getEmployees() throws ClassNotFoundException, IOException {

		String json = this.getEmployeesFromApi();

		List<Employee> employees = this.getEmployeesFromJson(json);

		return employees;
	}

	private String getEmployeesFromApi() throws IOException {

		final String url = FacesContext.getCurrentInstance().getExternalContext().getInitParameter("employeeApiUrl");

		Response response = Request.get(url).execute();

		return response.returnContent().asString();

	}

	private List<Employee> getEmployeesFromJson(String json) throws JsonMappingException, JsonProcessingException {

		return new ObjectMapper().readValue(json, new TypeReference<List<Employee>>() {
		});

	}

}