/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER}
 */
public class ColaBicola {
    private char[] cola=new char[10];
    private int ini=-1;
    private int fin=-1;
    private char ValEl;
    
    public boolean InsertarFin(char v){
        if(fin==(cola.length-1)){
            return false;
        }
        fin++;
        cola[fin]=v;
        if(fin==0 && ini==-1){
            ini++;
        }
        return true;
    }
    
    public boolean EliminarIni(){
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
    
    public boolean InsertarIni(char v){
        if(ini==0 || ini==-1){
            return false;
        }
        ini--;
        cola[ini]=v;
        return true;
    }
    
    public boolean EliminarFin(){
        if(fin==-1){
        return false;}
        ValEl=cola[fin];
        if(ini==fin && ini!=-1){
            ini=-1;
        }
        fin--;
        return true;
    }

    public char[] getCola() {
        return cola;
    }

    public int getIni() {
        return ini;
    }

    public int getFin() {
        return fin;
    }

    public char getValEl() {
        return ValEl;
    }
}
