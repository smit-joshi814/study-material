i=0

# While Example

while i < 5 do
    puts "I is #{i}"
    i+=1
end

#  for example
for i in 1..5 do
 puts "i in for #{i}"
end


# do while example
i = 0
loop do
    i+=1
    puts "do while #{i}"
    if i == 5
        break
    end
end

# until loop
i=1
until i == 5 do
    puts "i in untill #{i}"
    i+=1
end

