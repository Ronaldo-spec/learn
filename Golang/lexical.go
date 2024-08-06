package main

import "fmt"

func text() {
	kalimat := "ini adalah contoh pemanggilan fungsi kalimat"
	fmt.Println(kalimat)
}

func bersarang(angka int) {
	if angka > 5 {
		output := 20
		fmt.Println("karna angka input ", angka, " maka outputnya: ", output)
	} else {
		fmt.Println("karna angka input kurang yaitu ", angka)
	}
}

func outer() func() int {
	a := 10

	return func() int {
		a++
		return a
	}
}

func main() {

	text()

	bersarang(5)

	pertambahan := outer()
	fmt.Println("outer pertama muncul ", pertambahan())
	fmt.Println("piter kedua muncul ", pertambahan())
}
