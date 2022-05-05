public class disciplina extends professor{
  String nomeDisc;
  Float notaFinal;

  public disciplina(String nomeDisc,Float notaFinal,String nomeP){
    this.nomeDisc=nomeDisc;
    this.notaFinal=notaFinal;
    this.nomeP=nomeP;}

    void infoDisciplina(){
      System.out.println("Nome da Disciplina :"+nomeDisc);
      System.out.println("Nota Final :"+notaFinal);
      
    }
  
}

