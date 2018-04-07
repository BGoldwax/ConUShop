@extends('layouts.modify')
@section('content')
<div class="row">
    <div class="items text-center"><span class="blueTitle">MODIFY MONITOR</span></div>
</div>

<input type="hidden" name="ElectronicType_id" value=3>

<div class="form-group">
    <label class="control-label col-sm-2" for="dimension">Dimension <br/> </label>
    <div class="col-sm-10">
        <input type="text" class="form-control" id="dimension" placeholder="Enter dimensions size (width x height x depth) ex: (32x12x5) " name="dimension" value="{{$eSToModify->dimension}}">
    </div>
</div>

<div class="form-group">
    <label class="control-label col-sm-2" for="weight">Weight</label>
    <div class="col-sm-10">
        <input type="number" min=0 class="form-control" id="weight" placeholder="Enter weight" name="weight" value="{{$eSToModify->weight}}">
    </div>
</div>


<div class="form-group">
    <label class="control-label col-sm-2" for="brand">Brand</label>
    <div class="col-sm-10">
        <input type="text" class="form-control" id="brandName" placeholder="Enter brand" name="brandName" value="{{$eSToModify->brandName}}">
    </div>
</div>

<div class="form-group">
    <label class="control-label col-sm-2" for="modelNumber">Model</label>
    <div class="col-sm-10">
        <input type="text" class="form-control" id="modelNumber" placeholder="Enter model" name="modelNumber" value="{{$eSToModify->modelNumber}}">
    </div>
</div>



<div class="form-group">
    <label class="control-label col-sm-2" for="price">Price</label>
    <div class="col-sm-10">
        <input type="number" min=0 class="form-control" id="price" placeholder="Enter price" name="price" value="{{$eSToModify->price}}">
    </div>
</div>

<div class="form-group">
    <label class="control-label col-sm-2" for="image">Upload product image</label>
    <div class="col-sm-10">
        <input type="file" name="image">
    </div>
</div>

<button type="submit" class="btn btn-success btn-block">Submit</button>
<br>
@stop