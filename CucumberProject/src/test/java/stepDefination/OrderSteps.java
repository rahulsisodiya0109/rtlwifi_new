package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderSteps {

	@Given("amazon home page is open")
	public void amazon_home_page_is_open() {
		System.out.println("step1");
	}

	@Given("item list is open")
	public void item_list_is_open() {
		System.out.println("Step2");
	}

	@When("i will select item")
	public void i_will_select_item() {
		System.out.println("Step3");
	}

	@When("i will add quantity")
	public void i_will_add_quantity() {
		System.out.println("Step4");
	}

	@When("i will click on place order")
	public void i_will_click_on_place_order() {
		System.out.println("Step5");
	}

	@When("i will make payment")
	public void i_will_make_payment() {
		System.out.println("Step6");
	}

	@Then("order place successfully")
	public void order_place_successfully() {
		System.out.println("Step7");
	}

	@Then("order summary print")
	public void order_summary_print() {
		System.out.println("Step8");
	}

}
