package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberSteps {

	@Given("user wants to select car type {string} from app")
	public void user_wants_to_select_car_type_from_app(String string) {
		System.out.println("step1");
	}

	@When("user selects the car {string} and pick up point {string} and drop location {string}")
	public void user_selects_the_car_and_pick_up_point_and_drop_location(String string, String string2,
			String string3) {
		System.out.println("step2");
	}

	@Then("driver starts journey")
	public void driver_starts_journey() {
		System.out.println("step3");
	}

	@Then("driver ends the journey")
	public void driver_ends_the_journey() {
		System.out.println("step4");
	}

	@Then("user pays {int} USD")
	public void user_pays_usd(Integer int1) {
		System.out.println("step5");
	}

}
