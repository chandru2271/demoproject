package stepdefinition;

import java.util.Map;
import java.util.Map.Entry;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

public class MapDataTable {
	@Given("user sending the data with header")
	public void user_sending_the_data_with_header(DataTable dataTable) {
	   Map<String, String> asMap = dataTable.asMap();
		
		for(Entry<String, String> a:asMap.entrySet()) {
			System.out.println(a.getKey());
			System.out.println(a.getValue());
		}
	}


}
