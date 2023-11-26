<?php

namespace App\Http\Controllers\Profile;

use Illuminate\Support\Str;
use Illuminate\Http\Request;
use OpenAI\Laravel\Facades\OpenAI;
use App\Http\Controllers\Controller;
use Illuminate\Support\Facades\Storage;
use App\Http\Requests\UpdateAvatarRequest;

class AvatarController extends Controller
{
    public function update(UpdateAvatarRequest $request)
    {
        // Simpan avatar baru ke dalam penyimpanan
        $path = Storage::disk('public')->put('avatars', $request->file('avatar'));

        // Hapus avatar lama jika ada
        if ($oldAvatar = $request->user()->avatar) {
            Storage::disk('public')->delete($oldAvatar);
        }

        // Perbarui avatar pengguna dengan yang baru
        auth()->user()->update(['avatar' => $path]);

        // Redirect kembali ke halaman edit profil dengan pesan sukses
        return redirect(route('profile.edit'))->with('message', 'Avatar is updated');
    }

    public function generate(Request $request)
    {
        // Meminta OpenAI untuk membuat avatar baru
        $result = OpenAI::images()->create([
            "prompt" => 'Membuat Avatar Untuk Profil User',
            'n'      => 1,
            'size'   => "256x256",
        ]);

        // Mendapatkan konten dari avatar yang dihasilkan oleh OpenAI
        $contents = file_get_contents($result->data[0]->url);

        // Menyimpan avatar baru dengan nama file acak
        $filename = Str::random(25);
        if ($oldAvatar = $request->user()->avatar) {
            Storage::disk('public')->delete($oldAvatar);
        }
        Storage::disk('public')->put("avatars/$filename.jpg", $contents);

        // Memperbarui avatar pengguna dengan yang baru
        auth()->user()->update(['avatar' => "avatars/$filename.jpg"]);

        // Redirect kembali ke halaman edit profil dengan pesan sukses
        return redirect(route('profile.edit'))->with('message', 'Avatar is updated');
    }
}
