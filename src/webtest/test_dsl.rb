

require "selenium-webdriver"

# Selenium doc:
#   http://www.rubydoc.info/gems/selenium-webdriver/0.0.28/Selenium/WebDriver/Driver
module TestDSL
  def test(name, &block)
    # Init the driver to control Firefox
    @driver = Selenium::WebDriver.for :firefox
    # Start the test
    block.call
  rescue Selenium::WebDriver::Error::NoSuchElementError => e
    puts "Could not find element"
    puts e.message
  ensure
    # End test
    @driver.quit
  end
  
  def go_to(url)
    @driver.navigate.to(url)    
  end

  def fill(id, value)
    element = @driver.find_element(:name, id)
    element.clear
    element.send_keys(value)
  end

  def press(id, &block)
    element = @driver.find_element(:name, id)
    element.submit
    block.call
  end

  def submit(id, &block)
    element = @driver.find_element(:id, id)
    element.submit
    block.call
  end

  # Assert methods
  def title_must_be(value)
    if @driver.title != value
      raise "Title must be '#{value}' but is '#{@driver.title}'"
    end
  end

  def page_must_contain(value)
    puts @driver.page_source
    if ! @driver.page_source.include?(value)
      raise "Page does not contain '#{value}'"
    end
  end
end

#include TestDSL

#test 'google' do
#  go_to 'http://www.google.es'

#  fill 'q', 'Champions League'
#  press 'btnK' do
#    title_must_be 'Google'
#    page_must_contain 'Real Madrid'
#    page_must_contain 'Atletico'
#  end
#end


# test 'renfe' do
#   go_to 'http://www.renfe.es'

# #  fill 'cdgoOrigen', '0071,61200,61200'
# #  fill 'cdgoDestino', '0071,MADRI,null'
#   fill 'IdOrigen', 'Murcia'
#   fill 'IdDestino', 'Madrid+(Todas)'
#   fill '__fechaIdaVisual', '21/05/2016'
#   fill '__fechaVueltaVisual', '22/05/2016'

#   submit 'datosBusqueda' do
#   end
# end

# test 'amazon' do
#   go_to 'http://www.amazon.es'

#   fill 'field-keywords', 'Ruby'

#   press 'site-search' do
#     title_must_be 'Amazon.es: Ruby'
#     page_must_contain 'Ruby on Rails'
#     page_must_contain 'Programming' 
#   end
# end
