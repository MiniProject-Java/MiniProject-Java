package com.pizza.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.pizza.model.vo.PaymentMenu;
import com.pizza.model.vo.PizzaMenu;
import com.pizza.model.vo.ToppingMenu;

public class PizzaMenuManager {

	private Scanner sc = new Scanner(System.in);
	boolean bool = true;
	int price = 0;
	int count = 0;
	int totalPrice = 0;

	private List<PizzaMenu> cart = new ArrayList<>();
	private List<PaymentMenu> order = new ArrayList<>();
	List<Object> joined = new ArrayList<Object>();
	
	PizzaMenu pizzaMenu = null;
	PizzaMenu pm = new PizzaMenu();
	
	public void AddSetMenu(String choiceSetMenu) {
		switch(choiceSetMenu) {
		case "1" :
			System.out.println("A 세트 추가 !");
			pizzaMenu = new PizzaMenu("1", "가","세트","A세트",20900);
			totalPrice += 20900;
			List<ToppingMenu> toppingList = toppingask();
			pizzaMenu.setToppings(toppingList);
			cart.add(pizzaMenu);
			break;
		case "2" :
			System.out.println("B 세트 추가 !");
			pizzaMenu = new PizzaMenu("2", "가","세트","B세트",17400);
			totalPrice += 17400;
			List<ToppingMenu> toppingList1 = toppingask();
			pizzaMenu.setToppings(toppingList1);
			cart.add(pizzaMenu);
			break;
		case "3" :
			System.out.println("C 세트 추가 !");
			pizzaMenu = new PizzaMenu("3", "가","세트","C세트",20900);
			totalPrice += 20900;
			List<ToppingMenu> toppingList2 = toppingask();
			pizzaMenu.setToppings(toppingList2);
			cart.add(pizzaMenu);
			break;
		case "4" :
			System.out.println("D 세트 추가 !");
			pizzaMenu = new PizzaMenu("4", "가","세트","D세트",19900);
			totalPrice += 19900;
			List<ToppingMenu> toppingList3 = toppingask();
			pizzaMenu.setToppings(toppingList3);
			cart.add(pizzaMenu);
			break;
		case "5" :
			System.out.println("E 세트 추가 !");
			pizzaMenu = new PizzaMenu("5", "가","세트","E세트",17900);
			totalPrice += 17900;
			List<ToppingMenu> toppingList4 = toppingask();
			pizzaMenu.setToppings(toppingList4);
			cart.add(pizzaMenu);
			break;
		case "0" : return;
		default : System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void AddSigleMenu(String choiceSingleMenu) {
		switch(choiceSingleMenu) {
		case "1" :
			System.out.println("불고기피자 추가 !");
			pizzaMenu = new PizzaMenu("1", "나","단품","불고기피자",16900);
			totalPrice += 16900;
			List<ToppingMenu> toppingList = toppingask();
			pizzaMenu.setToppings(toppingList);
			cart.add(pizzaMenu);
			break;
		case "2" :
			System.out.println("페퍼로니피자 추가 !");
			pizzaMenu = new PizzaMenu("2", "나","단품","페퍼로니피자",13900);
			totalPrice += 13900;
			List<ToppingMenu> toppingList1 = toppingask();
			pizzaMenu.setToppings(toppingList1);
			cart.add(pizzaMenu);
			break;
		case "3" :
			System.out.println("콤비네이션피자 추가 !");
			pizzaMenu = new PizzaMenu("3", "나","단품","콤비네이션피자",13900);
			totalPrice += 13900;
			List<ToppingMenu> toppingList2 = toppingask();
			pizzaMenu.setToppings(toppingList2);
			cart.add(pizzaMenu);
			break;
		case "4" :
			System.out.println("포테이토피자 추가 !");
			pizzaMenu = new PizzaMenu("4", "나","단품","포테이토피자",15900);
			totalPrice += 15900;
			List<ToppingMenu> toppingList3 = toppingask();
			pizzaMenu.setToppings(toppingList3);
			cart.add(pizzaMenu);
			break;
		case "5" :
			System.out.println("치즈피자 추가 !");
			pizzaMenu = new PizzaMenu("5", "나","단품","치즈피자",13900);
			totalPrice += 13900;
			List<ToppingMenu> toppingList4 = toppingask();
			pizzaMenu.setToppings(toppingList4);
			cart.add(pizzaMenu);
			break;
		case "0" : return;
		default : System.out.println("잘못 입력하셨습니다.");
		}
	}

	public void AddSideMenu(String choiceSideMenu) {
		switch(choiceSideMenu) {
		case "1" :
			System.out.println("치킨 텐더 추가 !");
			pizzaMenu = new PizzaMenu("1", "다","사이드","치킨 텐더",4000);
			totalPrice += 4000;
			cart.add(pizzaMenu);
			break;
		case "2" :
			System.out.println("웨지 감자 추가 !");
			cart.add(new PizzaMenu("2", "다","사이드","웨지 감자",3500));
			totalPrice += 3500;
			break;
		case "3" :
			System.out.println("버팔로 윙 추가 !");
			cart.add(new PizzaMenu("3", "다","사이드","버팔로 윙",6000));
			totalPrice += 6000;
			break;
		case "4" :
			System.out.println("스파게티 추가 !");
			cart.add(new PizzaMenu("4", "다","사이드","스파게티",5000));
			totalPrice += 5000;
			break;
		case "5" :
			System.out.println("치즈 볼 추가 !");
			cart.add(new PizzaMenu("5", "다","사이드","치즈 볼",4000));
			totalPrice += 4000;
			break;
		case "0" : return;
		default : System.out.println("잘못 입력하셨습니다.");
		}
	}

	public void AddDrinkMenu(String choiceDrinkMenu) {
		switch(choiceDrinkMenu) {
		case "1" :
			System.out.println("코카콜라 추가 !");
			cart.add(new PizzaMenu("1", "라","음료","코카콜라",1500));
			totalPrice += 1500;
			break;
		case "2" :
			System.out.println("사이다 추가 !");
			cart.add(new PizzaMenu("2", "라","음료","스프라이트",1500));
			totalPrice += 1500;
			break;
		case "3" :
			System.out.println("환타 추가 !");
			cart.add(new PizzaMenu("3", "라","음료","환타",1500));
			totalPrice += 1500;
			break;
		case "4" :
			System.out.println("제로 코카콜라 추가 !");
			cart.add(new PizzaMenu("4", "라","음료","제로 코카콜라",1500));
			totalPrice += 1500;
			break;
		case "0" : return;
		default : System.out.println("잘못 입력하셨습니다.");
		}
	}

	public void AddSauceMenu(String choiceSauceMenu) {
		switch(choiceSauceMenu) {
		case "1" :
			System.out.println("핫소스 추가 !");
			cart.add(new PizzaMenu("1", "마","소스","핫소스",200));
			totalPrice += 200;
			break;
		case "2" :
			System.out.println("갈릭소스 추가 !");
			cart.add(new PizzaMenu("2", "마","소스","갈릭소스",200));
			totalPrice += 200;
			break;
		case "3" :
			System.out.println("머스타드소스 추가 !");
			cart.add(new PizzaMenu("3", "마","소스","머스타드소스",200));
			totalPrice += 200;
			break;
		case "0" : return;
		default : System.out.println("잘못 입력하셨습니다.");
		}

	}

    public List<ToppingMenu> toppingask() {
        List<ToppingMenu> toppingList = new ArrayList<>();
        while(true) {
            System.out.print("==========================================================\n"
                    + "토핑을 추가하시겠습니까? y / n\n"
                    + "==========================================================\n"
                    + ">> ");
            String settoppingadd = sc.next();
            if(settoppingadd.equals("y")) {
                ToppingMenu topping = topping();
                if(topping != null)
                    toppingList.add(topping);
            } else if (settoppingadd.equals("n")){
                return toppingList.isEmpty() ? null : toppingList;            
            } else { 
                System.out.println("잘못 입력하셨습니다."); 
            }
        }
    }
	
//    public List<ToppingMenu> noneTopping() {
//    	nonetopping();
//    }
//    
//    public ToppingMenu nonetopping() {
//    	return new ToppingMenu("", "X", 0);
//    }

    
	public ToppingMenu topping() {
		
		String strToppingMenu = "==========================================================\n"
				+ "                         토핑 메뉴                           \n"
				+ "==========================================================\n"
				+ "1. 치즈-------------------------------------------1,500원\n"
				+ "2. 베이컨------------------------------------------1,500원\n"
				+ "3. 올리브----------------------------------------1,000원\n"
				+ "4. 불고기-------------------------------------------1,500원\n"
				+ "5. 페퍼로니------------------------------------------1,500원\n"
				+ "6. 포테이토----------------------------------------1,500원\n"
				+ "7. 토마토소스------------------------------------------1,000원\n"
				+ "8. 종합----------------------------------------8,000원\n"
				+ "==========================================================\n"
				+ "0. 취소\n"
				+ "==========================================================\n"
				+ ">> ";
		
		System.out.println(strToppingMenu);
		
		String choiceToppingMenu = sc.next();
		switch(choiceToppingMenu) {
		case "1" :
			System.out.println("치즈 토핑 추가!");
			totalPrice += 1500;
			return new ToppingMenu("1", "치즈", 1500);
		case "2" :
			System.out.println("베이컨 토핑 추가!");
			totalPrice += 1500;
			return new ToppingMenu("2", "베이컨", 1500);
		case "3" :
			System.out.println("올리브 토핑 추가!");
			totalPrice += 1500;
			return new ToppingMenu("3", "올리브", 1000);
		case "4" :
			System.out.println("불고기 토핑 추가!");
			totalPrice += 1500;
			return  new ToppingMenu("4", "불고기", 1500);
		case "5" :
			System.out.println("페퍼로니 토핑 추가!");
			totalPrice += 1500;
			return new ToppingMenu("5", "페퍼로니", 1500);
		case "6" :
			System.out.println("포테이토 토핑 추가!");
			totalPrice += 1500;
			return new ToppingMenu("6", "포테이토", 1500);
		case "7" :
			System.out.println("토마토소스 토핑 추가!");
			totalPrice += 1000;
			return new ToppingMenu("7", "토마토소스", 1000);
		case "8" :
			System.out.println("종합 토핑 추가!");
			totalPrice += 8000;
			return new ToppingMenu("8", "종합", 8000);
		case "0" : return null;
		default : System.out.println("잘못 입력하셨습니다.");
		}
		return null;
	}

	public void PrintCart() {
		for(int i = 0; i < cart.size(); i++) {
			System.out.println(cart.get(i));
		}
	}

	public void SortCart() {
		Collections.sort(cart);
		return;
	}

	public void TotalPirce() {
		System.out.println(totalPrice);
	}
	public void Packing() {
		totalPrice -= 3000;
		System.out.println(totalPrice + "원 포장 할인(3000원) 적용");
	}
	public void Deliver() {
		totalPrice += 3000;
		System.out.println(totalPrice + "원 배달비(3000원) 적용");
	}

	public boolean removeCart(String title) {
		for(int i = 0; i < cart.size(); i++) {
			if(title.equals(cart.get(i).getTitle())) {
				cart.remove(i); 
				return true;
			}
		}
		return false;
	}
	
	public void PaymentOrderWay_Packing() {
		order.add(new PaymentMenu("포장 주문"));
	}
	
	public void PaymentOrderWay_Deliver() {
		order.add(new PaymentMenu("배달 주문"));
	}
	
	public void joined() { // cart + order
		joined.addAll(cart);
		joined.add(0,order);
	}

	public void fileSave() {		
		int cartListSize = joined.size();
		Object cartArr[] = joined.toArray(new Object[cartListSize]);
		String str_Arr[] = new String[cartArr.length];
		
		for (int i=0;i<str_Arr.length;i++) {
			str_Arr[i]=cartArr[i].toString();
		
		}
		
		try(ObjectOutputStream oos = 
				new ObjectOutputStream(new BufferedOutputStream (new FileOutputStream("pizza.txt")));) {
			oos.writeObject(str_Arr);
				
		
		} catch(IOException e) {
			e.printStackTrace();
		} 
		System.out.println("pizza.txt 에 저장 완료!");
	}

	public void fileRead() {
		try(ObjectInputStream ois = 
				new ObjectInputStream(new BufferedInputStream(new FileInputStream("pizza.txt")));) {
		
			String str_Arr[] = (String[]) ois.readObject();
			
			for(String carts : str_Arr) {
				System.out.println(carts);
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		System.out.println("pizza.txt 읽기 완료!");
	}

}

