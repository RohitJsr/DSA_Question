// Description

// You are given a string S. Cut it into 2 equal halves and reverse it.

// So, suppose if you have a string "abcxyz" then after performing the above mentioned operation it becomes "cbazyx"

// If you have a string "abcdxyz", then after performing the above mentioned operation it becomes "cbadzyx"


// Input
// Input Format :

// First line of input contains the string S

// Constraints :

// Length of S <= 1000


// Output
// Print the string with the required changes


// Sample Input 1 

// abcxyz
// Sample Output 1

// cbazyx

function  solve(str)
{
    if(str.length%2==0){
   let str1=""
        for(let i=(str.length/2)-1;i>=0;i--){
            str1=str1+(str[i])
        }
        let str2=""
        for(let j=str.length-1;j>=(str.length/2);j--){
            str2=str2+str[j]
        }
        console.log(str1+str2)
    }
    
    else if(str.length%2!=0){
        
   let str1=""
        for(let i=Math.floor(str.length/2)-1;i>=0;i--){
            str1=str1+(str[i])
        }
        let str2=""
        for(let j=str.length-1;j>Math.floor(str.length/2);j--){
            str2=str2+str[j]
        }
        let str3=str[Math.floor(str.length/2)]
        console.log(str1+str3+str2)
    }
}
function runProgram(input){
 input=input.trim().split("\n")
 let str=input[0]
 solve(str)
    
}


 

if (process.env.USER === "") {
  runProgram(``);
} else {
  process.stdin.resume();
  process.stdin.setEncoding("ascii");
  let read = "";
  process.stdin.on("data", function (input) {
    read += input;
  });
  process.stdin.on("end", function () {
    read = read.replace(/\n$/, "");
    read = read.replace(/\n$/, "");
    runProgram(read);
  });
  process.on("SIGINT", function () {
    read = read.replace(/\n$/, "");
    runProgram(read);
    process.exit(0);
  });
}