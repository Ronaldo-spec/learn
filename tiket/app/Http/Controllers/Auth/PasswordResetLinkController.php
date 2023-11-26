<?php

namespace App\Http\Controllers\Auth;

use App\Http\Controllers\Controller;
use Illuminate\Http\RedirectResponse;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Password;
use Illuminate\View\View;

class PasswordResetLinkController extends Controller
{
    /**
     * Menampilkan tampilan permintaan reset password.
     */
    public function create(): View
    {
        return view('auth.forgot-password');
    }

    /**
     * Mengelola permintaan link reset password yang masuk.
     *
     * @throws \Illuminate\Validation\ValidationException
     */
    public function store(Request $request): RedirectResponse
    {
        $request->validate([
            'email' => ['required', 'email'],
        ]);

        $status = Password::sendResetLink(
            $request->only('email')
        );

        return $status == Password::RESET_LINK_SENT
                    ? back()->with('status', __('Link reset password telah dikirim'))
                    : back()->withInput($request->only('email'))
                            ->withErrors(['email' => __('Gagal mengirimkan link reset password')]);
    }
}
