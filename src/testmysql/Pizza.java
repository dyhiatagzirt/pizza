package testmysql;

public class Pizza {
	
	private String nroPizza;
	private String designPizza;
	private String tarifPizza;
	
	public Pizza(String nroPizza, String designPizza, String tarifPizza) {
		this.setNroPizza(nroPizza);
		this.setDesignPizza(designPizza);
		this.setTarifPizza(tarifPizza);
	}

	public String getNroPizza() {
		return nroPizza;
	}

	public void setNroPizza(String nroPizza) {
		this.nroPizza = nroPizza;
	}

	public String getDesignPizza() {
		return designPizza;
	}

	public void setDesignPizza(String designPizza) {
		this.designPizza = designPizza;
	}

	public String getTarifPizza() {
		return tarifPizza;
	}

	public void setTarifPizza(String tarifPizza) {
		this.tarifPizza = tarifPizza;
	}
	
   public String toString() {
        return ("Num�ro :"+this.getNroPizza() + " - Nom :"+ this.getDesignPizza() + " - Prix : "+ this.getTarifPizza() + "� \n");
   }


}
