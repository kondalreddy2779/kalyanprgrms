package selenium.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewToursLeftMenu {
@FindBy(linkText="Home")
WebElement home;
@FindBy(linkText="Flights")
WebElement flights;
@FindBy(linkText="Hotels")
WebElement hotels;
@FindBy(linkText="Car Rentals")
WebElement rents;
@FindBy(linkText="Cruises")
WebElement cruises;
@FindBy(linkText="Destinations")
WebElement destination;
@FindBy(linkText="Vacations")
WebElement vacation;

public void homeLink(){
	home.click();
}
public void flightsLink(){
	flights.click();
}
public void hotelsLink(){
	hotels.click();
}
public void carRentalLink(){
	rents.click();
}
public void cruisesLink(){
	cruises.click();
}
public void destinationLink(){
	destination.click();
}
public void vacationLink(){
	vacation.click();
}
}
