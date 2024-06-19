package com.gn.view;

import java.util.Scanner;

import com.gn.controller.EmployeeController;
import com.gn.model.vo.Employee;

public class LibraryMenu {
	Scanner sc = new Scanner(System.in);
	public void mainMenu() {
		while(true) {
			System.out.println("=== 환영합니다 ===");
			System.out.println("1. 로그인");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 : ");
			String select = sc.nextLine();
			
			int menu = -1;
			try {
				menu=Integer.parseInt(select);
			} catch (Exception e) {
				System.out.println("숫자를 입력하세요");
			}
			
			switch(menu) {
			case -1: break;
			case 1: login();break;
			case 0: System.out.println("이용해주셔서 감사합니다.");return;
				default: System.out.println("다시 입력해주세요");break;
			}
		}
	}

	// 관리자 메뉴========================================================
	
	public void adminMenu() {
		System.out.println("=== 관리자 메뉴 ===");
		System.out.println("1. 직원 계정 생성");
		System.out.println("2. 직원 정보 수정");
		System.out.println("3. 퇴사 처리");
		System.out.println("0. 프로그램 종료");
		
	}
	
	
	// 사용자 메뉴========================================================
	
	public void userMenu() {
		
	}
	
	
	
	
	
	
	
	
	// 로그인 메뉴 =====================================================
	public void login() {
		System.out.println("=== 로그인 ===");
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pwd = sc.nextLine();
		new EmployeeController().login(id,pwd);
	}
	
		
	// ===============================================================
	
	public void loginAdmin(Employee e) {
		System.out.println(e.getEmployee_name()+"님 환영합니다!");
		adminMenu();
	}
	public void loginUser(Employee e) {
		System.out.println(e.getEmployee_name()+"님 환영합니다!");
		userMenu();
	}
	
		
		
		
	
	// 결과 출력 ===================
	public void displaySuccess(String work) {
		System.out.println("요청하신 "+work+"를(을) 성공적으로 수행하였습니다.");
	}
	public void displayFail(String work) {
		System.out.println("요청하신 "+work+" 수행중 오류가 발생하였습니다.");
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
