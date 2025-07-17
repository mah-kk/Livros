public class Livro {

private int codigo;
private String titulo;
private String autor;
private String editora;
private int nrPaginas;
private int edicao;





// Metodos construtor (Serve para construir seu objeto com valores default )
Livro(){
this.codigo = 0;
this.autor = " ";
this.titulo = " ";
this.editora = " ";
this.nrPaginas = 0;
this.edicao = 0;



}

//codigo
public int getCodigo(){
return codigo;

}

public void setCodigo(int codigo){
  this.codigo = codigo;

}
//titulo
public String getTitulo(){
    return titulo;
}

public void setTitulo(String titulo){
    this.titulo = titulo;
}

//autor
public String getAutor(){
return autor;

}

public void setAutor(String autor){
  this.autor = autor;

}
//editora
public String getEditora(){
    return editora;
}

public void setEditora(String editora){
    this.editora = editora;
}

//nrpaginas
public int getNrPaginas(){
return nrPaginas;

}

public void setNrPaginas(int nrPaginas){
  this.nrPaginas = nrPaginas;

}
//edição
public int getEdicao(){
    return edicao;
}

public void setEdicao(int edicao){
    this.edicao = edicao;
}


public void Ler(){
System.out.println("\nEstou lendo...");

}

public void Cadastrar(){
System.out.println("\nEstou cadastrando...");

}

public void Localizar (){
System.out.println("\nEstou localizando...");

}


}