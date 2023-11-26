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
        $Mahasiswa = mahasiswa::all(); //Mengambil semua data yang ada di tabel
        $posts = mahasiswa::orderBy('nim','desc')->paginate(5);
        return view('index', compact('Mahasiswa'))->
        with('i', (request()->input('page',1)-1)*5);
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
        $request->validate([
            'nim'=> 'required',
            'nama'=> 'required',
            'kelas'=> 'required',
            'jurusan'=> 'required',
            'hp'=> 'required',
        ]);

        mahasiswa::create($request->all());

        return redirect()->route('index')->with('success','Data Berhasil Ditambahkan');
    }

    /**
     * Display the specified resource.
     *
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function show($nim)
    {
        $Mahasiswa = mahasiswa::find($nim);
        return view('detail', compact('Mahasiswa'));
    }

    /**
     * Show the form for editing the specified resource.
     *
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function edit($nim)
    {
        $Mahasiswa = mahasiswa::find($nim);
        return view('edit', compact('Mahasiswa'));   
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
        $request->validate([
            'nim'=> 'required',
            'nama'=> 'required',
            'kelas'=> 'required',
            'jurusan'=> 'required',
        ]);

        Mahasiswa::find($nim)->update($request->all());

        return redirect()->route('index')->with('success','Data Berhasil Terupdate');
    }

    /**
     * Remove the specified resource from storage.
     *
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function destroy($nim)
    {
        Mahasiswa::find($nim)->delete();
        return redirect()->route('index')->with('success','Data Berhasil Dihapus');
    }
}
