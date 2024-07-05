a = 40
b = 50
c = 60

puts "Simple If-else example"
#  Simple If-else
if a > b && a > c
    puts "A is Greater" 
elsif b > c
    puts "B is Greater"
else
    puts "C is Greater"
end


puts "Nested If Example"
# nested If
if a > b
    if a > c
        puts "A is Greater"
    end
else
    if b > c
        puts "B is Greater"
    else
        puts "C is Greater"
    end
end



puts "Another nested If example" 

age = 18
if age < 18
    if age > 15
        puts "Demo"
    else
        puts "Access Denied"
    end
else
    puts "Full Access"
end