// L1 (Intro)
// (1) Prototype , Closures , Event Loop , Async Await and many more concepts will be covered in this series . 

//                                             L2 (How JS works and execution context)
// (1)Everything in JS happens inside an Execution Context .Assume  execution context is a big box or a container in which whole JS code is executed .
// (2) memory component is AKA Variable Environment . it is a sort of an Environment in which all the variables and functions are stored as the key value pair . fig-L2,2
//      Code component is AKA Thread of Execution   . this is a place where whole JS code is executed one line at a time.
// (3) JS is a Synchronous single-threaded language . 
//         single-threaded means JS can execute only one command at a time . 
//         Synchronous means in a specific order . only go to the next line once the current line has been executed  .

//                                                 L3(How JS code is executed? and Call Stack)
// (1)execution context is created in 2 phases . first phase is known as memory creation  phase .. Second phase is AKA code execution phase . 
// (2) In first phase JS will allocate the memory to all the variables .and functions . in first phase of execution context the all variables store a value known as undefined ,all the code of function is copies into memory space where function is there . in case of function it literally stores the all function code inside the memory space . undefines is like a placeholder for variable value in JS and it is a special keyword in JS . See in fig L3, 2a.  now lets talk about code execution . In 2nd phase  JavaScript again run the code line by line and it execute the code now. Now incase of all the variables in memory space ,there value will be changed and set as what the assigned value is . Now placeholder  will change from undefined to assigned value in the code and this is happening in the phase two . At line number 6 the functions invocation takes place . Functions are the heart of the JS . In JS function behaves very differently .In JS function is like a mini-program , if you invoke a new function a brand new mini  execution context is created inside the code section of the global execution context . and this mini brand new execution context also has  an memory component and an code section . now for this mini Execution context , memory and code section will be created .In first phase ,  in memory section again all the variable name will be initilised with the undefined and function code will be copied in there if anythere .  Now in phase 2 i.e code execution phase now code is again executed line by line in the function and now values of variable is changed to ( in memory space) the assigned value .in fig 3,2b . in fig as you can see "n" is known as the argument and "num" is known as the parameter of the function. now in this  "return" keyword is there ,which states that now return the control of the program to the place where the function was invoked fig L3,2c. Now after return keyword whole execution context of that function will be deleted. in fig L3,2d .After each line is executed inside the code section the global execution context is also deleted .
// (3) call stack - 
//           all the management of execution contexts i.e creation, deletion and the control with the help of a stack. This is known as the call stack. In call stack everytime at bottom of the call stack ,there is a Global Execution Context . and after that every execution context of diff functions are queued inside a stack after GEC. and after the function returns the function values to GEC than E1 is moved out . and control goes back to the GEC fig-3a and 3b . so whenever an execution context is created it is moved into the stack and whenever an execution context is deleted it is moved out of the stack. so these call stack is only for managing the execution context . and this is how whole deletion and creation and control is managed by the JS . And finally when whole code is executed than call stack will be emptied and we are done with our JS program . 
// (4) "Call stack maintain the order of execution of execution contexts" 
//         Call Stack other names -
//         (1) call stack
//         (2) Execution context stack
//         (3) Program stack
//         (4)Runtime Stack
//         (5)Machine Stack
//         (6) Control Stack

//                                                     L4(Hoisting in JS (variables and functions))
// (1)Why we are getting answers in fig L4,1a. 
//      How can we print function as it is declared afterwards and functions call is made earlier ? (ans) because of hoisting . here x is undefined . here we can see whole function is stored in the before the function is declared fig -L4,1c .
//      Is non-defined and undefined same? (ans) No ,refer to fig -L4,1b . here x  is non defined as there is no x .
//      (Answers) Hoisting is a phenomenon in JS by which you can access these  variable and functions even before you have initilised it or you have put some value in it . you can access it without any error . if a variable is there in  a program than we can  access it anywhere in the program.

// (2) Why hoisting is behaving this way?
// (Ans) remember when ever we run a JS program an Execution context is created and it is created in two phases , first phase is the memory creation phase . so the whole concept lie here only . Even when the JS code is Executed the memory is allocated to each and every variable and function . 
// As we can see in the global scope x is initiliased to undefined keyword fig - L4,2a . here x is already been allocated memory space even before we have executed a single line of code . so even before the code has executed JS has reserved has reserved a memory for variable x and placed a special placeholder undefined to it and in case of function all code has put in . fig-L4,2b in this figure this is before executing a single code . 

// (3) DIff bewteen not-defined and undefined?
// (Ans) not-defined - if a variable is not present in the GEC than it will throw an error i.e variable is not-defined . that means x is no where initilised in the program. x is no where .
//      undefined - in first phase of memory allocation all the variables are allocates memory and initilised with the special keyword known as undefined.

// (4)What will happen in the first phase of memory allocation if we use arrow function and not the regular function? will it now copy whole code once more in memory allocation section?
// (Ans) arrow function will behave like a variable and will store undefined in it . fig - L4,4a . now in the memory allocation phase this arrow function will not be treated as a function it will be treated as a variable . but in the second phase when code execution starts than arrow function will be treated as a function . you can see the diff between arrow function and normal function memory allocation in fig-L4,4b and figL4,4c this is all before even execution of a single code .  all 3 type of function declaration we can see that only one kind of function will allocate memory as full function not as undefined in first phase .

