package main

import "fmt"

func main() {
	var emptyArray []int

	/* numbers := [5]int{
		1, 2, 3, 4, 5,
	}

	list := []int{
		10, 9, 8, 7, 6, 5,
	}

	for i := 0; i < len(numbers); i++ {
		fmt.Print(numbers[i])
	}

	listSlice := list[1:3]
	fmt.Println()
	fmt.Println("ini array dengan slice: ", listSlice)
	*/

	//=============================================================================

	var kalimat1 = []string{
		"Salam", "Kebajikan", "Wassalam",
	}

	fmt.Println("Ini adalah array kalimat pertama: ", kalimat1)

	urutan1 := []int{
		1, 2, 3, 4, 5,
	}

	fmt.Println("Ini adalah array angka pertama: ", urutan1)

	// STRING
	kalimat_slice_1 := kalimat1[1:2]
	fmt.Println("'kebajikan' ini harusnya keluar: ", kalimat_slice_1)

	kalimat_slice_2 := kalimat1[:2]
	fmt.Println("'Salam Kebajikan' ini harusnya keluar: ", kalimat_slice_2)

	kalimat_slice_3 := kalimat1[0:]
	fmt.Println("Harusnya semua kata keluar: ", kalimat_slice_3)

}
