
//Jasmine Cecilia Putri Effendy 215150701111041

public class MerchantUB {

    private String namaMerchant, namaProduk;
    private double hargaMakanan;

        public MerchantUB (String namaMerchant, String namaProduk, double hargaMakanan){

            this.namaMerchant = namaMerchant;
            this.namaProduk = namaProduk;
            this.hargaMakanan = hargaMakanan;
        }

        public String getNamaMerchant() {
            return namaMerchant;
        }

        public void setNamaMerchant (String namaMerchant) {
            this.namaMerchant = namaMerchant;
        }

        public String getNamaProduk() {
            return namaProduk;
        }

        public void setNamaProduk (String namaProduk) {
            this.namaProduk = namaProduk;
        }

        public double getHargaMakanan() {
            return hargaMakanan;
        }

        public void setHargaMakanan (double hargaMakanan) {
            this.hargaMakanan = hargaMakanan;
        }
    }
