Created 7/8/20...I had done a codewars a few days ago requiring me to reverse digits of an int.  
I solved by converting to string and then charAt. 

This solution solves by using modulo to strip the final character moving to the front:

    * Valence remains unchanged
    * This is a value based mathematical solution, so 1200 would become 21 instead of 0021

Solution was simple enough:

    * Looping through number...
    * Capture ones digit
    * Shorten number eliminating least significant numeral
    * Add captured number to new variable moving it to the left in each loop
    * When result is zero, break









