<?php

use App\Models\User;
use Illuminate\Support\Facades\Auth;
use Illuminate\Support\Facades\Route;
use Laravel\Socialite\Facades\Socialite;
use App\Http\Controllers\TicketController;
use App\Http\Controllers\ProfileController;
use App\Http\Controllers\Profile\AvatarController;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/

// Route untuk halaman utama
Route::get('/', function () {
    return view('welcome');
    });

// Route untuk dashboard, hanya dapat diakses setelah login dan verifikasi email
Route::get('/dashboard', function () {
    return view('dashboard');
    })->middleware(['auth', 'verified'])->name('dashboard');

// Route untuk profil pengguna
Route::middleware('auth')->group(function () {
    // Mengedit profil pengguna
    Route::get('/profile', [ProfileController::class, 'edit'])->name('profile.edit');
    // Memperbarui informasi profil pengguna
    Route::patch('/profile', [ProfileController::class, 'update'])->name('profile.update');
    // Menghapus akun pengguna
    Route::delete('/profile', [ProfileController::class, 'destroy'])->name('profile.destroy');

    // Mengupdate avatar pengguna
    Route::patch('/profile/avatar', [AvatarController::class, 'update'])->name('profile.avatar');
    // Membuat avatar baru menggunakan OpenAI
    Route::post('/profile/avatar/ai', [AvatarController::class, 'generate'])->name('profile.avatar.ai');
    });

// Route untuk autentikasi
require __DIR__ . '/auth.php';

// Route untuk login menggunakan OAuth (GitHub)
Route::post('/auth/redirect', function () {
    return Socialite::driver('github')->redirect();
    })->name('login.github');

Route::get('/auth/callback', function () {
    // Mendapatkan informasi pengguna dari GitHub
    $user = Socialite::driver('github')->user();
    // Membuat pengguna baru jika belum terdaftar
    $user = User::firstOrCreate(['email' => $user->email], [
        'name'     => $user->name,
        'password' => 'password',
    ]);

    // Login pengguna ke dalam aplikasi
    Auth::login($user);
    return redirect('/dashboard');
    });

// Route untuk manajemen tiket
Route::middleware('auth')->group(function () {
    // CRUD untuk tiket (create, read, update, delete)
    Route::resource('/ticket', TicketController::class);
    });