//                                             L5(How functions work in JS ❤️ & Variable Environment)
// (1)If we have same variable name in the program than how JS will handle that scenario ?
// (Ans) fig L5,1a , 
//            lets see what's is happening behind the scene . 
//                       fig L5,1b -> before   a single line of code is run
//                       fig L5,1c  -> a new execution context is created because you are dealing with a function . and console.log will try to find out the value of x in this local memory . and if not found than it will go to its parent's variable declaration . 
//                       fig L5,1d  -> now the function execution context will be deleted and it will be pop out from the call stack . 
//                        figL5,1e -> new execution context will be created of new function . 
//                       fig L5,1f -> now we have returned back to the global execution context . now  value of x will be searched in GEC only . 

// now at last of the program GEC will also be deleted i.e removed from the call stack and program will be over.


//                                         L6(SHORTEST JS Program 🔥window & this keyword )
// (1)the shortest JS program is an empty file with js extention . this is because it has JS engine and JS is doing more in behind the scene.
// (2) in this , the file is empty thought JS engine will setup GEC and also setups the memory space . and JS also create also something known as window .
// (3) What is window in JS ?
// (Ans) window is actually a global object which is created along with the global execution context. so whenever any JS program is run global object is created ,  GEC is created, and along with the GEC a "this " variable is created . global object in case of the browsers is knowns as window .window is like a big object with lot of functions and methods . these function,method and variable are created by JS engine in the global space . 
// you can access these all these variable and functions anywhere into this JS program .fig L6,3 .  
// (4) What is this keyword?
// (Ans) just like this window , JS engine also creates "this " keyword . and at the global level this "this " points to the "window" object

// (5) where ever the JS is running there must be a JS engine there . eg in chrome it is V8 ,  in firefox it is spidermonkey . all these JS engines has this responsibility to create  global object . in case of browsers it is known as window and incase of node it is known as something else. and even thought our file is empty JS engine will create this engine . 
// (6) at the base of global level "this"==="window". so this is always created for GEC and Functional Execution Context . and at global level "this" points to the 
// global object i.e incase of browsers it is window object . fig - L6,6a  












//                                                        L7(undefined vs not defined in JS 🤔)
// (1) What is the difference between undefined and not-defined?
// (Ans) undefined is related with how JS executes the code . JS creates a GEC and allocates the memory to all the variable and functions even before a single line of code is executed . as in figL7,1a -> debuger is on and a single line is not executed but JS has reserved memory for "a" . 
//     so , not-defined is something which is not allocated memory and undefined is something which acts like a placeholder before initilisation . fig -L7,1b
// undefined is not equal to empty . undefined is a keyword it takes up its own memory but it just act like a placeholder for sometime until some value is assigned to the variable . if you never initilised a variable but had declared a variable than throught out the program that variable will contain undefined . 

// (2) something about variable ? 
// (Ans) JS is a loosely based lang . loosely based means it does not attached it's variable with the datatype means we can put string,numbers etc  in variables anytime we want . loosely typed lang is AKA weakly typed lang . and weakly does not mean that it is not a strong lang .

// (3) what is coersion?
// (Ans)converting one datatype to another.

// (4)don't do this bad practice?
// (Ans) never assign any variable undefined as it is a bad practice . it is not a healthy practice but it is not banned practice.

//                                   L8(The Scope Chain, 🔥Scope & Lexical Environment )
// (1)scope in JS is directly related to lexical environment . if you understand lexical environment than we can easily learn scope ,scope chain,clousers .

// (2) what will happen in this code fig-L8,2a ?
// (Ans). in this we are trying to access "b" from outside of the function . will it throw a error ? no, as we can access the variable "b" outside the function .

// (3)what will be the answer of this  fig-L8,3a?
// (Ans) it can again acces 10 . so,even inside the function which is inside the other function which is inside the global scope we can access "b". 

// (4)can i still access the b in this snippit fig-L8,4a ?
// (Ans) yes

// (5)can we still access "b" fig-L8,5a?
// (Ans)no

// (6) explanation of q2,3,4,5 can be given by scope?
// (Ans) scope means where you can access a specific variable or a function in our code . scope is directly dependent on lexical environment.

// (7) what is lexical envirinment?
// (Ans)  when ever an execution context is created than a lexical environment environment is also created . so lexical environment is local memory along with lexical environment of it's parent . lexical is a term used for hericary or for a sequence. in our eg - function c is lexically inside function a . and function a is lexically inside the global scope . so this is known as lexical . 

// fig- L8,7a that orange color box represent the reference to the lexical environment to the parent so along with the memory space of variable and function we also get lexical environment of the parent(that orange thing) . 

// (8) Enumerate the differences between Java and JavaScript?
// Java is a complete programming language. In contrast, JavaScript is a coded program that can be introduced to HTML pages. These two languages are not at all inter-dependent and are designed for different intent. Java is an object-oriented programming (OOPS) or structured programming languages like C++ or C, whereas JavaScript is a client-side scripting language.
















                               