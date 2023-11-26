<?php

namespace Database\Seeders;

use Illuminate\Database\Console\Seeds\WithoutModelEvents;
use Illuminate\Database\Seeder;
use Illuminate\Support\Facades\DB;
use Illuminate\Support\Facades\Hash;

class userName extends Seeder


{
    /**
     * Run the database seeds.
     *
     * @return void
     */
    public function run()
    {
        DB::table("users")->insert([
            'username'=> 'admin',
            'name' => 'Admin User',
            'email' => 'api@api.com',
            'password'=> Hash::make('admin'),
        ]);
    }
}
