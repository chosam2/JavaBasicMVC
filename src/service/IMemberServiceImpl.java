package service;

import java.util.Map;

import vo.MemberVO;
import dao.IMemberDao;
import dao.IMemberDaoImpl;

public class IMemberServiceImpl implements IMemberService{
	
	private static IMemberService service = null;
	private IMemberDao dao; 
	
	private IMemberServiceImpl(){
		dao = IMemberDaoImpl.getInstance();
	}

	public static IMemberService getInstance() {
		if(service == null){
			service = new IMemberServiceImpl();
		}
		return service;
	}

	@Override
	public MemberVO getMemberInfo(Map<String, String> params) {
		MemberVO mv = dao.getMemberInfo(params);
		return mv;
	}
	
	
	
	
	
	
	
}
