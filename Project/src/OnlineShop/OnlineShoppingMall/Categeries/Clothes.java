package OnlineShop.OnlineShoppingMall.Categeries;

public class Clothes extends Product {
	int no = 1;
	int i;

	Clothes() {
		super();

	}

	Clothes(int i) {
		this();
		this.i = i;
	}

	class MensClothes extends Clothes {

		public static void mensClothes() {
			Clothes reftwo = new Clothes();

		}

	}

	class WomensClothes extends Clothes {
		public static void womensClothes() {
			Clothes reftwo = new Clothes();
			System.out.println("womens clothes also have:" + reftwo.no);
		}

	}

}
