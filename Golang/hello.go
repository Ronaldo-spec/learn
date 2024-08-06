package main

import "fmt"

func penjumlahan(a, b int) int {
	return a + b
}

func main() {
	const x int = 4
	const y = 7

	fmt.Println(x + y)
	fmt.Println(y)
	fmt.Println("10 + 10 = ", 10+10)
	str1 := "sepuluh"
	str2 := "lima belas"
	kalimat := str1 + " dan " + str2
	fmt.Println(kalimat)

	jumlah := penjumlahan(8, 3)
	fmt.Println(jumlah)
}
