
require_relative 'test_dsl'

include TestDSL

test 'amazon' do
  go_to 'http://www.amazon.es'
  ['Ruby', 'Python', 'Java'].each { |l|
    fill 'field-keywords', l

    press 'site-search' do
      title_must_be 'Amazon.es: Ruby'
      page_must_contain 'Ruby on Rails'
      page_must_contain 'Programming' 
    end
  }
end

#test 'google' do
#  go_to 'http://www.google.es'

#  fill 'q', 'Champions League'
#  press 'btnK' do
#    title_must_be 'Google'
#  end
#end
