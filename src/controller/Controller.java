package controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import service.IMemberService;
import service.IMemberServiceImpl;
import vo.MemberVO;

public class Controller {
	private static IMemberService memberService = IMemberServiceImpl.getInstance();
	
	private static MemberVO sessionMember = null;
	
	public static void main(String[] args) {
		while(true){
			System.out.println("고객님 환영합니다.");
			System.out.println("진행하고자 하는 사항을 선택해 주세요");
			System.out.println("1.회원로그인");
			System.out.println("2.사업자로그인");
			System.out.println("3.회원가입");
			System.out.println("4.사업자가입");
			System.out.println("5.종료");
			
			Scanner sc = new Scanner(System.in);
			int select = 0;
			try {
				select = sc.nextInt();
			} catch (NumberFormatException e) {
				System.out.println("확마 숫자만 입력하라고");
				continue;
			}
			
			switch (select) {
			case 1:
				userLogin();
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			default :
				System.out.println("1~5까지만 선택하라고");
			}
		}
		
		
		
	}

	/**
	 * 회원 로그인을 위한 메서드
	 * @author 권준수
	 * @since 2019.03.30
	 * @see
	 */
	private static void userLogin() {
		System.out.println("회원 로그인을 위한 화면입니다.");
//		String mem_id = inputId();
		String mem_pw = inputPw();
		
		Map<String, String> params = new HashMap<String, String>();
//		params.put("mem_id", mem_id);
		params.put("mem_pw", mem_pw);
		
		//sql - userService
		// MemberVO getMemberInfo(Map<String, String> params);
		MemberVO memberInfo = memberService.getMemberInfo(params);
		if(memberInfo == null){
			System.out.println("해당 회원이 존재하지 않습니다.");
		}else{
			System.out.println(memberInfo.getMem_name()+"님 환영합니다.");
			sessionMember = memberInfo;
		}
		
		
	}

	/**
	 * 패스워드를 입력받기 위한 메서드
	 * @return
	 */
	private static String inputPw() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 아이디를 입력받기 위한 메서드
	 * @author 권준수
	 * @return
	 */
//	private static String inputId() {
//		String input = null;
//		while(true){
//			System.out.println("아이디를 입력해주세요");
//			Scanner sc = new Scanner(System.in);
//			input = sc.next();
//			//정규식
//			
//			//중복검사 sql - userService
//			// boolean checkId(String mem_id);
//		}
//		return input;
//	}
	
	
	
	
	
	
	
	
	
	
	
}
