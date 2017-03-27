'''
Created on Feb 25, 2017

@author: chandu
'''
from selenium import webdriver
from selenium.webdriver.remote.webelement import WebElement
#from selenium.webdriver.support.select import Select
#from selenium.webdriver.firefox.firefox_binary import FirefoxBinary
#  System.setProperty("webdriver.gecko.driver", "C:/Users/geckodriver.exe");
from selenium.webdriver.support.ui import Select
#binary = FirefoxBinary(r'C:\Program Files (x86)\Mozilla Firefox\firefox.exe')
#binary = FirefoxBinary("C:/Users/geckodriver.exe"
driver = webdriver.Chrome(executable_path="C:/Users/chromedriver.exe")

#driver = webdriver.Firefox()

driver.get("https://www.facebook.com/")
driver.find_element_by_xpath(".//*[@id='u_0_1']").send_keys("chandu")
driver.find_element_by_id("u_0_3").send_keys("badam")
driver.find_element_by_name("reg_email__").send_keys("chandu@saibersys.com")
driver.find_element_by_id("month").click()
driver.find_element_by_xpath(".//*[@id='month']/option[6]").click()
driver.find_element_by_id("day").click()
driver.find_element_by_xpath(".//*[@id='day']/option[5]").click()
driver.find_element_by_xpath(".//*[@id='u_0_k']").click()
driver.implicitly_wait(3)

actions =Select(driver.find_element_by_xpath(".//*[@id='year']").click())
actions.select_by_value("1987")
driver.find_element_by_id("u_0_h").click()

