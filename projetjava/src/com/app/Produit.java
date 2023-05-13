package com.app;

public class Produit {
    String monProduit;
    Double prix;
    int qte;
    public Produit(String monProduit, Double prix, int qte) {
        this.monProduit = monProduit;
        this.prix = prix;
        this.qte = qte;
    }
    public String getMonProduit() {
        return monProduit;
    }
    public void setMonProduit(String monProduit) {
        this.monProduit = monProduit;
    }
    public Double getPrix() {
        return prix;
    }
    public void setPrix(Double prix) {
        this.prix = prix;
    }
    public int getQte() {
        return qte;
    }
    public void setQte(int qte) {
        this.qte = qte;
    }

    public String toString() {
        return "Produit [monProduit=" + monProduit + ", prix=" + prix + ", qte=" + qte + "]";
    }

    
    
}
