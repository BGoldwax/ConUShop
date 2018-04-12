<?php
/**
 * Created by PhpStorm.
 * User: OmarHammoud
 * Date: 2018-04-11
 * Time: 2:13 PM
 */
namespace App\Mongo;
use MongoDB\Client;
class Service {
    private $mongo;
    public function __construct($uri, $uriOptions, $driverOptions) {
        $this->mongo = new Client($uri = null, $uriOptions = [],
            $driverOptions = []);
    }
    public function get() {
        return $this->mongo;
    }
}