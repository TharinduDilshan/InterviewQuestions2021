# CALL,BIND AND APPLY IN JS

In this tutorial ,we will cover  call , apply and bind methos in javascript

## CALL
&nbsp; &nbsp; Using call method , we can do fucntion borrowing (i.e) we can borrow fucntions from other objects and use it with the data of some other objects

### EXAMPLE
```javascript
        let name = {
            first_name : "harish",
            last_name  : "kumar"
            printFullName : function(){
                console.log(`${this.first_name} ${this.last_name}`);
            }
        }

        // now we can use printFullName() of 'name' object  with any other object using call method

        let name2 = {
            first_name : "jaya",
            last_name  : "kumar" 
        }

        name.printFullName.call(name2);
        // the above line will print jaya kumar

```
However during situation like this most of the developers tend to declare the function outside the object in global scope and use the function with requried object.

```javascript
        let name = {
            first_name : "harish",
            last_name  : "kumar"
        }

         let printFullName =  (){
                console.log(`${this.first_name} ${this.last_name}`);
        }

        let name2 = {
            first_name : "jaya",
            last_name  : "kumar" 
        }

        printFullName.call(name); //harish kumar
        printFullName.call(name2); //jaya kumar

```
One can also pass parameters along with the call function

```javascript
        let name = {
            first_name : "harish",
            last_name  : "kumar"
        }
        let printFullName =  (age){
                console.log(`${this.first_name} ${this.last_name} 's age is ${age}`);
        }

        printFullName.call(name,"18"); // harish kumar's age is 18

```

## APPLY 
&nbsp; &nbsp; The apply method is same as call method but along with the refernce object other arguments are provided as an array or arraylist instead of passing as comma seperated values

```javascript
        let name = {
            first_name : "harish",
            last_name  : "kumar"
        }
        let printFullName =  (age,year){
                console.log(`${this.first_name} ${this.last_name} 's age is ${age} and studying ${year} year of college`);
        }

        printFullName.apply(name,["18","first"]); // harish kumar's age is 18 and studying first year of college

```

## BIND
&nbsp; &nbsp; Bind method is same as call method but  the difference is instead of calling the function the bind method binds the function with the specified object(the first argument) and returns us the copy of the method.

```javascript
        let name = {
            first_name : "harish",
            last_name  : "kumar"
        }
        let printFullName =  (age){
                console.log(`${this.first_name} ${this.last_name} 's age is ${age}`);
        }

        let printMyDetails = printFullName.bind(name,"18"); //returns a function
        
        // the method gets binded to name object and returns a function
        // now  we can call the returned function

        printMyDetails() ; // harish kumar's age is 18

```
Always remember that bind method never calls a function it only returns a copy the function which can be invoked later.
 

