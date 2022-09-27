package OnlineShop.OnlineShoppingMall.Categeries;

public class Electronics extends Product {
	int no = 1;
	int i;

	Electronics() {
		super();

	}

	Electronics(int i) {
		this();
		this.i = i;
	}

	{
		System.out.println(" In  Electronics you can see s ");
	}

	class Mobile extends Electronics {

		public static void mobile() {
			Electronics reftwo = new Electronics();

		}

	}

	class WashingMachine extends Electronics {
		public static void washingMachine() {
			Electronics reftwo = new Electronics();

		}

	}

}
