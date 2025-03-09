//Vou criar um exemplo de uma classe para representar uma SmartTV. Nela irá conter:
//Caracteristicas: ligada (boolean), canal(int) e volume(int)
//A tv poderá ligar e desligar e assim mudar o estado ligada dela 
//Ela aumentará e diminuirá os volumes em +1 e -1
//Poderá aumentar os canais de 1 em 1 ou definindo em um número correspondente 
public class SmartTv {
    boolean ligada=false;
    int canal=1;
    int volume=25;
    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal(){
        canal++;

    }

    public void diminuirCanal(){
        canal--;

    }

    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }
    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }
}
