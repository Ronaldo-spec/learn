<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Models\Mahasiswa;

class mahasiswaController extends Controller
    {
    /**
     * Display a listing of the resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function index()
        {
        //menampilkan data menggunakan pagination
        $mahasiswas = mahasiswa::all(); //mengambil semua data dari tabel
        $post       = mahasiswa::orderBy("nim", "desc")->paginate(5);
        return view("index", compact("mahasiswas"));
        with('i', (request()->input('page', 1) - 1) * 5);
        }

    /**
     * Show the form for creating a new resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function create()
        {
        return view('create');
        }

    /**
     * Store a newly created resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @return \Illuminate\Http\Response
     */
    public function store(Request $request)
        {
        //validasi
        $request->validate([
            'nim'     => 'required',
            'nama'    => 'required',
            'kelas'   => 'required',
            'jurusan' => 'required',
            'hp'      => 'required',
        ]);

        // Add Data
        mahasiswa::create($request->all());

        //Kondisi jika data berhasil ditambahkan
        return redirect()->route('mahasiswas.index')
            ->with('success', 'Data berhasil ditambahkan');
        }

    /**
     * Display the specified resource.
     *
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function show($nim)
        {
        //Menampilkan detail data berdasarkan NIM
        $mahasiswa = mahasiswa::find($nim);
        return view('detail', compact('mahasiswa'));
        }

    /**
     * Show the form for editing the specified resource.
     *
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function edit($nim)
        {
        //Mengedit data berdasarkan id yang dicari
        $mahasiswa = mahasiswa::find($nim);
        return view('edit', compact('mahasiswa'));
        }

    /**
     * Update the specified resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function update(Request $request, $nim)
        {
        //
        $request->validate([
            'nim'     => 'required',
            'nama'    => 'required',
            'kelas'   => 'required',
            'jurusan' => 'required',
            'hp'      => 'required',
        ]);

        //fungsi untuk update pada data
        mahasiswa::find($nim)->update($request->all());

        //Jika data berhasil di-update, return index
        return redirect()->route('mahasiswas.index')->with('success', 'Data Berhasil di-Update');
        }

    /**
     * Remove the specified resource from storage.
     *
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function destroy($nim)
        {
        mahasiswa::find($nim)->delete();
        return redirect()->route('mahasiswas.index')
            ->with('success', 'Data Berhasil Dihapus');
        }
    }
;
