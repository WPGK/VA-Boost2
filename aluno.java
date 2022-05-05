public class aluno extends curso{
  String nomeA;
  int matricula;
  String nomeC;

/*public aluno(String nomeA,int matricula,String nomeC){
  this.nomeA=nomeA;
  this.matricula=matricula;
  this.nomeC=nomeC;  */
  void exiberelatorio(){
       System.out.println("Aluno :"+ this.nomeA);
       System.out.println("Matricula :"+ this.matricula);
       System.out.println("Curso :"+nomeC);
    }
}
