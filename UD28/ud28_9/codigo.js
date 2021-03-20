function texto(cadena) {

    var resultado = "La cadena "+cadena;
  
    if(cadena == cadena.toUpperCase()) {
      resultado += " está formada por mayúsculas";
    }else if(cadena == cadena.toLowerCase()) {
      resultado += " está formada por minúsculas";
    }else {
      resultado += " está formada por mayúsculas y minúsculas";
    }
  
    return resultado;
  }
  
  alert(texto("Hola me llamo Emma!! :)"));