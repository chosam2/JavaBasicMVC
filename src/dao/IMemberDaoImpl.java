package dao;

import java.util.Map;

import vo.DataBaseClass;
import vo.MemberVO;

public class IMemberDaoImpl implements IMemberDao{
	private static IMemberDao dao = null;
	private DataBaseClass db = null;
	
	private IMemberDaoImpl() {
		db = DataBaseClass.getInstance();
	}
	
	public static IMemberDao getInstance() {
		if(dao == null){
			dao = new IMemberDaoImpl();
		}
		return dao;
	}

	@Override
	public MemberVO getMemberInfo(Map<String, String> params) {
		MemberVO mv = db.getMemberInfo(params);
		return mv;
	}
	
	
	
	
	
	
	
	
}
