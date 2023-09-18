public class Lancha {
    protected String name;
    public int dominio;
    public String coloString;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getDominio() {
        return dominio;
    }
    public void setDominio(int dominio) {
        this.dominio = dominio;
    }
    public String getColoString() {
        return coloString;
    }
    public void setColoString(String coloString) {
        this.coloString = coloString;
    }
    public Lancha(String name, int dominio, String coloString) {
        this.name = name;
        this.dominio = dominio;
        this.coloString = coloString;
    }
    

}



