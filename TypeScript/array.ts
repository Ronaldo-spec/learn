var fruit1 : string = "Mango"
var fruit2 : string = "apple"
var fruit3 : string = "banana"

// cara pertama
var fruits : string[] = [fruit1, fruit2, fruit3]
console.log(fruits)

// cara kedua
var fruits2 : Array<string> = [fruit1, fruit2, fruit3]
console.log(fruits2)

//Accress Array in TypeScript
console.log(fruits[0])
console.log(fruits[1])
console.log(fruits[2])

// access array with loop

for(var i=0; i<fruits.length;i++){
    console.log(fruits[i])
}


for (var j in fruits) {
    console.log(fruits[j])
}

// array 2D

var arr2 : number[][] = [[10,20],[30,40],[50,60]]
console.log(arr2)

// access array 2D

console.log(arr2[1][1])

// access array 2D with loop
for (var i = 0; i < arr2.length;i++){
    for(var d =0; d < arr2[i].length; d++)
    console.log(arr2[i][d])
}

for (var k in arr2){
    for (var l in arr2[k]){
    console.log(arr2[k][l])
    }
}

let array1 = [1,2,3,4]
for (var val of array1) {
    console.log(val)
}