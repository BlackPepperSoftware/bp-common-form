/*
 * Copyright 2014 Black Pepper Software
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
