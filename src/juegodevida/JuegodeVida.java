/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodevida;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Ragde
 */
public class JuegodeVida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int i, j, n, m, f, generaciones;
        int matriz = 0;

        n = 5;
        m = 5;

        int x[][] = new int[n][m];
        int[] celulas = new int[25];

        generaciones=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de generacions que tendre que mostrar..."));
        
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                x[i][j] = Integer.parseInt(JOptionPane.showInputDialog("1=Viva\n0=Muerta\n\nDime si la celula en la celda [" + (i + 1) + "," + (j + 1) + "] estan vivas..."));
                matriz = x[i][j];
            }
        }
        celulas[0]=x[0][0];
        celulas[1]=x[0][1];
        celulas[2]=x[0][2];
        celulas[3]=x[0][3];
        celulas[4]=x[0][4];
        celulas[5]=x[1][0];
        celulas[6]=x[1][1];
        celulas[7]=x[1][2];
        celulas[8]=x[1][3];
        celulas[9]=x[1][4];
        celulas[10]=x[2][0];
        celulas[11]=x[2][1];
        celulas[12]=x[2][2];
        celulas[13]=x[2][3];
        celulas[14]=x[2][4];
        celulas[15]=x[3][0];
        celulas[16]=x[3][1];
        celulas[17]=x[3][2];
        celulas[18]=x[3][3];
        celulas[19]=x[3][4];
        celulas[20]=x[4][0];
        celulas[21]=x[4][1];
        celulas[22]=x[4][2];
        celulas[23]=x[4][3];
        celulas[24]=x[4][4];
        
        String resultado = "";
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                resultado+= x[i][j];
                resultado+= "      ";
            }
            resultado += "\n";
        }
            
        JOptionPane.showMessageDialog(null, resultado);
        resultado="";
