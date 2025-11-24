/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prj.Gioco;

/**
 *
 * @author giorgia.diserio
 */
public class Personaggio {
    private String nome;
    private int hp;
    private int atk;
    private int def;
    private double range;
    private int[] pos;

    public Personaggio(String nome, int hp, int atk, int def, double range, int[] pos) {
        this.nome = nome;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.range = range;
        this.pos = pos;
        
        
    }
    
    private boolean isVivo(int puntiVita){
        boolean vivo= true;
        if(puntiVita<1){
            vivo=false;
        }
        
        return vivo;
    }
    
    public String attacco(Personaggio nemico){
        String txt;
        int danno= atk*3-def*2;
        if(danno<1){
            txt="hai mancato il colpo";
        }
        else{
            nemico.hp-=danno;
            boolean vivo=isVivo(nemico.hp);
            if(vivo==true){
                txt="il danno che ha subito "+nemico.nome+" è di "+danno+"\n la sua vita attuale è: "+nemico.hp;    
            }
            else{
                txt="il nemico : "+nemico.nome+" è morto";
            }
            
           
        }
        return txt;
    }
    
    public String attacco(Arma arma,Personaggio nemico){
        String txt;
        arma.range;
        int danno= atk*3-def*2;
        if(danno<1){
            txt="hai mancato il colpo";
        }
        else{
            nemico.hp-=danno;
            boolean vivo=isVivo(nemico.hp);
            if(vivo==true){
                txt="il danno che ha subito "+nemico.nome+" è di "+danno+"\n la sua vita attuale è: "+nemico.hp;    
            }
            else{
                txt="il nemico : "+nemico.nome+" è morto";
            }
        }
        return txt;
    }
    
    
    

    
    
    
    

    
    
    
    
    
    
    
    
}
