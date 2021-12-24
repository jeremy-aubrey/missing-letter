# Find the missing letter (pangram) 
<br/>
Find the first missing letter from the alphabet in a string. 
<br/><br/>
A solution that involves nested loops to compare each letter of the string to the letters in the alphabet is not the most effecient and elegant way to tackle this problem. Instead of iterating over the string for each letter in the alphabet, a hashmap can be used to perform the lookup in O(1) time.
