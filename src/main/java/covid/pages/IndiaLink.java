package covid.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import covid.base.driverFactory;

public class IndiaLink extends driverFactory {
	
	public IndiaLink() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//div[@class='level-item is-cherry'])//h1")
	WebElement confirm;
	
	@FindBy(xpath="(//div[@class='level-item is-blue'])//h1")
	WebElement active;
	
	@FindBy(xpath="(//div[@class='level-item is-green'])//h1")
	WebElement recovered;
	
	@FindBy(xpath="(//div[@class='level-item is-gray'])//h1")
	WebElement deceased;
	
	@FindBy(xpath="//span[contains(text(),'India')]")
	WebElement indiaLink;
	
	public void clickIndiaLink() {
		indiaLink.click();
	}
	
	public void confirmedCase() {
		try {
			if(confirm != null) {
				String getCount = confirm.getText();
				System.out.println("Confirmed case in India: "+getCount);
			}
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}
	
	public void activeCase() {
		try {
			if(active != null) {
				String getCount = active.getText();
				System.out.println("Active case in India: "+getCount);
			}
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}
	
	public void recoveredCase() {
		try {
			if(recovered != null) {
				String getCount = recovered.getText();
				System.out.println("Recovered case in India: "+getCount);
			}
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
		
	public void deceasedCase() {
		try {
			if(deceased != null) {
				String getCount = deceased.getText();
				System.out.println("deceased case in India: "+getCount);
			}
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}

}
