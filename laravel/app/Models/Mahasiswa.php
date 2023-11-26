<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Mahasiswa extends Model
{
    use HasFactory;
    //untuk mentyimpan ke tabel mahasiswa
    protected $table='mahasiswa';
    protected $primaryKey='nim';
    protected $incerement = false;
    protected $fillable = ['nim','nama','kelas','jurusan','hp','email','date'];
}
