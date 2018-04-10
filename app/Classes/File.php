<?php

class File extends FileCaching
{


    public function __construct($name = "products.txt")
     {
         $this->setFileName($name);
         $this->buildProductCache();
     }

    public function buildProductCache() {
        parent::build($this->getFileName());
    }

    public function readCache()
    {
        return parent::read($this->getFileName());
    }

}