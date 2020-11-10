/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER}
 */
public class ColaBicolaPrioridad {
    protected Data[] cola=new Data[10];
    protected int ini=-1;
    protected int fin=-1;
    private Data ValEl;
    
    public ColaBicolaPrioridad(){
        for(int i=0; i<cola.length; i++){
            cola[i] = new Data();
        }
    }
    
    public boolean InsertarFin(Data d){
        if(fin==(cola.length-1)){
            return false;
        }
        fin++;
        cola[fin]=d;
        if(fin==0 && ini==-1){
            ini++;
        }
        OrdenarPrioridadFin();
        return true;
    }
    
    public void OrdenarPrioridadFin(){
        Data temp;
        if(ini==fin && ini!=-1){
        }else{
            for(int i=fin; i>ini; i--){
            if(cola[i-1].prioridad<cola[i].prioridad){
                temp=cola[i-1];
                cola[i-1]=cola[i];
                cola[i]=temp;
            }
            }
        }
    }
    
    public boolean InsertarIni(Data d){
        if(ini<=0){
            return false;
        }
        ini--;
        cola[fin]=d;
        OrdenarPrioridadFin();
        return true;
    }
    
    public void OrdenarPrioridadIni(){
        Data temp;
        if(ini==fin && ini!=-1){
        }else{
            for(int i=ini; i<fin; i++){
            if(cola[i].prioridad<=cola[i+1].prioridad){
                temp=cola[i+1];
                cola[i]=cola[i+1];
                cola[i]=temp;
            }
            }
        }
    }
    
    public boolean EliminarIni(){
        if(ini==-1 && fin==-1){
        return false;}
        ValEl=cola[ini];
        if(ini==fin && ini!=-1){
            ini=-1;
            fin=-1;
            return true;
        }
        ini++;
        return true;
    }
    
    public boolean EliminarFin(){
        if(ini==-1 && fin==-1){
        return false;}
        ValEl=cola[fin];
        if(ini==fin && ini!=-1){
            ini=-1;
            fin=-1;
            return true;
        }
        fin--;
        return true;
    }

    public Data[] getCola() {
        return cola;
    }

    public int getIni() {
        return ini;
    }

    public int getFin() {
        return fin;
    }

    public String getValEl() {
        return ValEl.getData();
    }
    
    public Data getData(int i){
        return cola[i];
    }
}
