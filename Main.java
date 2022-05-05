 
class Main {
  public static void main(String[] args) {
    aluno a1= new aluno();
        a1.nomeA="Will";
        a1.matricula=3654;
    
     aluno a2= new aluno();
        a2.nomeA="Jose";
        a2.matricula=3058;

    curso c1=new curso();
        c1.nomeC="ADM";
    curso c2=new curso();
        c2.nomeC="CPU";
    /*
    disciplina d1=new disciplina();
        d1.nomeDisc="Empreendedorismo";
        d1.notaFinal=65;
    disciplina d2=new disciplina();
        d2.nomeDisc="Desenvolvimento              Software";
        
    disciplina d3=new disciplina();
        d3.nomeDisc="AnalisedeDados";*/

    
    a1.exiberelatorio();
    System.out.println("------------");
    a2.exiberelatorio();
    System.out.println("------------");
    c1.InfoCurso();
    System.out.println("------------");
  
         
  }
}