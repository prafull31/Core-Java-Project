package OnlineShop.OnlineShoppingMall.Categeries;

public class FootWear extends Product {
	int no = 1;
	int i;

	FootWear() {
		super();

	}

	FootWear(int i) {
		this();
		this.i = i;
	}

	

	class MensFootWear extends FootWear {

		public static void mensFootWear() {
			FootWear reftwo = new FootWear();
	
		}


	}

	class WomensFootWear extends FootWear {
		public static void womensFootWear() {
			FootWear reftwo = new FootWear();
			
		}

	}

}
