
require_relative 'test_dsl'

include TestDSL

test 'google' do
  go_to 'http://www.google.es'

  fill 'q', 'Champions League'
  press 'btnK' do
    title_must_be 'Google'
  end
end
