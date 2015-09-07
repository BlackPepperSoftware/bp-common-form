package uk.co.blackpepper.common.form.driver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.google.common.base.Function;
import com.google.common.collect.Lists;

import uk.co.blackpepper.common.driver.AbstractComponentDriver;
import uk.co.blackpepper.common.driver.AbstractDriver;

public class FormErrorsDriver extends AbstractComponentDriver {

	public FormErrorsDriver(AbstractDriver<?> page, WebElement element) {
		super(page, element);
	}
	
	public List<String> getAll() {
		List<WebElement> elements = element().findElements(By.className("error"));
		
		return Lists.transform(elements, new Function<WebElement, String>() {
			@Override
			public String apply(WebElement element) {
				return element.getText();
			}
		});
	}
}
