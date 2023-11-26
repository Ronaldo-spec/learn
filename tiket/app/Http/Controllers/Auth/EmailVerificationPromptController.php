<?php

namespace App\Http\Controllers\Auth;

use App\Http\Controllers\Controller;
use App\Providers\RouteServiceProvider;
use Illuminate\Http\RedirectResponse;
use Illuminate\Http\Request;
use Illuminate\View\View;

class EmailVerificationPromptController extends Controller
{
    /**
     * Menampilkan prompt verifikasi email.
     */
    public function __invoke(Request $request): RedirectResponse|View
    {
        // Jika email pengguna sudah terverifikasi, arahkan ke halaman tujuan
        return $request->user()->hasVerifiedEmail()
            ? redirect()->intended(RouteServiceProvider::HOME)
            : view('auth.verify-email');
    }
}
