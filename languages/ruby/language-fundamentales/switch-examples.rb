# Switch example one

DAY = "SUN"

case DAY
when "MON"
    puts "Hay it's #{DAY}"
when "TUE","WED","THR"
    puts "day as usual"
when "FRI"
    puts "It's #{DAY}"
when "SAT","SUN"
    puts "It's Week-end"
else 
    puts "Invalid Choice"
end


# Switch Using Range

  
percantage = 90
case percantage 
  
# using range operators .. 
when 0..32
    puts "You fail!"
when 33..40
    puts "C grade!"
when 41..60
    puts "B grade!"
else
    puts  "A grade!"
end
