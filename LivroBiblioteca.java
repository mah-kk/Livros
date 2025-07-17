public class LivroBiblioteca extends Livro {


// atributos

private String localPrateleira;
private String categoria;
private int prazoEntrega;
private String nomeQuemEmprestou;





//localPrateleira
public String getLocalPrateleira(){
return localPrateleira;

}

public void setLocalPrateleira(String localPrateleira){
  this.localPrateleira = localPrateleira;

}
//categoria
public String getCategoria(){
    return categoria;
}

public void setCategoria(String categoria){
    this.categoria = categoria;
}

//prazoEntrega
public int getPrazoEntrega(){
return prazoEntrega;

}

public void setPrazoEntrega(int  prazoEntrega){
  this.prazoEntrega = prazoEntrega;

}

//nomeQuemEmprestou
public String getNomeQuemEmprestou(){
    return nomeQuemEmprestou;
}

public void setNomeQuemEmprestou(String nomeQuemEmprestou){
    this.nomeQuemEmprestou = nomeQuemEmprestou;
}


//Metodos 
public void Alugar(){
System.out.println("\nEstou alugando... ");

}

public void Devolver(){
System.out.println("Estou devolvendo... ");

}

}





