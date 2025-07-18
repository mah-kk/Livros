public class LivroLivraria extends Livro {


// atributos

private double preco;
private boolean novoUsado; // 0 - novo 1 - usado 
private  String localPrateleira;
private String categoria;

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

//novoUsado
public boolean getNovoUsado(){
return novoUsado;

}

public void setNovoUsado(boolean  novoUsado){
  this.novoUsado = novoUsado;

}

//preco
public double getPreco(){
    return preco;
}

public void setPreco(double preco){
    this.preco = preco;
}


//Metodos 
public void Comprar(){
System.out.println("\nEstou comprando... ");

}


public void Vender(){
System.out.println("\nEstou vendendo livros na livraria ");

}

@Override
public void Localizar(){
System.out.println("Estou Localizando livro da Livraria ");

}

@Override
public void Ler(){
System.out.println("\nEstou lendo um livro que comprei em uma livraria");

}

@Override
public void Cadastrar(){
System.out.println("\nEstou cadastrando livros da livraria");

}





}



