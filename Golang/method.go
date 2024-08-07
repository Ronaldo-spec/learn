package main

import "fmt"

type author struct {
	name      string
	branch    string
	particles int
	salary    int
	contact
}

func (a author) show() {
	fmt.Println("Penulis: ", a.name)
	fmt.Println("Gaji: ", a.salary)
	fmt.Println("email: ", a.email)
}

type contact struct {
	email string
	phone string
}

func main() {
	res := author{
		name:      "bedman",
		branch:    "Malang",
		particles: 203,
		salary:    2000000,
		contact: contact{
			email: "tes@gmail.com",
			phone: "08111111",
		},
	}

	res.show()

}
