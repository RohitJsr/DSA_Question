// Description

// Sarvagaya is trapped in maze. The Masai command center sent him a string which decodes to come out from the maze. He is initially at (0, 0). String contains L, R, U, D denoting left, right, up and down. In each command he will traverse 1 unit distance in the respective direction.

// For example if he is at (2, 0) and the command is L he will go to (1, 0).

function runProgram(input){
    input = input.trim();
    //console.log(input);

    let dist = [ 0, 0]

    for(let i = 0; i < input.length; i++){
        if(input[i] === "L"){
            dist[0] += -1;
        }
        else if(input[i] === "R"){
            dist[0] += 1;
        }
        else if(input[i] === "U"){
            dist[1] += 1;
        }
        else if(input[i] === "D"){
            dist[1] += -1;
        }
    }

    console.log(`${dist[0]} ${dist[1]}`)
}

if (process.env.USER === "") {
    runProgram(`LLRDDR
    abc`);
} 
else if (process.env.USERNAME === "") {
    runProgram(`LLRDDR`);
}
else {
    process.stdin.resume();
    process.stdin.setEncoding("ascii");
    let read = "";
    process.stdin.on("data", function(input) {
        read += input;
    });
    process.stdin.on("end", function() {
        read = read.replace(/\n$/, "");
        read = read.replace(/\n$/, "");
        runProgram(read);
    });
    process.on("SIGINT", function() {
        read = read.replace(/\n$/, "");
        runProgram(read);
        process.exit(0);
    });
}





// Input
// Input Fomat

// Input contains a single string.

// Constraints

// Length of string <200


// Output
// Output Format

// Print the final point where he came out.


// Sample Input 1 

// LLRDDR
// Sample Output 1

// 0 -2