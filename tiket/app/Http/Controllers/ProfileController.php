<?php

namespace App\Http\Controllers;

use Illuminate\View\View;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Auth;
use Illuminate\Http\RedirectResponse;
use Illuminate\Support\Facades\Redirect;
use App\Http\Requests\ProfileUpdateRequest;

class ProfileController extends Controller
    {
    /**
     * Display the user's profile form.
     */
    public function edit(Request $request): View
        {
        // Mengembalikan tampilan formulir profil dengan data pengguna
        return view('profile.edit', [
            'user' => $request->user(),
        ]);
        }

    /**
     * Update the user's profile information.
     */
    public function update(ProfileUpdateRequest $request): RedirectResponse
        {
        // Mengisi model pengguna dengan data terverifikasi dan menyimpannya
        $request->user()->fill($request->validated());

        // Jika email berubah, atur ulang verifikasi email
        if($request->user()->isDirty('email')) {
            $request->user()->email_verified_at = null;
            }

        $request->user()->save();

        // Mengarahkan kembali ke halaman edit profil dengan pesan sukses
        return Redirect::route('profile.edit')->with('status', 'profile-updated');
        }

    /**
     * Delete the user's account.
     */
    public function destroy(Request $request): RedirectResponse
        {
        // Validasi password saat menghapus akun
        $request->validateWithBag('userDeletion', [
            'password' => ['required', 'current-password'],
        ]);

        // Mendapatkan pengguna yang sedang login
        $user = $request->user();

        // Logout pengguna
        Auth::logout();

        // Menghapus akun pengguna
        $user->delete();

        // Invalidate session dan regenerasi token
        $request->session()->invalidate();
        $request->session()->regenerateToken();

        // Mengarahkan ke halaman utama setelah menghapus akun
        return Redirect::to('/');
        }
    }
