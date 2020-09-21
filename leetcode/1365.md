# Question

 1365. How Many Numbers Are Smaller Than the Current Number

# Solutions

## Ruby
 ```ruby
 def smaller_numbers_than_current(nums)
    nums.map{ |num| nums.count{ |val| val < num } }
 end
 ```
