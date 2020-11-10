/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER}
 */
public class ColaPrioridad {
    protected Data[] cola=new Data[10];
    protected int ini=-1;
    protected int fin=-1;
    private Data ValEl;
    
    public ColaPrioridad(){
        for(int i=0; i<cola.length; i++){
            cola[i] = new Data();
        }
    }
    
    public boolean Insertar(Data d){
        if(fin==(cola.length-1)){
            return false;
        }
        fin++;
        cola[fin]=d;
        if(fin==0 && ini==-1){
            ini++;
        }
        OrdenarPrioridad();
        return true;
    }
    
    public void OrdenarPrioridad(){
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
    
    public boolean Eliminar(){
        if(ini==-1 && fin==-1){
        return false;}
        ValEl=cola[ini];
        if(ini==fin && ini!=-1){
            ini=-1;
            fin=-1;
        }
        ini++;
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
