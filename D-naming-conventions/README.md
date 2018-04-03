# Reading Material

- Naming conventions ~ https://www.thoughtco.com/using-java-naming-conventions-2034199

Probably the most common conventions to learn are these from the article:
Methods: Names should be in mixed case. Use verbs to describe what the method does:
```
void calculateTax()
string getSurname() 
```
Variables: Names should be in mixed case. The names should represent what the value of the variable represents:
```
string firstName
int orderNumber 
```
Only use very short names when the variables are short lived, such as in for loops:
```
for (int i=0; i<20;i++)
{
  //i only lives in here
} 
```
Constants: Names should be in uppercase.
```
static final int DEFAULT_WIDTH
static final int MAX_HEIGHT 
 ```
