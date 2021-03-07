package aula5;


public class ContaBanco {
    //Atributos
 public int nunConta;
 protected String tipo;
 private String dono;
 private float saldo;
 private boolean status;

//Métodos Personalizados
 
 public void estadoAtual(){
     System.out.println("-------------------------------");
     System.out.println("Conta: " + this.getNunConta());
     System.out.println("Tipo: " + this.getTipo());
     System.out.println("Dono: " + this.getDono());
     System.out.println("Saldo: " + this.getSaldo());
     System.out.println("Status: " + this.getStatus());
 }
  public void abrirConta(String t){
      this.setTipo(t);
      this.setStatus(true);
      if ("CC".equals(t)) {
         this.setSaldo(50); 
      } else if ("CP".equals(t)) {
         this.setSaldo(150);
      }
      System.out.println("Conta aberta com sucesso");
 }
  
  public void fecharConta(){
      if (this.getSaldo() > 0) {
          System.out.println("Conta ainda não pode"
                  + " ser fechada porque tem dinheiro");
      }else if (this.getSaldo() < 0){
          System.out.println("Conta não podeser fechada"
                  + " pois tem débito");
      }else {
          this.setStatus(false);
          System.out.println("Conta fechada com sucesso");
      }
  }
  
  public void depositar(float v){
      if(this.getStatus()){
         this.setSaldo(this.getSaldo() + v);
          System.out.println("Depósito realizado na conta " + this.getDono());
      }else{
          System.out.println("Impossível depositar em uma conta fechada");
      }
  }
  
   public void sacar(float v){
   if(getStatus()){
       if(this.getSaldo() >= v){
          this.setSaldo(this.getSaldo() - v);
           System.out.println("Saque realizado na conta de " + this.getDono());
       }else {
           System.out.println("Saldo insuficiente para saque");
       }
   
    }else {
       System.out.println("Impossível sacar de uma conta fechada"); 
    }
   }
   
   public void pagarMensalidade(){
       int v = 0;
       if (this.getTipo() == "CC") {
           v = 12;
       } else if (this.getTipo() == "CP") {
           v = 20;
       }
       if (this.getStatus()){
           this.setSaldo(this.getSaldo() - v);
           System.out.println("Mensalidade paga com sucesso por " + this.getDono());
       } else {
           System.out.println("Impossível pagar uma conta fechada");
       }
 
   }
 
   //Médotodos Especiais
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    public int getNunConta() {
        return nunConta;
    }

    public void setNunConta(int nunConta) {
        this.nunConta = nunConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

   
  
 
    
}
