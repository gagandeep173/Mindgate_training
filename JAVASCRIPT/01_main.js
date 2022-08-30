// alert('Hello From Javascript!!!!')

// document.getElementById("message").innerHTML = "This is from Javascript!!";

// function greet(){
//     document.getElementById("message").innerHTML = "Happy Ganesh Chaturthi";
// }

//  a = 10;
//  b = 20;
//  c = a + b;
// document.getElementById("message").innerHTML="Addition of " + a + " and " + b + " is " + c;

//  x=10;
//  let y=10;
// console.log("value of x= "+x);
// console.log("value of y= "+y);
// {
//      x=20;
//      let y=20;
//     console.log("Value of x= "+x);
//     console.log("value of y= "+y);
// }
// console.log("Value of x=" +x);
// console.log("value of y= "+y);

// function greetuser(){
//     let username = document.getElementById("username").value;
    
   
// }
// function Add()
// {
//     let num1 = parseInt(document.getElementById("num1").value);
//     let num2 = parseInt(document.getElementById("num2").value);
//     let num3=num1+num2;
//     document.getElementById("message").innerHTML = "Addition  is " + num3;
// }

// function Sub(){
//     let num1 = parseInt(document.getElementById("num1").value);
//     let num2 = parseInt(document.getElementById("num2").value);
//     let num3=num1-num2;
//     document.getElementById("message").innerHTML = "Subtraction  is " + num3;
// }

// function Mul(){
//     let num1 = parseInt(document.getElementById("num1").value);
//     let num2 = parseInt(document.getElementById("num2").value);
//     let num3=num1*num2;
//     document.getElementById("message").innerHTML = "Multiplication  is " + num3;
// }
// function Div(){
//     let num1 = parseInt(document.getElementById("num1").value);
//     let num2 = parseInt(document.getElementById("num2").value);
//     let num3=num1/num2;
//     document.getElementById("message").innerHTML = "Division  is " + num3;
// }

// const cars = ['Getz Prime','Honda Amaze','i20','Breeza'];
// document.getElementById('message').innerHTML = cars;

// var date = new Date();
// document.getElementById('fulldate').innerHTML = date;
// switch(date.getDay())
// {
//     case 1:
//         document.getElementById('day').innerHTML = "Monday";
//         break;
//         case 2:
//             document.getElementById('day').innerHTML = "Tuesday";
//             break;
//             case 3:
//                 document.getElementById('day').innerHTML = "Wednesday";
//                 break;
//                 default:
//                     break;
// }
// // document.getElementById('day').innerHTML = date.getDate();

// switch(date.getMonth()+1)
// {
//     case 1:
//     document.getElementById('month').innerHTML = "January";
//     break;
//     case 2:
//     document.getElementById('month').innerHTML = "Feb";
//     break;
//     case 3:
//     document.getElementById('month').innerHTML = "Mar";
//     break;
//     case 4:
//     document.getElementById('month').innerHTML = "Apr";
//     break;
//     case 5:
//     document.getElementById('month').innerHTML = "May";
//     break;
//     case 6:
//     document.getElementById('month').innerHTML = "Jun";
//     break;
//     case 7:
//     document.getElementById('month').innerHTML = "Jul";
//     break;
//     case 8:
//     document.getElementById('month').innerHTML = "Aug";
//     break;
//     default:
//         break;

// }
// // document.getElementById('month').innerHTML = date.getMonth() + 1;
// document.getElementById('year').innerHTML = date.getFullYear();
// document.getElementById('hours').innerHTML = date.getHours();
// document.getElementById('minutes').innerHTML = date.getMinutes();
// document.getElementById('seconds').innerHTML = date.getSeconds();


// const cars = ['Getz Prime','Honda Amaze','i20','Breeza'];
// let length=cars.length;
// let text="";
// for(let i=0;i<length;i++)
// {
//     text = text + " Car Name is : "+ cars[i] + "<br>";
// }
// document.getElementById('message').innerHTML = text;

// const cars = ['Getz Prime','Honda Amaze','i20','Breeza'];
// let text = "";
// for(let i in cars)
// {
//     text = text + "Car Name is:" + cars[i] + "<br>";
// }
// document.getElementById("message").innerHTML = text;

// const cars = ['Getz Prime','Honda Amaze','i20','Breeza'];
// let text="";
// for (let car of cars) {
//     text = text + "Car is: " + car + "<br>";
// }
// document.getElementById("message").innerHTML = text;

function validate(){
    alert('Validate method is called!!!');
    if(document.User_Details.username.value == "")
    {
        alert("Please provide user name!");
        document.User_Details.username.focus();
        return false;
    }
    if(document.User_Details.email.value == "")
    {
        alert("Please provide email!");
        document.User_Details.email.focus();
        return false;
    }
    if(document.User_Details.Zipcode.value == "")
    {
        alert("Please provide Zipcode!");
        document.User_Details.Zipcode.focus();
        return false;
    }
    if(document.User_Details.country.value == -1)
    {
        alert("Please provide country!");
        document.User_Details.country.focus();
        return false;
    }
    return true;
}