package OnlineShop.OnlineShoppingMall.Categeries;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Product clothes = new Product(1, "In clothes you have two type womens section and me section");
		Product electronics = new Product(2, "Here You can see mobile and washing machine");
		Product footwear = new Product(3, "Here you can see footwear for men and women");

		System.out.print("enter 7 for clothes 8 for foot wear 9 for electronics product:");

		Scanner sc = new Scanner(System.in);

		int input = sc.nextInt();

		if (input == 7) {

			System.out.println("Product type is:" + clothes.getPrice());
			System.out.println("Product id:" + clothes.getProductId());

			System.out.println("------------------------------------------------");

		} else if (input == 8) {
			System.out.println("Product type is:" + footwear.getPrice());
			System.out.println("Product id:" + footwear.getProductId());

			System.out.println("------------------------------------------------");

		} else if (input == 9) {
			System.out.println("Product type is:" + electronics.getPrice());
			System.out.println("Product id:" + electronics.getProductId());

			System.out.println("------------------------------------------------");

		}

		Product mc = new Product(11, "1000");
		Product wc = new Product(12, "1500");
		Product mf = new Product(13, "800");
		Product wf = new Product(14, "500");
		Product em1 = new Product(15, "10000");
		Product ewm1 = new Product(16, "30000");

		System.out.print("enter 1 for mens kurta 2 for women saree:");
		
		System.out.print("enter 3 for women footear like sandles 4 for men foot wear like shoes : ");

		System.out.print("enter 5 for mobile 6 for washing machine : ");

		int no = sc.nextInt();

		if (no == 1) {
			System.out.println("Kurta Price:" + mc.getPrice());
			System.out.println("Product id:" + mc.getProductId());
			System.out.println("The product colour is:" + Product.colour("Yellow"));


		} else if (no == 2) {
			System.out.println("saree Price:" + wc.getPrice());
			System.out.println("Product id:" + wc.getProductId());
			System.out.println("The product colour is:" + Product.colour("Red"));

		} else if (no == 3) {
			System.out.println("Women footwear - sandle Price:" + wf.getPrice());
			System.out.println("Product id:" + wf.getProductId());
			System.out.println("The product colour is:" + Product.colour("Grey"));
			

		} else if (no == 4) {
			System.out.println("Men footwear - shoes prce :" + mf.getPrice());
			System.out.println("Product id:" + mf.getProductId());
			System.out.println("The product colour is:" + Product.colour("White"));


		} else if (no == 5) {
			System.out.println("Mobile Price:" + em1.getPrice());
			System.out.println("Product id:" + em1.getProductId());
			System.out.println("The product colour is:" + Product.colour("Black"));
			

		} else if (no == 6) {
			System.out.println("Washing Machine Price:" + ewm1.getPrice());
			System.out.println("Product id:" + ewm1.getProductId());
			System.out.println("The product colour is:" + Product.colour("Silver"));
			

		}

	}

}
