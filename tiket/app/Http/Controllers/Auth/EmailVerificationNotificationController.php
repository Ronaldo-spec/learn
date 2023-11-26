<?php

namespace App\Http\Controllers\Auth;

use App\Http\Controllers\Controller;
use App\Providers\RouteServiceProvider;
use Illuminate\Http\RedirectResponse;
use Illuminate\Http\Request;

class EmailVerificationNotificationController extends Controller
    {
    /**
     * Mengirim notifikasi verifikasi email baru.
     */
    public function store(Request $request): RedirectResponse
        {
        // Jika email pengguna sudah terverifikasi, arahkan ke halaman tujuan
        if($request->user()->hasVerifiedEmail()) {
            return redirect()->intended(RouteServiceProvider::HOME);
            }

        // Kirim notifikasi verifikasi email baru
        $request->user()->sendEmailVerificationNotification();

        // Kembali ke halaman sebelumnya dengan pesan sukses
        return back()->with('status', 'link-verifikasi-terkirim');
        }
    }
