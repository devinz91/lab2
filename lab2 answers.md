Question 1
The search methods we used were a linear and a binary search for each of the Team array and list. Since the linear search only parses through the data once, it has a Big-O notation of O(n). This means the performance of the algorithm is directly proportional to the number of elements it contains. As for the binary searches, it has a notation of O(log n). Since the binary search filters out some of the data it doesn't need to be successful, its performance is better.   

Question 2
The way binary searches work is by looking in the array around the half way mark. The search will take that value and evaluate it against the search condition. If the search condition is more, it'll move on to the next value in the array. If the value is less than the search condition, it will continue searching in the opposite direction. If the array is unsorted, the binary search will look at the half way mark and determine which direction it needs to go from there. Let's say the middle value was more than the search condition, the search moves to the next increment. Now that increment is less than the search condition, so it goes back to the original value it looked at. Now it's in a loop within itself. The chances of a loop happening increase with the increase of the size of the array 

Question 3
The purpose of constructor validation is so that all the parameters that are needed are met with accurate inputs. Some things you can check are if the input is null, numbers or characters are within a given range, or any other input you may want to check. The purpose of doing so is so that any errors in arguments are caught as early as possible. This allows for very little of the execution and processing power to happen thus saving time. If an error does occur, a programmer can throw exceptions, along with text, to help the user in troubleshooting what they entered incorrectly. 


Question 4
The 'final' keyword is used when you want to restrict access to changing a variable. You would use this when you want the variable to remain constant throughout the execution of the program. The 'final' keyword can also be used with classes. This means that final classes will not be inherited to. Final methods would stop any overriding of those methods.    

Question 5
Another option to Optional is actually testing for null inputs. What Optional does is takes any possible null input and transforms it to empty. Without it, a null pointer exception would be throw. This can cause hang ups in the program. Optional is a useful way to circumvent that from happening. It's better to implement Optional than not. 

