package main

import "fmt"

func swap(a,b int) (int, int){
	return a, b
}

func main() {

	var map1 map[int]int

	if map1 == nil {
		fmt.Println("map1 berhasil dibuat namun isi kosong")
	} else {
		fmt.Println("map1 kosong gagal dibuat")

	}

	map2 := map[int]string{
		1: "satu", 2: "dua", 3: "tiga",
	}

	fmt.Println(map2)

	var map3 = make(map[float64]string)
	map3[1.1] = "satu koma satu"
	map3[1.2] = "dua koma dua"

	fmt.Println(map3)

	map3[1.1] = "sepuluh"

	fmt.Println(map3)

	go arr := [3]

int{1, 2, 3} 

fmt.Println(arr[3])
}
