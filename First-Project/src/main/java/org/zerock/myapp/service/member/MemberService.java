package org.zerock.myapp.service.member;

import org.zerock.myapp.domain.MemberDTO;
import org.zerock.myapp.domain.MemberVO;

import java.util.List;

public interface MemberService {

    public abstract String findById(String name, String phone); // 아이디 찾기
    public abstract String findByPasswd(String id);// 비밀번호찾기
    public abstract void login(MemberDTO dto);// 로그인
    public abstract void join(MemberDTO dto);// 회원가입
    public abstract List<MemberVO> memberInfo(String num);// 마이페이지

}
