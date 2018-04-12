<?php
/**
 * Created by PhpStorm.
 * User: OmarHammoud
 * Date: 2018-04-11
 * Time: 2:14 PM
 */
namespace App\Mongo;
class ServiceProvider extends \Illuminate\Support\ServiceProvider {
    protected $defer = true;
    public function register() {
        $this->app->singleton('mongo', function($app) {
            $config = $app->make('config');
            $uri = $config->get('services.mongo.uri');
            $uriOptions = $config->get('services.mongo.uriOptions');
            $driverOptions =
                $config->get('services.mongo.driverOptions');
            return new Service($uri, $uriOptions, $driverOptions);
        });
    }
    public function provides() {
        return ['mongo'];
    }
}