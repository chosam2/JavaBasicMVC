package service;

import java.util.Map;
import vo.MemberVO;

public interface IMemberService {

	/**
	 * 로그인을 위한 메서드
	 * @param params mem_id : 유저아이디, mem_pw : 유저 비밀번호
	 * @return 아이디와 비번이 일치하는 회원 정보
	 * @author 권준수
	 */
	MemberVO getMemberInfo(Map<String, String> params);
}
