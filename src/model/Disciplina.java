/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.lang.String;

/**
 *
 * @author jemerson.reis
 */
public class Disciplina {
    private  String disciplina, professor;
    private double np1=-1, np2=-1, sub=-1, exame=-1;


    public String getDisciplina() {
        return disciplina;
    }

    public void alteraDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getProfessor() {
        return professor;
    }

    public void alteraProfessor(String professor) {
        this.professor = professor;
    }

    public double getNp1() {
        return np1;
    }

    public boolean setNp1(double np1) {
        if((np1>=0) &&(np1<=10)){
            this.np1 = np1;
            return true;
        } else{
            return false;
        }
    }

    public double getNp2() {
        return np2;
    }

    public boolean setNp2(double np2) {
        if((np2>=0) &&(np2<=10)){
            this.np2 = np2;
            return true;
        } else{
            return false;
        }
    }

    public double getSub() {
        return sub;
    }

    public boolean setSub(double sub) {
        if((sub>=0) &&(sub<=10)){
            this.sub = sub;
            return true;
        } else{
            System.out.print("Sub inválida");
            return false;
        }
    }

    public double getExame() {
        return exame;
    }

    public boolean setExame(double exame) {
        if((exame>=0) &&(exame<=10)){
            this.exame = exame;
            return true;
        } else{
            return false;
        }
    }
    
    public void zeraNp1() {
        this.np1 = -1;
    }
    
    public void zeraNp2(){
        this.np2 = -1;
    }
    
    public void zeraSub(){
        this.sub = -1;
    }
    
public Disciplina(String professor, String disciplina){
        this.disciplina = disciplina;
        this.professor = professor;
    }
   
public double media(){
    double media =-1;
    if((sub == -1) && (np2>=0) && (np1>=0)){
        media = (np1+np2)/2;
    } else if((np1 == -1) && (sub>=0) && (np2>=0)){
        media = (np2+sub)/2;
    } else if((np2== -1) && (sub>=0) && (np1>=0)){
        media = (np1+sub)/2;
    } else{
        System.out.println("Falta alguma nota");
        media = 0;
    }
    return media;
}

public double paraExame(){
    if (media()>=7){
        System.out.println("Aluno aprovado!!");
        return 0;
    } else {
    return 10 - media();
    }
}

    @Override
    public String toString() {
        return "Disciplina{" + "disciplina=" + disciplina + ", professor=" + professor + ", np1=" + np1 + ", np2=" + np2 + ", sub=" + sub + ", exame=" + exame + '}';
    }
    
}
