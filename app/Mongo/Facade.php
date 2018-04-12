<?php
/**
 * Created by PhpStorm.
 * User: OmarHammoud
 * Date: 2018-04-11
 * Time: 2:15 PM
 */
namespace App\Mongo;
class Facade extends \Illuminate\Support\Facades\Facade {
    protected static function getFacadeAccessor() {
        return 'mongo';
    }
}