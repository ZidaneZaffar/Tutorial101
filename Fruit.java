public class Fruit {
	public String nama;
	public int harga;
	public boolean sudahPanen;
	
	public Fruit(String nama, int harga) {
		this.nama = nama;
		this.harga = harga;
		sudahPanen = false;
	}
	
	public String toString(){
		if (sudahPanen == true){
			return "Buah " + this.nama + ", harga: " + this.harga + " G, status: sudah dipanen"; 			
		}else{
			return "Buah " + this.nama + ", harga: " + this.harga + " G, status: belum dipanen";
		}
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public int getHarga() {
		return harga;
	}

	public void setHarga(int harga) {
		this.harga = harga;
	}

	public boolean isSudahPanen() {
		return sudahPanen;
	}

	public void setSudahPanen(boolean sudahPanen) {
		this.sudahPanen = sudahPanen;
	}
	

	
}