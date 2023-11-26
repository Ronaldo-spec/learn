const persegi = {
    luas: (sisi) => {
        const luasPersegi = sisi * sisi;
        return luasPersegi;
    },
    keliling: (sisi) => {
        const kelilingPersegi = sisi * 4;
        return kelilingPersegi;
    },
};

const inputSisi = document.getElementById('sisi');
const buttonLuasPersegi = document.getElementById('luas');
const buttongKelilingPersegi = document.getElementById('keliling');
const teksHasilLuas = document.getElementById('hasilLuas');
const teksHasilKeliling = document.getElementById('hasilKeliling');

buttonLuasPersegi.addEventListener('click', () => {
    const sisi = Number(inputSisi.value);
    if (sisi) {
        const hasil = persegi.luas(sisi);
        teksHasilLuas.textContent = 'Luas dari persegi tersebut adalah: ' +hasil;
    } else {
        alert('Silahkan masukkan panjang sisinya terlebih dahulu');
    }
});

buttongKelilingPersegi.addEventListener('click', () => {
    const sisi = Number(inputSisi.value);
    if (sisi) {
        const hasil = persegi.keliling(sisi);
        teksHasilKeliling.textContent = 'Keliling dari persegi tersebut adalah: ' +hasil;
    } else {
        alert('Silahkan masukkan panjang sisinya terlebih dahulu');
    }
});

function eraseText(){
    document.getElementById("sisi").value="";
    //document.getElementsByClassName("hasilHitung").remove();
    //document.getElementById("hasilLuas").value="";
    document.getElementById("hasilLuas").innerHTML = "";
    document.getElementById("hasilKeliling").innerHTML = "";
}


