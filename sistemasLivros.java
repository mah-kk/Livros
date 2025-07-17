 public class sistemasLivros {

  public static void main(String[] args){

  Livro livro = new Livro();
  livro.setCodigo(1);
  livro.setTitulo ( "Codigo da Vinci");
  livro.setEditora ("Editora xyz");
   livro.setAutor ("Desconhecido");
  livro.setNrPaginas (100) ;
  livro.setEdicao(3);


  livro.Ler();
  livro.Cadastrar();
  livro.Localizar();

  // Livro Biblioteca 

  LivroBiblioteca livroBiblioteca = new LivroBiblioteca();
  livroBiblioteca.setCodigo(11);
  livroBiblioteca.setTitulo("Cinderela") ;
  livroBiblioteca.setAutor("Autor Desconhecido ") ;
  livroBiblioteca.setEditora("Editora 123");
  livroBiblioteca.setNrPaginas(200);
  livroBiblioteca.setEdicao(6);
  livroBiblioteca.localPrateleira = "Prateleira AB2";
  livroBiblioteca.prazoEntrega = 10;
  livroBiblioteca.nomeQuemEmprestou = "Maria Karoline";


  livroBiblioteca.Ler();
  livroBiblioteca.Cadastrar();
  livroBiblioteca.Localizar();


  // Livro Livraria

  LivroLivraria livroLivraria = new LivroLivraria();
  livroLivraria.setCodigo (12);
  livroLivraria.setTitulo(" branca de neve") ;
  livroLivraria.setAutor("Irmãos Grimm ") ;
  livroLivraria.setEditora("Editora 222")  ;
  livroLivraria.setNrPaginas(300);
  livroLivraria.setEdicao (7);
  livroLivraria.preco = 100;
  livroLivraria.novoUsado = false;
  livroLivraria.localPrateleira = "Piso baixo 3 ";
  livroLivraria.categoria = "Animação";


  livroLivraria.Comprar();
  livroLivraria.Vender();

  livroLivraria.Ler();
  livroLivraria.Cadastrar();
  livroLivraria.Localizar();

 //codigo
  System.out.println("\nCodigo do livro Livraria :"+livroLivraria.getCodigo());
    System.out.println("\nCodigo do livro Biblioteca:"+livroBiblioteca.getCodigo());
      System.out.println("\nCodigo do livro:"+livro.getCodigo());

//autor
System.out.println("\nAutor do livro Livraria :"+livroLivraria.getAutor());
    System.out.println("\nAutor do livro Biblioteca:"+livroBiblioteca.getAutor());
      System.out.println("\nAutor do livro:"+livro.getAutor());

//edição
      System.out.println("\nEdicao do livro Livraria :"+livroLivraria.getEdicao());
    System.out.println("\nEdicao do livro Biblioteca:"+livroBiblioteca.getEdicao());
      System.out.println("\nEdicao do livro:"+livro.getEdicao());

//editora
      System.out.println("\nEditora do livro Livraria :"+livroLivraria.getEditora());
    System.out.println("\nEditora do livro Biblioteca:"+livroBiblioteca.getEditora());
      System.out.println("\nEditora do livro:"+livro.getEditora());

//numero de paginas
      System.out.println("\nNumero de Paginas do livro Livraria :"+livroLivraria.getNrPaginas());
    System.out.println("\nNumero de Paginas Biblioteca:"+livroBiblioteca.getNrPaginas());
      System.out.println("\nNumero de Paginas do livro:"+livro.getNrPaginas());


//titulo
      System.out.println("\nTitulo do livro Livraria :"+livroLivraria.getTitulo());
    System.out.println("\nTitulo do livro Biblioteca:"+livroBiblioteca.getTitulo());
      System.out.println("\nTitulo do livro:"+livro.getTitulo());


  }

  

 }