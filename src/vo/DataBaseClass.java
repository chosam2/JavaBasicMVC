package vo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DataBaseClass {
	private static DataBaseClass db = null;
	
	private DataBaseClass(){
		
	}
	
	public static DataBaseClass getInstance() {
		if(db == null){
			db = new DataBaseClass();
		}
		return db;
	}
	
	List<MemberVO> memberList = new ArrayList<MemberVO>();
	
	{
		MemberVO mv1 = new MemberVO();
		mv1.setMem_id("a001");
		mv1.setMem_pw("asdfasdf");
		mv1.setMem_name("김은대");
		mv1.setMem_add("대전");
		mv1.setMem_ph("000000000");
		
		memberList.add(mv1);
	}

	public MemberVO getMemberInfo(Map<String, String> params) {
		String mem_id = params.get("mem_id");
		String mem_pw = params.get("mem_pw");
		
		MemberVO returnMemb = null;
		for (int i = 0; i < memberList.size(); i++) {
			MemberVO mv = memberList.get(i);
			if(mem_id.equals(mv.getMem_id()) && mem_pw.equals(mv.getMem_pw())){
				returnMemb = mv;
				break;
			}
		}
		return returnMemb;
	}

	
	
	
	
}
