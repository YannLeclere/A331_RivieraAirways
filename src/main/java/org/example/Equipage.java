public class Equipage {
    private Long id;
    private String nom;
    private Personnel pilote;
    private Personnel cdb;
    private List<Personnel> pnc;
    
    public Equipage(Long id, String nom, Personnel pilote, Personnel cdb, List<Personnel> pnc) {
            this.id = id;
            this.nom = nom;
            this.pilote = pilote;
            this.cdb = cdb; 
            this.pnc = pnc;               
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Personnel getPilote() {
        return pilote;
    }

    public void setPilote(Personnel pilote) {
        this.pilote = pilote;
    }

    public Personnel getCdb() {
        return cdb;
    }

    public void setCdb(Personnel cdb) {
        this.cdb = cdb;
    }

    public List<Personnel> getPnc() {
        return pnc;
    }

    public void setCdb(List<Personnel> pnc) {
        this.pnc = pnc;
    }
}