do{        
    generaciones = generaciones-1;    
        if (celulas[0]==1) {//viva
            if ((celulas[0]+celulas[1]+celulas[6]+celulas[5])>4){
                x[0][0]=0;
                }
            else {
                if (celulas[0]+celulas[1]+celulas[6]+celulas[5]>2){
                    x[0][0]=1;
                }
                else {
                    x[0][0]=0;
                }
            }
            }
        else {//muerta
            if (celulas[0]+celulas[1]+celulas[6]+celulas[5]==3)
                x[0][0]=1;
            else
                x[0][0]=0;
        
        }  
        //Nueva celula
        if (celulas[1]==1) {//viva
            if ((celulas[0]+celulas[1]+celulas[2]+celulas[5]+celulas[6]+celulas[7])>4){
                x[0][1]=0;
                }
            else {
                if ((celulas[0]+celulas[1]+celulas[2]+celulas[5]+celulas[6]+celulas[7])>2){
                    x[0][1]=1;
                }
                else {
                    x[0][1]=0;
                }
            }
            }
        else {//muerta
            if ((celulas[0]+celulas[1]+celulas[2]+celulas[5]+celulas[6]+celulas[7])==3)
                x[0][1]=1;
            else
                x[0][1]=0;
        
        }
        
        //Nueva celula
        if (celulas[2]==1) {//viva
            if ((celulas[1]+celulas[2]+celulas[3]+celulas[6]+celulas[7]+celulas[8])>4){
                x[0][2]=0;
                }
            else {
                if ((celulas[1]+celulas[2]+celulas[3]+celulas[6]+celulas[7]+celulas[8])>2){
                    x[0][2]=1;
                }
                else {
                    x[0][2]=0;
                }
            }
            }
        else {//muerta
            if ((celulas[1]+celulas[2]+celulas[3]+celulas[6]+celulas[7]+celulas[8])==3)
                x[0][2]=1;
            else
                x[0][2]=0;
        
        }

        //Nueva celula
        if (celulas[3]==1) {//viva
            if ((celulas[2]+celulas[3]+celulas[4]+celulas[7]+celulas[8]+celulas[9])>4){
                x[0][3]=0;
                }
            else {
                if ((celulas[2]+celulas[3]+celulas[4]+celulas[7]+celulas[8]+celulas[9])>2){
                    x[0][3]=1;
                }
                else {
                    x[0][3]=0;
                }
            }
            }
        else {//muerta
            if ((celulas[2]+celulas[3]+celulas[4]+celulas[7]+celulas[8]+celulas[9])==3)
                x[0][3]=1;
            else
                x[0][3]=0;
        
        }
        
        //Nueva celula
        if (celulas[4]==1) {//viva
            if ((celulas[3]+celulas[4]+celulas[8]+celulas[9])>4){
                x[0][4]=0;
                }
            else {
                if ((celulas[3]+celulas[4]+celulas[8]+celulas[9])>2){
                    x[0][4]=1;
                }
                else {
                    x[0][4]=0;
                }
            }
            }
        else {//muerta
            if ((celulas[3]+celulas[4]+celulas[8]+celulas[9])==3)
                x[0][4]=1;
            else
                x[0][4]=0;
        
        }

        //Nueva celula
        if (celulas[5]==1) {//viva
            if ((celulas[0]+celulas[1]+celulas[5]+celulas[6]+celulas[10]+celulas[11])>4){
                x[1][0]=0;
                }
            else {
                if ((celulas[0]+celulas[1]+celulas[5]+celulas[6]+celulas[10]+celulas[11])>2){
                    x[1][0]=1;
                }
                else {
                    x[1][0]=0;
                }
            }
            }
        else {//muerta
            if ((celulas[0]+celulas[1]+celulas[5]+celulas[6]+celulas[10]+celulas[11])==3)
                x[1][0]=1;
            else
                x[1][0]=0;
        } 

        //Nueva celula
        if (celulas[6]==1) {//viva
            if ((celulas[0]+celulas[1]+celulas[2]+celulas[5]+celulas[6]+celulas[7]+celulas[10]+celulas[11]+celulas[12])>4){
                x[1][1]=0;
                }
            else {
                if ((celulas[0]+celulas[1]+celulas[2]+celulas[5]+celulas[6]+celulas[7]+celulas[10]+celulas[11]+celulas[12])>2){
                    x[1][1]=1;
                }
                else {
                    x[1][1]=0;
                }
            }
            }
        else {//muerta
            if ((celulas[0]+celulas[1]+celulas[2]+celulas[5]+celulas[6]+celulas[7]+celulas[10]+celulas[11]+celulas[12])==3)
                x[1][1]=1;
            else
                x[1][1]=0;
        
        }

        //Nueva celula
        if (celulas[7]==1) {//viva
            if ((celulas[1]+celulas[2]+celulas[3]+celulas[6]+celulas[7]+celulas[8]+celulas[11]+celulas[12]+celulas[13])>4){
                x[1][2]=0;
                }
            else {
                if ((celulas[1]+celulas[2]+celulas[3]+celulas[6]+celulas[7]+celulas[8]+celulas[11]+celulas[12]+celulas[13])>2){
                    x[1][2]=1;
                }
                else {
                    x[1][2]=0;
                }
            }
            }
        else {//muerta
            if ((celulas[1]+celulas[2]+celulas[3]+celulas[6]+celulas[7]+celulas[8]+celulas[11]+celulas[12]+celulas[13])==3)
                x[1][2]=1;
            else
                x[1][2]=0;
        
        }
        
        //Nueva celula
        if (celulas[8]==1) {//viva
            if ((celulas[2]+celulas[3]+celulas[4]+celulas[7]+celulas[8]+celulas[9]+celulas[12]+celulas[13]+celulas[14])>4){
                x[1][3]=0;
                }
            else {
                if ((celulas[2]+celulas[3]+celulas[4]+celulas[7]+celulas[8]+celulas[9]+celulas[12]+celulas[13]+celulas[14])>2){
                    x[1][3]=1;
                }
                else {
                    x[1][3]=0;
                }
            }
            }
        else {//muerta
            if ((celulas[2]+celulas[3]+celulas[4]+celulas[7]+celulas[8]+celulas[9]+celulas[12]+celulas[13]+celulas[14])==3)
                x[1][3]=1;
            else
                x[1][3]=0;
        }
       
        //Nueva celula
        if (celulas[9]==1) {//viva
            if ((celulas[3]+celulas[4]+celulas[8]+celulas[9]+celulas[13]+celulas[14])>4){
                x[1][4]=0;
                }
            else {
                if ((celulas[3]+celulas[4]+celulas[8]+celulas[9]+celulas[13]+celulas[14])>2){
                    x[1][4]=1;
                }
                else {
                    x[1][4]=0;
                }
            }
            }
        else {//muerta
            if ((celulas[3]+celulas[4]+celulas[8]+celulas[9]+celulas[13]+celulas[14])==3)
                x[1][4]=1;
            else
                x[1][4]=0;
        }
  
        //Nueva celula
        if (celulas[10]==1) {//viva
            if ((celulas[5]+celulas[6]+celulas[10]+celulas[11]+celulas[15]+celulas[16])>4){
                x[2][0]=0;
                }
            else {
                if ((celulas[5]+celulas[6]+celulas[10]+celulas[11]+celulas[15]+celulas[16])>2){
                    x[2][0]=1;
                }
                else {
                    x[2][0]=0;
                }
            }
            }
        else {//muerta
            if ((celulas[5]+celulas[6]+celulas[10]+celulas[11]+celulas[15]+celulas[16])==3)
                x[2][0]=1;
            else
                x[2][0]=0;
        }
 
        //Nueva celula
        if (celulas[11]==1) {//viva
            if ((celulas[5]+celulas[6]+celulas[7]+celulas[10]+celulas[11]+celulas[12]+celulas[15]+celulas[16]+celulas[17])>4){
                x[2][1]=0;
                }
            else {
                if ((celulas[5]+celulas[6]+celulas[7]+celulas[10]+celulas[11]+celulas[12]+celulas[15]+celulas[16]+celulas[17])>2){
                    x[2][1]=1;
                }
                else {
                    x[2][1]=0;
                }
            }
            }
        else {//muerta
            if ((celulas[5]+celulas[6]+celulas[7]+celulas[10]+celulas[11]+celulas[12]+celulas[15]+celulas[16]+celulas[17])==3)
                x[2][1]=1;
            else
                x[2][1]=0;
        }
 
        //Nueva celula
        if (celulas[12]==1) {//viva
            if ((celulas[6]+celulas[7]+celulas[8]+celulas[11]+celulas[12]+celulas[13]+celulas[16]+celulas[17]+celulas[18])>4){
                x[2][2]=0;
                }
            else {
                if ((celulas[6]+celulas[7]+celulas[8]+celulas[11]+celulas[12]+celulas[13]+celulas[16]+celulas[17]+celulas[18])>2){
                    x[2][2]=1;
                }
                else {
                    x[2][2]=0;
                }
            }
            }
        else {//muerta
            if ((celulas[6]+celulas[7]+celulas[8]+celulas[11]+celulas[12]+celulas[13]+celulas[16]+celulas[17]+celulas[18])==3)
                x[2][2]=1;
            else
                x[2][2]=0;
        }
  
        //Nueva celula
        if (celulas[13]==1) {//viva
            if ((celulas[7]+celulas[8]+celulas[9]+celulas[12]+celulas[13]+celulas[14]+celulas[17]+celulas[18]+celulas[19])>4){
                x[2][3]=0;
                }
            else {
                if ((celulas[7]+celulas[8]+celulas[9]+celulas[12]+celulas[13]+celulas[14]+celulas[17]+celulas[18]+celulas[19])>2){
                    x[2][3]=1;
                }
                else {
                    x[2][3]=0;
                }
            }
            }
        else {//muerta
            if ((celulas[7]+celulas[8]+celulas[9]+celulas[12]+celulas[13]+celulas[14]+celulas[17]+celulas[18]+celulas[19])==3)
                x[2][3]=1;
            else
                x[2][3]=0;
        }
    
        //Nueva celula
        if (celulas[14]==1) {//viva
            if ((celulas[8]+celulas[9]+celulas[13]+celulas[14]+celulas[18]+celulas[19])>4){
                x[2][4]=0;
                }
            else {
                if ((celulas[8]+celulas[9]+celulas[13]+celulas[14]+celulas[18]+celulas[19])>2){
                    x[2][4]=1;
                }
                else {
                    x[2][4]=0;
                }
            }
            }
        else {//muerta
            if ((celulas[8]+celulas[9]+celulas[13]+celulas[14]+celulas[18]+celulas[19])==3)
                x[2][4]=1;
            else
                x[2][4]=0;
        }
        
        //Nueva celula
        if (celulas[15]==1) {//viva
            if ((celulas[10]+celulas[11]+celulas[15]+celulas[16]+celulas[20]+celulas[21])>4){
                x[3][0]=0;
                }
            else {
                if ((celulas[10]+celulas[11]+celulas[15]+celulas[16]+celulas[20]+celulas[21])>2){
                    x[3][0]=1;
                }
                else {
                    x[3][0]=0;
                }
            }
            }
        else {//muerta
            if ((celulas[10]+celulas[11]+celulas[15]+celulas[16]+celulas[20]+celulas[21])==3)
                x[3][0]=1;
            else
                x[3][0]=0;
        }
 
        //Nueva celula
        if (celulas[16]==1) {//viva
            if ((celulas[10]+celulas[11]+celulas[12]+celulas[15]+celulas[16]+celulas[17]+celulas[20]+celulas[21]+celulas[22])>4){
                x[3][1]=0;
                }
            else {
                if ((celulas[10]+celulas[11]+celulas[12]+celulas[15]+celulas[16]+celulas[17]+celulas[20]+celulas[21]+celulas[22])>2){
                    x[3][1]=1;
                }
                else {
                    x[3][1]=0;
                }
            }
            }
        else {//muerta
            if ((celulas[10]+celulas[11]+celulas[12]+celulas[15]+celulas[16]+celulas[17]+celulas[20]+celulas[21]+celulas[22])==3)
                x[3][1]=1;
            else
                x[3][1]=0;
        }
 
        //Nueva celula
        if (celulas[17]==1) {//viva
            if ((celulas[11]+celulas[12]+celulas[13]+celulas[16]+celulas[17]+celulas[18]+celulas[21]+celulas[22]+celulas[23])>4){
                x[3][2]=0;
                }
            else {
                if ((celulas[11]+celulas[12]+celulas[13]+celulas[16]+celulas[17]+celulas[18]+celulas[21]+celulas[22]+celulas[23])>2){
                    x[3][2]=1;
                }
                else {
                    x[3][2]=0;
                }
            }
            }
        else {//muerta
            if ((celulas[11]+celulas[12]+celulas[13]+celulas[16]+celulas[17]+celulas[18]+celulas[21]+celulas[22]+celulas[23])==3)
                x[3][2]=1;
            else
                x[3][2]=0;
        }
  
        //Nueva celula
        if (celulas[18]==1) {//viva
            if ((celulas[12]+celulas[13]+celulas[14]+celulas[17]+celulas[18]+celulas[19]+celulas[22]+celulas[23]+celulas[24])>4){
                x[3][3]=0;
                }
            else {
                if ((celulas[12]+celulas[13]+celulas[14]+celulas[17]+celulas[18]+celulas[19]+celulas[22]+celulas[23]+celulas[24])>2){
                    x[3][3]=1;
                }
                else {
                    x[3][3]=0;
                }
            }
            }
        else {//muerta
            if ((celulas[12]+celulas[13]+celulas[14]+celulas[17]+celulas[18]+celulas[19]+celulas[22]+celulas[23]+celulas[24])==3)
                x[3][3]=1;
            else
                x[3][3]=0;
        }
  
        //Nueva celula
        if (celulas[19]==1) {//viva
            if ((celulas[13]+celulas[14]+celulas[18]+celulas[19]+celulas[23]+celulas[24])>4){
                x[3][4]=0;
                }
            else {
                if ((celulas[13]+celulas[14]+celulas[18]+celulas[19]+celulas[23]+celulas[24])>2){
                    x[3][4]=1;
                }
                else {
                    x[3][4]=0;
                }
            }
            }
        else {//muerta
            if ((celulas[13]+celulas[14]+celulas[18]+celulas[19]+celulas[23]+celulas[24])==3)
                x[3][4]=1;
            else
                x[3][4]=0;
        }
   
        //Nueva celula
        if (celulas[20]==1) {//viva
            if ((celulas[15]+celulas[16]+celulas[20]+celulas[21])>4){
                x[4][0]=0;
                }
            else {
                if ((celulas[15]+celulas[16]+celulas[20]+celulas[21])>2){
                    x[4][0]=1;
                }
                else {
                    x[4][0]=0;
                }
            }
            }
        else {//muerta
            if ((celulas[15]+celulas[16]+celulas[20]+celulas[21])==3)
                x[4][0]=1;
            else
                x[4][0]=0;
        }
        
           //Nueva celula
        if (celulas[21]==1) {//viva
            if ((celulas[15]+celulas[16]+celulas[17]+celulas[20]+celulas[21]+celulas[22])>4){
                x[4][1]=0;
                }
            else {
                if ((celulas[15]+celulas[16]+celulas[17]+celulas[20]+celulas[21]+celulas[22])>2){
                    x[4][1]=1;
                }
                else {
                    x[4][1]=0;
                }
            }
            }
        else {//muerta
            if ((celulas[15]+celulas[16]+celulas[17]+celulas[20]+celulas[21]+celulas[22])==3)
                x[4][1]=1;
            else
                x[4][1]=0;
        }
      
           //Nueva celula
        if (celulas[22]==1) {//viva
            if ((celulas[16]+celulas[17]+celulas[18]+celulas[21]+celulas[22]+celulas[23])>4){
                x[4][2]=0;
                }
            else {
                if ((celulas[16]+celulas[17]+celulas[18]+celulas[21]+celulas[22]+celulas[23])>2){
                    x[4][2]=1;
                }
                else {
                    x[4][2]=0;
                }
            }
            }
        else {//muerta
            if ((celulas[16]+celulas[17]+celulas[18]+celulas[21]+celulas[22]+celulas[23])==3)
                x[4][2]=1;
            else
                x[4][2]=0;
        }
       
           //Nueva celula
        if (celulas[23]==1) {//viva
            if ((celulas[17]+celulas[18]+celulas[19]+celulas[22]+celulas[23]+celulas[24])>4){
                x[4][3]=0;
                }
            else {
                if ((celulas[17]+celulas[18]+celulas[19]+celulas[22]+celulas[23]+celulas[24])>2){
                    x[4][3]=1;
                }
                else {
                    x[4][3]=0;
                }
            }
            }
        else {//muerta
            if ((celulas[17]+celulas[18]+celulas[19]+celulas[22]+celulas[23]+celulas[24])==3)
                x[4][3]=1;
            else
                x[4][3]=0;
        }
       
           //Nueva celula
        if (celulas[24]==1) {//viva
            if ((celulas[18]+celulas[19]+celulas[23]+celulas[24])>4){
                x[4][4]=0;
                }
            else {
                if ((celulas[18]+celulas[19]+celulas[23]+celulas[24])>2){
                    x[4][4]=1;
                }
                else {
                    x[4][4]=0;
                }
            }
            }
        else {//muerta
            if ((celulas[18]+celulas[19]+celulas[23]+celulas[24])==3)
                x[4][4]=1;
            else
                x[4][4]=0;
        }
       
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                resultado+= x[i][j];
                resultado+= "      ";
            }
            resultado += "\n";
        }
        JOptionPane.showMessageDialog(null, "El resultado de la siguiente generacion es:\n\n"+resultado);
    } 
while (generaciones>0);

}
}
