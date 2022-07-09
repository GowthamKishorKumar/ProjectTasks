package org.task.maven.MavenTasks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {
	public static WebDriver driver;
	public static void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();}

	public static void loadUrl(String url) {
		driver.get(url);}

	public WebElement findElementBYId(String id) {
		WebElement element = driver.findElement(By.id(id));
		return element; }


	public WebElement findElementBYName(String name) {
		WebElement element = driver.findElement(By.name(name));
		return element; }


	public WebElement findElementBYClass(String className) {
		WebElement element = driver.findElement(By.className(className));
		return element; }

	public WebElement findElementBYXpath(String xpathExpression) {
		WebElement element = driver.findElement(By.xpath(xpathExpression));
		return element; }

	public String fileData(String sheet1, int rowNo, int cellNo) throws IOException {
		String res= null;
		File file = new File("C:\\Users\\god\\eclipse-workspace\\MavenTasks\\Excel\\sheet.xlsx");
		FileInputStream stream= new FileInputStream(file);
		@SuppressWarnings("resource")
		Workbook wb = new XSSFWorkbook(stream);
		Sheet sheet = wb.getSheet(sheet1);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		CellType type = cell.getCellType();

		switch(type) {
		case STRING: res = cell.getStringCellValue();break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date value = cell.getDateCellValue();
				SimpleDateFormat dateformat = new SimpleDateFormat("dd-MMMM-yyyy");
				res = dateformat.format(value);}else{
					double numericCellValue=cell.getNumericCellValue();
					BigDecimal valueof = BigDecimal.valueOf(numericCellValue);
					res= valueof.toString();break;}
		default: break;}
		return res;}

	public void insertValue(WebElement element,String keysToSend) {
		element.sendKeys(keysToSend);}

	public void click(WebElement element) {
		element.click();}

	public static void closeAll() {
		driver.quit();}

	public static void closeCurrent() {
		driver.close();}

	public static void maximize() {
		driver.manage().window().maximize();}

	public void selectOption( WebElement element, String value) {
		Select sel = new Select(element);
		sel.selectByValue(value);}
	


	public String getText(WebElement element) {
		String text = element.getText();
		return text;}

	public String getAttribute(WebElement element) {
		String text = element.getAttribute("value");
		return text;}





}
