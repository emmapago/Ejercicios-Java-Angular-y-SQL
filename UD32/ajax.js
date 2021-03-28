$(document).ready(function () {
    $("form").submit(function (event) {
        if($(this).attr('id')=="all"){
            loadDoc('all')
        }else if($(this).attr('id')=="name"){
            loadDoc('name')
        }else if($(this).attr('id')=="code"){
            loadDoc('code')
        }else if($(this).attr('id')=="currency"){
            loadDoc('currency')
        }else if($(this).attr('id')=="lang"){
            loadDoc('lang')
        }else if($(this).attr('id')=="capital"){
            loadDoc('capital')
        }else if($(this).attr('id')=="callingCode"){
            loadDoc('callingCode')
        }else if($(this).attr('id')=="region"){
            loadDoc('region')
        }else if($(this).attr('id')=="regionalBloc"){
            loadDoc('regionalbloc')
        }else if($(this).attr('id')=="services"){
            loadDoc('services')
        };
        