
  x="0"; 
  xi=1; 
  coma=0;
  ni=0;
  op="no";


  $("input").click(function(){
    if(/[0-9]$/.test($(this).val()) || /[coma]$/.test($(this).attr('id')) ){
      numero($(this).val());
    }else if(/[+]$/.test($(this).attr('id')) || /[-]$/.test($(this).attr('id')) || /[*]$/.test($(this).attr('id')) || /[/]$/.test($(this).attr('id'))){
      operacion($(this).attr('id'));
    }else if(/[=]$/.test($(this).val())){
      igual($(this).val());
    }else if(/[DEL]$/.test($(this).val())){
      borradoTotal();
    }
  });

  function numero(valor) {
      if (x=="0" || xi==1) {
          $("#textoPantalla").text(valor); 
          x=valor; 
      }else{ 
          if (valor=="." && coma==0) {
                  $("#textoPantalla").text($("#textoPantalla").text()+valor); 
                  x+=valor;
                  coma=1; 
              }else if (valor=="." && coma==1) {
                  $("#textoPantalla").text("0.");
                  x=valor; 
                  coma=1; 
              }else if(valor=="00"){
                  $("#textoPantalla").text($("#textoPantalla").text()+valor); 
                  x+=valor;
              } else {
                  $("#textoPantalla").text($("#textoPantalla").text()+valor); 
                  x+=valor;
              }
          
      }
      xi=0;
  }

