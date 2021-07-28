package com.noelia.automation.books.features.steps;
import static net.serenitybdd.rest.SerenityRest.then;
import static net.serenitybdd.rest.SerenityRest.with;
import static net.serenitybdd.rest.SerenityRest.given;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.hamcrest.Matchers.containsString;
import static net.serenitybdd.rest.SerenityRest.then;
import static net.serenitybdd.rest.SerenityRest.when;

public class BooksSteps {
    @Given("^Noelia wants to know about the BestSelling Books$")
    public void noelia_wants_to_know_about_the_books_available() throws Throwable {
        given()
                .contentType("application/json");
    }

    @When("^She looks the BestSelling History$")
    public void she_looks_the_available_books() throws Throwable {
        when().get("https://api.nytimes.com/svc/books/v3/lists/best-sellers/history.json?&api-key=a69e1cdbb16b4f23841c8f01be77f31a");
    }

    @Then("^She must see the BestSelling History$")
    public void she_must_see_the_books_available() throws Throwable {
        then().statusCode(200)
                ;
    }

    @When("She looks the BestSelling History without proper credentials")
    public void sheLooksTheBestSellingHistoryWithoutProperCredentials() throws Throwable {
        when().get("https://api.nytimes.com/svc/books/v3/lists/best-sellers/history.json?&api-key=a69e1cdbb16b");

    }


    @Then("She wont see the BestSelling History")
    public void sheWontSeeTheBestSellingHistory() throws Throwable{
        then().statusCode(401);
    }

    @Given("Noelia wants to know about the HardCover Books")
    public void noeliaWantsToKnowAboutTheHardCoverBooks() throws Throwable {
        given()
                .contentType("application/json");
    }


    @When("She looks the HardCover Collection")
    public void sheLooksTheHardCoverCollection() {
        when().get("https://api.nytimes.com/svc/books/v3/lists/current/hardcover-fiction.json?&api-key=a69e1cdbb16b4f23841c8f01be77f31a");

    }

    @Then("She must see the HardCover History")
    public void sheMustSeeTheHardCoverHistory() {
        then().statusCode(200);
    }

    @Given("Noelia wants to know about the Stephen King Reviews")
    public void noeliaWantsToKnowAboutTheStephenKingReviews() {
        given()
                .contentType("application/json");
    }

    @When("She looks the Stephen King Reviews Collection")
    public void sheLooksTheStephenKingReviewsCollection() {
        when().get("https://api.nytimes.com/svc/books/v3/reviews.json?author=Stephen+King&api-key=a69e1cdbb16b4f23841c8f01be77f31a");

    }


    @Then("She must see the Stephen King reviews Collection")
    public void sheMustSeeTheStephenKingReviewsCollection() {
        then().statusCode(200);
    }
}
