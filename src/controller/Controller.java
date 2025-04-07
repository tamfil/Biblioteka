/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Autor;
import model.Knjiga;
import model.Zanr;

/**
 *
 * @author user
 */
public class Controller {
    private List<Knjiga> knjige=new ArrayList<>();
    private List<Autor> autori=new ArrayList<>();
    
    private static Controller instance;
    public static Controller getInstance(){
        if(instance==null){
            instance=new Controller();
        }
        return instance;
    }

    private Controller() {
        Autor a1=new Autor("Ivo", "Andric", 1945, "bla bla bla");
        Autor a2=new Autor("Petar", "Kocic", 1955, "blaaaa");
        Autor a3=new Autor("Sergej", "Jesenjin", 1888, "na nana nanna");
        
        Knjiga k1=new Knjiga("Na Drini cuprija", a1, "12233665544", 1960, Zanr.ROMAN);
        Knjiga k2=new Knjiga("Otadzbina", a2, "558844666", 1970, Zanr.POEZIJA);
        Knjiga k3=new Knjiga("Kako vreme prolazi", a3, "669982555", 1950, Zanr.DETEKTIVSKI);
        
        autori.add(a1);
        autori.add(a2);
        autori.add(a3);
        
        knjige.add(k1);
        knjige.add(k2);
        knjige.add(k3);
    }

    public List<Knjiga> getKnjige() {
        return knjige;
    }

    public void setKnjige(List<Knjiga> knjige) {
        this.knjige = knjige;
    }

    public List<Autor> getAutori() {
        return autori;
    }

    public void setAutori(List<Autor> autori) {
        this.autori = autori;
    }

    public void obrisiRed(int selektovaniRed) {
        knjige.remove(selektovaniRed);
    }

    public void dodajKnjigu(Knjiga knjiga) {
        knjige.add(knjiga);
    }
    
    
    
    
}
