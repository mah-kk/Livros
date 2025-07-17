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
  livroBiblioteca.setLocalPrateleira("Prateleira AB2");
  livroBiblioteca.setPrazoEntrega (10);
  livroBiblioteca.setNomeQuemEmprestou  ("Maria Karoline");


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
  livroLivraria.setPreco (100);
  livroLivraria.setNovoUsado (false);
  livroLivraria.setLocalPrateleira ("Piso baixo 3 ");
  livroLivraria.setCategoria  ("Animação");


  livroLivraria.Comprar();
  livroLivraria.Vender();

  livroLivraria.Ler();
  livroLivraria.Cadastrar();
  livroLivraria.Localizar();


//livro 
    System.out.println("\nTitulo do livro:"+livro.getTitulo());
    System.out.println("\nCodigo do livro:"+livro.getCodigo());
    System.out.println("\nAutor do livro:"+livro.getAutor());
    System.out.println("\nEdicao do livro:"+livro.getEdicao());
    System.out.println("\nEditora do livro:"+livro.getEditora());
    System.out.println("\nNumero de Paginas do livro:"+livro.getNrPaginas());


//biblioteca

    System.out.println("\nTitulo do livro Biblioteca:"+livroBiblioteca.getTitulo());
    System.out.println("\nCodigo do livro Biblioteca:"+livroBiblioteca.getCodigo());
    System.out.println("\nAutor do livro Biblioteca:"+livroBiblioteca.getAutor());
    System.out.println("\nEditora do livro Biblioteca:"+livroBiblioteca.getEditora());
    System.out.println("\nEdicao do livro Biblioteca:"+livroBiblioteca.getEdicao());
    System.out.println("\nNumero de Paginas Biblioteca:"+livroBiblioteca.getNrPaginas());


//livraria

    System.out.println("\nTitulo do livro Livraria :"+livroLivraria.getTitulo());
    System.out.println("\nCodigo do livro Livraria :"+livroLivraria.getCodigo());
    System.out.println("\nAutor do livro Livraria :"+livroLivraria.getAutor());
    System.out.println("\nEdicao do livro Livraria :"+livroLivraria.getEdicao());
    System.out.println("\nEditora do livro Livraria :"+livroLivraria.getEditora());
    System.out.println("\nNumero de Paginas do livro Livraria :"+livroLivraria.getNrPaginas());


String mensagem1 = "\nCodigo:"+livro.getCodigo()+
                 "\nTitulo:"+livro.getTitulo()+
                 "\nAutor :"+livro.getAutor()+
                  "\nEdicao :"+livro.getEdicao()+
                 "\nEditora :"+livro.getEditora()+
                 "\nNumero de Paginas :"+livro.getNrPaginas();
                 
                System.out.println("\nLivro:\n"+mensagem1);


           String mensagem2 = "\nCodigo:"+livro.getCodigo()+
                 "\nTitulo:"+livroBiblioteca.getTitulo()+
                 "\nAutor :"+livroBiblioteca.getAutor()+
                  "\nEdicao :"+livroBiblioteca.getEdicao()+
                 "\nEditora :"+livroBiblioteca.getEditora()+
                 "\nNumero de Paginas :"+livroBiblioteca.getNrPaginas()+
                  "\nPrateleira :"+ livroBiblioteca.getLocalPrateleira()+ 
                 "\nPrazo entrga :" + livroBiblioteca.getPrazoEntrega() +
                  "\nNome de quem esprestou :" + livroBiblioteca.getNomeQuemEmprestou()+
                  "\nCategoria :"+ livroBiblioteca.getCategoria() ;



           System.out.println("\nLivro Biblioteca:\n"+mensagem2);

           String mensagem3 = "\nCodigo:"+livroLivraria.getCodigo()+
                 "\nTitulo:"+livroLivraria.getTitulo()+
                 "\nAutor :"+livroLivraria.getAutor()+
                  "\nEdicao :"+livroLivraria.getEdicao()+
                 "\nEditora :"+livroLivraria.getEditora()+
                 "\nNumero de Paginas :"+livroLivraria.getNrPaginas()+
                "\nPreço :"+ livroLivraria.getPreco() +
                "\nNovo ou Usado :"+ livroLivraria.getNovoUsado() +
                "\nPrateleira :"+ livroLivraria.getLocalPrateleira() +
                "\nCategoria :"+ livroLivraria.getCategoria() ;



           System.out.println("\nLivro Livraria:\n"+mensagem3);


  }



 }