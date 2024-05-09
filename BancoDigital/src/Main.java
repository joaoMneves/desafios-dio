public class Main {
public static void main(String[] args) {
  Cliente joao = new Cliente("joao");
 
  Conta cc = new ContaCorrente(joao);
    Conta poupanca = new ContaPoupanca(joao);

  cc.depositar(100D);
  cc.transferir(100D, poupanca);

  cc.imprimirExtrato();
  poupanca.imprimirExtrato();
 }
}





  
  
    
    
      
      
    
      
      
      
    
  

  
  
    
    
      
      
    
      
      
      
    
  

  
  
    
    
      
      
    
