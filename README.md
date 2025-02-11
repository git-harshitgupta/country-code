COUNTRY CODE
------------

Their are 2 apis 
1. GET - http://localhost:8080/codes - This will give array of codes available.
2. GET - http://localhost:8080/countries -  This will give array of country available.

TO-DO-
Need to create a new api where when we pass a code using path variables it should give the corresponding country to the code.
The connection between the array of code and array of country is related by the index. So, if the index of code 1 is 0 that means the corresponding country will the index 0 item from country list.

Example 
API call - http://localhost:8080/country-code/{code}
if input 'code' = 1 then output = "USA"
if input 'code' = 27 then output = "South Africa"
